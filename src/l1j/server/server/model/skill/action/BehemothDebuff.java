package l1j.server.server.model.skill.action;

import l1j.server.Config;
import l1j.server.server.model.L1Character;
import l1j.server.server.model.L1Magic;
import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.model.skill.L1SkillActionHandler;
import l1j.server.server.serverpackets.spell.S_SpellBuffNoti;

public class BehemothDebuff extends L1SkillActionHandler {

	@Override
	public int start(L1Character attacker, L1Character cha, int time, L1Magic magic) {
		return 0;
	}

	@Override
	public void stop(L1Character cha) {
		if (cha instanceof L1PcInstance == false) {
			return;
		}
		L1PcInstance targetPc	= (L1PcInstance) cha;
		targetPc.addMoveSpeedDelayRate(Config.SPELL.BEHEMOTH_MOVE_SPEED_RATE);
		targetPc.sendPackets(new S_SpellBuffNoti(targetPc, _skillId, false, 0), true);
	}
	
	@Override
	public void icon(L1PcInstance pc, int time) {
	}
	
	@Override
	public void wrap(L1PcInstance pc, boolean flag) {
		super.wrap(pc, flag);
	}
	
	@Override
	public L1SkillActionHandler copyInstance() {
		return new BehemothDebuff().setValue(_skillId, _skill);
	}

}
