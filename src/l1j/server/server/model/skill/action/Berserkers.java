package l1j.server.server.model.skill.action;

import l1j.server.server.model.L1Character;
import l1j.server.server.model.L1Magic;
import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.model.skill.L1SkillActionHandler;
import l1j.server.server.serverpackets.spell.S_SpellBuffNoti;

public class Berserkers extends L1SkillActionHandler {

	@Override
	public int start(L1Character attacker, L1Character cha, int time, L1Magic magic) {
		if (attacker == null) {
			return 0;
		}
		cha.getAbility().addShortHitup(8);
		cha.getAbility().addShortDmgup(2);
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			if (cha.getId() != attacker.getId()) {
				pc.setBerserkersAC(10);
				cha.getAC().addAc(pc.getBerserkersAC());
			}
			pc.sendPackets(new S_SpellBuffNoti(pc, _skillId, true, time), true);
		}
		return 0;
	}

	@Override
	public void stop(L1Character cha) {
		cha.getAbility().addShortHitup(-8);
		cha.getAbility().addShortDmgup(-2);
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			if (pc.getBerserkersAC() != 0) {
				pc.getAC().addAc(-pc.getBerserkersAC());
				pc.setBerserkersAC(0);
			}
			pc.sendPackets(new S_SpellBuffNoti(pc, _skillId, false, -1), true);
		}
	}
	
	@Override
	public void icon(L1PcInstance pc, int time) {
		pc.sendPackets(new S_SpellBuffNoti(pc, _skillId, true, time), true);
	}
	
	@Override
	public void wrap(L1PcInstance pc, boolean flag) {
		super.wrap(pc, flag);
	}
	
	@Override
	public L1SkillActionHandler copyInstance() {
		return new Berserkers().setValue(_skillId, _skill);
	}

}

