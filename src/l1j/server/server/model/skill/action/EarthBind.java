package l1j.server.server.model.skill.action;

import l1j.server.server.model.L1Character;
import l1j.server.server.model.L1Magic;
import l1j.server.server.model.Instance.L1MonsterInstance;
import l1j.server.server.model.Instance.L1NpcInstance;
import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.model.Instance.L1PeopleInstance;
import l1j.server.server.model.Instance.L1PetInstance;
import l1j.server.server.model.Instance.L1SummonInstance;
import l1j.server.server.model.skill.L1SkillActionHandler;
import l1j.server.server.serverpackets.S_Paralysis;
import l1j.server.server.serverpackets.S_Poison;
import l1j.server.server.utils.CommonUtil;

public class EarthBind extends L1SkillActionHandler {

	@Override
	public int start(L1Character attacker, L1Character cha, int time, L1Magic magic) {
		int changeBuffDuration = CommonUtil.randomIntChoice(EARTH_BIND_ARRAY);
		if (attacker.getAbility().getStrangeTimeIncrease() > 0) {
			changeBuffDuration += attacker.getAbility().getStrangeTimeIncrease();
		}
		if (cha.getAbility().getStrangeTimeDecrease() > 0) {
			changeBuffDuration -= cha.getAbility().getStrangeTimeDecrease();
		}
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			pc.broadcastPacketWithMe(new S_Poison(pc.getId(), 2), true);
			pc.sendPackets(S_Paralysis.FREEZE_ON);
		} else if (cha instanceof L1MonsterInstance || cha instanceof L1SummonInstance || cha instanceof L1PetInstance || cha instanceof L1PeopleInstance) {
			L1NpcInstance npc = (L1NpcInstance) cha;
			npc.broadcastPacket(new S_Poison(npc.getId(), 2), true);
			npc.setParalyzed(true);
			npc.setParalysisTime(changeBuffDuration);
		}
		return changeBuffDuration;
	}

	@Override
	public void stop(L1Character cha) {
		if (cha instanceof L1PcInstance) {
			L1PcInstance pc = (L1PcInstance) cha;
			pc.broadcastPacketWithMe(new S_Poison(pc.getId(), 0), true);
			pc.sendPackets(S_Paralysis.FREEZE_OFF);
		} else if (cha instanceof L1MonsterInstance || cha instanceof L1SummonInstance || cha instanceof L1PetInstance) {
			L1NpcInstance npc = (L1NpcInstance) cha;
			npc.broadcastPacket(new S_Poison(npc.getId(), 0), true);
			npc.setParalyzed(false);
		}
	}
	
	@Override
	public void icon(L1PcInstance pc, int time) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void wrap(L1PcInstance pc, boolean flag) {
		super.wrap(pc, flag);
	}
	
	@Override
	public L1SkillActionHandler copyInstance() {
		return new EarthBind().setValue(_skillId, _skill);
	}

}

