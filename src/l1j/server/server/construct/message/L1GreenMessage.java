package l1j.server.server.construct.message;

import l1j.server.server.serverpackets.message.S_SystemMessage;
import l1j.server.server.serverpackets.S_PacketBox;

public class L1GreenMessage {
//AUTO SRM: 	public static final S_PacketBox DEVIL_OPEN_MENT			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "악마왕의 영토가 열렸습니다."); // CHECKED OK
	public static final S_PacketBox DEVIL_OPEN_MENT			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(750));
//AUTO SRM: 	public static final S_PacketBox DEVIL_END_MENT			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "악마왕의 영토가 닫혔습니다."); // CHECKED OK
	public static final S_PacketBox DEVIL_END_MENT			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(751));
//AUTO SRM: 	public static final S_PacketBox ISLAND_OPEN_MENT		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "이스발: 잊혀진 섬이 열렷습니다."); // CHECKED OK
	public static final S_PacketBox ISLAND_OPEN_MENT		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(752));
//AUTO SRM: 	public static final S_PacketBox ISLAND_END_MENT			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "이스발: 잊혀진 섬이 닫혓습니다."); // CHECKED OK
	public static final S_PacketBox ISLAND_END_MENT			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(753));
//AUTO SRM: 	public static final S_PacketBox DOMINATION_OPEN_MENT	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "지배의 균열이 연결되었습니다."); // CHECKED OK
	public static final S_PacketBox DOMINATION_OPEN_MENT	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(754));
//AUTO SRM: 	public static final S_PacketBox DOMINATION_END_MENT		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "지배의 균열이 끊어졌습니다."); // CHECKED OK
	public static final S_PacketBox DOMINATION_END_MENT		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(755));
//AUTO SRM: 	public static final S_PacketBox BLACK_DRAGON_OPEN_MENT	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "암흑룡의 던전이 개방되었습니다."); // CHECKED OK
	public static final S_PacketBox BLACK_DRAGON_OPEN_MENT	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(756));
//AUTO SRM: 	public static final S_PacketBox BLACK_DRAGON_END_MENT	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "암흑룡의 던전이 종료되었습니다."); // CHECKED OK
	public static final S_PacketBox BLACK_DRAGON_END_MENT	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(757));
	public static final S_PacketBox OMAN_CRACK_END_MENT		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$33545");// 오만의 탑으로부터 수상한 그림자가 달아났습니다.
	public static final S_PacketBox ISLAND_NIGHT_SPAWN_MENT	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$37268");// 어딘가에서 음산한 기운이 느껴집니다.
//AUTO SRM: 	public static final S_PacketBox PCCAFE_BUFF_END			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[PC방 상품 종료 안내] PC방 이용 시간이 종료되었습니다."); // CHECKED OK
	public static final S_PacketBox PCCAFE_BUFF_END			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(758));
//AUTO SRM: 	public static final S_PacketBox SECURITY_BUFF_EXPLAN	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[명령어] .고정신청 설정시 보안 버프 발동."); // CHECKED OK
	public static final S_PacketBox SECURITY_BUFF_EXPLAN	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(759));
//AUTO SRM: 	public static final S_PacketBox STANBY_EXP_EMPTY_MSG	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "현재 오픈대기 상태로 경험치가 없습니다."); // CHECKED OK
	public static final S_PacketBox STANBY_EXP_EMPTY_MSG	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(760));
//AUTO SRM: 	public static final S_PacketBox SAFTY_MODE_PANALTY_MSG	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "현재 보호 모드상태로 패널티를 받지 않습니다."); // CHECKED OK
	public static final S_PacketBox SAFTY_MODE_PANALTY_MSG	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(761));
	public static final S_PacketBox DRAGON_RAID_START		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31705");// 어딘가에 드래곤의 힘이 느껴집니다.
//AUTO SRM: 	public static final S_PacketBox BARLOG_SPAWN			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "발록이 출현하여 마을로 이동됩니다."); // CHECKED OK
	public static final S_PacketBox BARLOG_SPAWN			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(762));
	public static final S_PacketBox OMAN_REAPER_SPAWN		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$10976");// 목숨이 아깝다면.. 지금 도망가도 좋다.. 그 꼴을 보는 것도 재밌겠군..
	public static final S_PacketBox LEFT_SASIN_SPAWN		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "\\a:$27679");
	public static final S_PacketBox RIGHT_SASIN_SPAWN		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "\\a9$27689");
	public static final S_PacketBox REAPER_SPAWN_MENT		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "\\a9$27699");
	public static final S_PacketBox REAPER_DIE_MENT_1		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$25732");// 그림리퍼의 지배력은 완전히 소멸되지 않앗으며 조만간 회복될 것입니다
	public static final S_PacketBox REAPER_DIE_MENT_2		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$25728");// 리퍼의 제단에 있는 영웅들은 10분후에 시작지점으로 이동됩니다.
	public static final S_PacketBox REAPER_DIE_MENT_3		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$25729");// 리퍼의 제단에 있는 영웅들은 5분후에 시작지점으로 이동됩니다.
	public static final S_PacketBox REAPER_DIE_MENT_4		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$25730");// 리퍼의 제단에 있는 영웅들은 1분후에 시작지점으로 이동됩니다.
	public static final S_PacketBox REAPER_DIE_MENT_5		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$25731");// 리퍼의 제단에 있는 영웅들은 30초 후에 시작지점으로 이동됩니다.
//AUTO SRM: 	public static final S_PacketBox REAPER_DIE_MENT_6		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "리퍼의 제단에 있는 영웅들은 시작지점으로 이동됩니다."); // CHECKED OK
	public static final S_PacketBox REAPER_DIE_MENT_6		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(763));
	public static final S_PacketBox ORIM_MENT_1				=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30298");//	중앙에 있는 수정구를 보호하세요.
	public static final S_PacketBox ORIM_MENT_2				=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30299");//	시간이 초과되거나 수정구가 파괴되면 실패입니다.
	public static final S_PacketBox ORIM_MENT_3				=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30300");//	오림이 당신에게 작은 힘을 보탭니다.
	public static final S_PacketBox ORIM_MENT_4				=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30292");//	저주받은 무리가 몰려오기 시작합니다.
	public static final S_PacketBox ORIM_MENT_5				=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30296");//	모든 공격을 막아냈습니다.
	public static final S_PacketBox ORIM_MENT_6				=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30311");//	오림을 돕는데 성공하였습니다.
	public static final S_PacketBox ORIM_MENT_7				=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30303");//	오림 앞에 생성된 텔레포트 마법진으로 이동하세요.
	public static final S_PacketBox ORIM_MENT_8				=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30313");//	당신의 앞 날에 아인하사드의 축복이 있기를..
	public static final S_PacketBox ORIM_MENT_9				=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30304");//	이제 당신의 세계로 돌아가십시오.
	public static final S_PacketBox ORIM_MENT_10			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30301");//	저주받은 안개는 심각한 오염 피해를 줍니다.
	public static final S_PacketBox ORIM_MENT_11			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30294");// 저주의 기운이 더욱 더 거세지고 있습니다. 
	public static final S_PacketBox ORIM_MENT_12			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30293");// 이제 다음 공격을 대비해주세요.
	public static final S_PacketBox ORIM_MENT_13			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30314");// 오림의 눈물이... 화염의 벽을 잠재웁니다...
	public static final S_PacketBox ORIM_MENT_14			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30315");// 벽 너머에는 저주를 소환하는 슬픈 사제들이 있습니다.
	public static final S_PacketBox ORIM_MENT_15			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30302");//	저주받은 기운이 다가오기 시작합니다.
	public static final S_PacketBox ORIM_MENT_16			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30308");//	아..아.. 수정구가 파괴되었습니다...
	public static final S_PacketBox ORIM_MENT_17			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30316");//	세마.. 미안해..
	public static final S_PacketBox ORIM_MENT_18			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30317");//	화염의 몬스터 소환이 멈췄습니다.
	public static final S_PacketBox ORIM_MENT_19			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30320");//	발터자르.. 그 고통에서 널 구해줄게..
	public static final S_PacketBox ORIM_MENT_20			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30323");//	대지의 몬스터 소환이 멈췄습니다.
	public static final S_PacketBox ORIM_MENT_21			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30318");//	메르키오르.. 조금만 기다려..
	public static final S_PacketBox ORIM_MENT_22			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30319");//	심해의 몬스터 소환이 멈췄습니다.
	public static final S_PacketBox ORIM_MENT_23			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30322");//	카스파.. 진실을 알게 될거야..
	public static final S_PacketBox ORIM_MENT_24			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30321");//	풍랑의 몬스터 소환이 멈췄습니다.
	public static final S_PacketBox ORIM_MENT_25			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30297");//	으어어어어 괴물이다아아아아아
	public static final S_PacketBox CROCODILE_MENT_1		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31672");// 이제 곧 괴물들이 몰려 올 것일세
	public static final S_PacketBox CROCODILE_MENT_2		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31673");// 각오를 단단히 하는 것이 좋을 것이야
	public static final S_PacketBox CROCODILE_MENT_3		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31666");// 동쪽 끝 등대를 찾아가게. 그 곳을 통하여 지하수로에 갈 수 있다네
	public static final S_PacketBox CROCODILE_MENT_4		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31667");// 수로의 끝은 악어섬과 연결되어 있지
	public static final S_PacketBox CROCODILE_MENT_5		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31668");// 그 발걸음을 멈추지 않겠다면 굳이 막아서지는 않겠네만... 조심하게
	public static final S_PacketBox CROCODILE_MENT_6		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31669");// 수 십년간 우리조차 접근하기 꺼려했던 곳을 기어코 가려하는가
	public static final S_PacketBox CROCODILE_MENT_7		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31670");// 이 곳은 괴물이 되어버린 악어왕 로서스가 봉인되어 있는 곳일세
	public static final S_PacketBox CROCODILE_MENT_8		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31671");// 부디 그대에게 신의 가호가 함께 하길...
	public static final S_PacketBox CROCODILE_MENT_9		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31676");// 수고했네. 그대 덕분에 당분간은 평화롭겠군.
	public static final S_PacketBox CROCODILE_MENT_10		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31677");// 이제 그대의 세계로 돌아가도록 하게.
	public static final S_PacketBox CROCODILE_MENT_11		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31873");// 이런, 이 곳에 머무를 수 있는 시간이 다 되었네
	public static final S_PacketBox CROCODILE_MENT_12		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31873");// 아쉽지만 그대가 있던 곳으로 돌아가도록 하게
	public static final S_PacketBox CROCODILE_MENT_13		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31674");// 아아... 나의 욕심 때문에 그대마저 잃게 되었군.
	public static final S_PacketBox CROCODILE_MENT_14		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31675");// 그대의 세계로 돌아가 편히 쉬시게.
	public static final S_PacketBox FANTASY_MENT_1			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$32236");//	각 속성방에 있는 대정령의 처치하세요
	public static final S_PacketBox FANTASY_MENT_2			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30304");//	이제 당신의 세계로 돌아가십시오.
	public static final S_PacketBox INDUN_CLOSE_MENT		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30309");//	시공 여행이 종료 됩니다.
	public static final S_PacketBox INDUN_CLOSE_MENT_2		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30310");//	다음에 다시 도전해주세요.
	public static final S_PacketBox INDUN_CLOSE_MENT_3		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30312");//	이제 시공 여행이 종료됩니다.
	public static final S_PacketBox INDUN_PARTY_DEATH		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$30305");//	모든 파티원이 사망하였습니다.
	public static final S_PacketBox ANTQUEEN_DIE_MENT_1		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31964");// 여왕개미를 물리쳤습니다. 1분 후 여왕개미의 방이 무너집니다.
	public static final S_PacketBox ANTQUEEN_DIE_MENT_2		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$31965");// 방이 무너지기 전에 정비를 마치고 주둔지로 귀환해주세요.
//AUTO SRM: 	public static final S_PacketBox DRAGON_DUNGEON_TRANS	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "탐욕스런 자들이여..그 끝을 알게되리라."); // CHECKED OK
	public static final S_PacketBox DRAGON_DUNGEON_TRANS	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(764));
	public static final S_PacketBox OMAN_CRACK_OPEN_MSG		=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$33619");// 이 곳 어딘가에 알 수 없는 균열이 발생하였습니다.
	public static final S_PacketBox SANDWARM_SPAWN			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$16793");// 이 진동은..!! 사막에 샌드 웜이 나타났나봐요!
//AUTO SRM: 	public static final S_PacketBox RAZARUS_SPAWN			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "라자루스가 출현하였습니다."); // CHECKED OK
	public static final S_PacketBox RAZARUS_SPAWN			=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(765));
	public static final S_PacketBox FANTASY_SOUL_WAND_DROP	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "$17968");// 대정령의 떨어뜨린 정화 막대를 획득하였습니다. 위험한 상황에 사용하세요.
//AUTO SRM: 	public static final S_PacketBox INDUN_GERENG_FIRE_ITEM	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "** 희망의 불꽃을 획득하였습니다. 게렝에게 시공의 막대를 지급받으세요 **"); // CHECKED OK
	public static final S_PacketBox INDUN_GERENG_FIRE_ITEM	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(766));
//AUTO SRM: 	public static final S_PacketBox INDUN_GERENG_FIRE_BOX	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "** 인벤토리에 지급받은 화염의 상자를 확인하세요 **"); // CHECKED OK
	public static final S_PacketBox INDUN_GERENG_FIRE_BOX	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(767));
//AUTO SRM: 	public static final S_PacketBox INDUN_GERENG_WATER_BOX	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "** 인벤토리에 지급받은 혹한의 상자를 확인하세요 **"); // CHECKED OK
	public static final S_PacketBox INDUN_GERENG_WATER_BOX	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(768));
//AUTO SRM: 	public static final S_PacketBox INDUN_GERENG_WIND_BOX	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "** 인벤토리에 지급받은 섬광의 상자를 확인하세요 **"); // CHECKED OK
	public static final S_PacketBox INDUN_GERENG_WIND_BOX	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(769));
//AUTO SRM: 	public static final S_PacketBox ARRESTED_AURAKIA_ATTACK	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "획득한 스킬을 사용하여 아우라키아 구속구를 파괴하십시오."); // CHECKED OK
	public static final S_PacketBox ARRESTED_AURAKIA_ATTACK	=	new S_PacketBox(S_PacketBox.GREEN_MESSAGE,S_SystemMessage.getRefText(770));
}

