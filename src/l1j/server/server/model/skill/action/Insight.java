package l1j.server.server.model.skill.action;

import l1j.server.server.model.L1Character;
import l1j.server.server.model.L1Magic;
import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.model.skill.L1SkillActionHandler;
import l1j.server.server.serverpackets.S_OwnCharAttrDef;
import l1j.server.server.serverpackets.S_OwnCharStatus;
import l1j.server.server.serverpackets.S_OwnCharStatus2;
import l1j.server.server.serverpackets.S_SPMR;

public class Insight extends L1SkillActionHandler {

	@Override
	public int start(L1Character attacker, L1Character cha, int time, L1Magic magic) {
		cha.getAbility().addAddedStr((byte) 1);
		cha.getAbility().addAddedDex((byte) 1);
		cha.getAbility().addAddedCon((byte) 1);
		cha.getAbility().addAddedInt((byte) 1);
		cha.getAbility().addAddedWis((byte) 1);
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			pc.resetBaseMr();
		}
		return 0;
	}

	@Override
	public void stop(L1Character cha) {
		cha.getAbility().addAddedStr((byte) -1);
		cha.getAbility().addAddedDex((byte) -1);
		cha.getAbility().addAddedCon((byte) -1);
		cha.getAbility().addAddedInt((byte) -1);
		cha.getAbility().addAddedWis((byte) -1);
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			pc.resetBaseMr();
		}
	}
	
	@Override
	public void icon(L1PcInstance pc, int time) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void wrap(L1PcInstance pc, boolean flag) {
		pc.sendPackets(new S_OwnCharStatus(pc), true);
		pc.sendPackets(new S_OwnCharStatus2(pc), true);
		pc.sendPackets(new S_OwnCharAttrDef(pc), true);
		pc.sendPackets(new S_SPMR(pc), true);
		super.wrap(pc, flag);
	}
	
	@Override
	public L1SkillActionHandler copyInstance() {
		return new Insight().setValue(_skillId, _skill);
	}

}

