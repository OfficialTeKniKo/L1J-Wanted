package l1j.server.server.model.skill.action;

import l1j.server.server.model.L1Character;
import l1j.server.server.model.L1Magic;
import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.model.skill.L1SkillActionHandler;
import l1j.server.server.serverpackets.S_SkillBrave;

public class SandStorm extends L1SkillActionHandler {

	@Override
	public int start(L1Character attacker, L1Character cha, int time, L1Magic magic) {
		cha.getMoveState().setBraveSpeed(6);
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			pc.sendPackets(new S_SkillBrave(pc.getId(), 1, time), true);
			pc.broadcastPacket(new S_SkillBrave(pc.getId(), 1, 0), true);
		}
		return 0;
	}

	@Override
	public void stop(L1Character cha) {
		cha.getMoveState().setBraveSpeed(0);
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			pc.broadcastPacketWithMe(new S_SkillBrave(pc.getId(), 0, 0), true);
		}
	}
	
	@Override
	public void icon(L1PcInstance pc, int time) {
		pc.sendPackets(new S_SkillBrave(pc.getId(), 1, time), true);
		pc.broadcastPacket(new S_SkillBrave(pc.getId(), 1, 0), true);
	}
	
	@Override
	public void wrap(L1PcInstance pc, boolean flag) {
		super.wrap(pc, flag);
	}
	
	@Override
	public L1SkillActionHandler copyInstance() {
		return new SandStorm().setValue(_skillId, _skill);
	}

}

