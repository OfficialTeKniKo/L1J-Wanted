package l1j.server.server.datatables;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import l1j.server.L1DatabaseFactory;
import l1j.server.server.model.L1UbPattern;
import l1j.server.server.model.L1UbSpawn;
import l1j.server.server.templates.L1Npc;
import l1j.server.server.utils.SQLUtil;

public class UBSpawnTable {
	private static Logger _log = Logger.getLogger(UBSpawnTable.class.getName());

	private static UBSpawnTable _instance;

	private HashMap<Integer, L1UbSpawn> _spawnTable = new HashMap<Integer, L1UbSpawn>();;

	public static UBSpawnTable getInstance() {
		if (_instance == null) {
			_instance = new UBSpawnTable();
		}
		return _instance;
	}

	private UBSpawnTable() {
		loadSpawnTable();
	}

	private void loadSpawnTable() {
		java.sql.Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = L1DatabaseFactory.getInstance().getConnection();
			pstm = con.prepareStatement("SELECT * FROM spawnlist_ub");
			rs = pstm.executeQuery();
			L1Npc npcTemp = null;
			L1UbSpawn spawnDat = null;
			while(rs.next()){
				npcTemp = NpcTable.getInstance().getTemplate(rs.getInt(6));
				if (npcTemp == null) {
					continue;
				}
				spawnDat = new L1UbSpawn();
				spawnDat.setId(rs.getInt(1));
				spawnDat.setUbId(rs.getInt(2));
				spawnDat.setPattern(rs.getInt(3));
				spawnDat.setGroup(rs.getInt(4));
				//spawnDat.setName(npcTemp.getDescKr());
				spawnDat.setName(npcTemp.getDescEn());
				spawnDat.setNpcTemplateId(rs.getInt(6));
				spawnDat.setAmount(rs.getInt(7));
				spawnDat.setSpawnDelay(rs.getInt(8));
				spawnDat.setSealCount(rs.getInt(9));
				spawnDat.setBoss(Boolean.valueOf(rs.getString("isBoss")));
				spawnDat.setGateKeeper(Boolean.valueOf(rs.getString("isGateKeeper")));
				_spawnTable.put(spawnDat.getId(), spawnDat);
			}
		} catch (SQLException e) {
			// problem with initializing spawn, go to next one
			_log.warning("spawn couldnt be initialized:" + e);
		} finally {
			SQLUtil.close(rs, pstm, con);
		}
		//_log.config("UBmonster 배치 리스트 " + _spawnTable.size() + "건 로드");
		_log.config("UBmonster batch list " + _spawnTable.size() + " entries loaded");
	}

	public L1UbSpawn getSpawn(int spawnId) {
		return _spawnTable.get(spawnId);
	}

	public int getMaxPattern(int ubId) {
		java.sql.Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = L1DatabaseFactory.getInstance().getConnection();
			pstm = con.prepareStatement("SELECT MAX(pattern) FROM spawnlist_ub WHERE ub_id=?");
			pstm.setInt(1, ubId);
			rs = pstm.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(rs, pstm, con);
		}
		return 0;
	}

	public L1UbPattern getPattern(int ubId, int patternNumer) {
		L1UbPattern pattern = new L1UbPattern();
		for (L1UbSpawn spawn : _spawnTable.values()) {
			if (spawn.getUbId() == ubId && spawn.getPattern() == patternNumer) {
				pattern.addSpawn(spawn.getGroup(), spawn);
			}
		}
		pattern.freeze();
		return pattern;
	}
}

