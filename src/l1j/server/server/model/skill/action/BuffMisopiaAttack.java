package l1j.server.server.model.skill.action;

import l1j.server.server.model.L1Character;
import l1j.server.server.model.L1Magic;
import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.model.skill.L1SkillActionHandler;
import l1j.server.server.serverpackets.S_OwnCharStatus;
import l1j.server.server.serverpackets.S_SPMR;
import l1j.server.server.serverpackets.spell.S_SpellBuffNoti;

public class BuffMisopiaAttack extends L1SkillActionHandler {

	@Override
	public int start(L1Character attacker, L1Character cha, int time, L1Magic magic) {
		cha.getAbility().addShortDmgup(3);
		cha.getAbility().addLongDmgup(3);
		cha.getAbility().addSp(2);
		cha.addMaxMp(50);
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			pc.addMpRegen(2);
			pc.sendPackets(new S_SpellBuffNoti(pc, _skillId, true, time), true);
		}
		return 0;
	}

	@Override
	public void stop(L1Character cha) {
		cha.getAbility().addShortDmgup(-3);
		cha.getAbility().addLongDmgup(-3);
		cha.getAbility().addSp(-2);
		cha.addMaxMp(-50);
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			pc.addMpRegen(-2);
		}
	}
	
	@Override
	public void icon(L1PcInstance pc, int time) {
		pc.sendPackets(new S_SpellBuffNoti(pc, _skillId, true, time), true);
	}
	
	@Override
	public void wrap(L1PcInstance pc, boolean flag) {
		pc.sendPackets(new S_OwnCharStatus(pc), true);
		pc.sendPackets(new S_SPMR(pc), true);
		super.wrap(pc, flag);
	}
	
	@Override
	public L1SkillActionHandler copyInstance() {
		return new BuffMisopiaAttack().setValue(_skillId, _skill);
	}

}

