package l1j.server.server.construct.skill;

import l1j.server.server.model.skill.L1SkillId;

public class L1SkillInfo extends L1SkillId {
	public static final int[] TOWN_BUFF_ARRAY 			= { PHYSICAL_ENCHANT_DEX, REMOVE_CURSE, PHYSICAL_ENCHANT_STR, BLESS_WEAPON };
	public static final int[] WAR_BUFF_ARRAY 			= { PHYSICAL_ENCHANT_DEX, REMOVE_CURSE, PHYSICAL_ENCHANT_STR, BLESS_WEAPON, HASTE, IRON_SKIN, AQUA_PROTECTER, PATIENCE, INSIGHT, EARTH_WEAPON };
	public static final int[] CASTLE_BUFF_ARRAY			= { PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR, BLESS_WEAPON, IRON_SKIN, BURNING_WEAPON, SHINING_SHIELD, EXOTIC_VITALIZE };
	public static final int[] DRAGON_STATUE_BUFF_ARRAY 	= { PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR, BLESS_WEAPON, BUFF_MISOPIA_GROW, BUFF_MISOPIA_DEFFENS, BUFF_MISOPIA_ATTACK };
	public static final int[] LEVEL90_STATUE_BUFF_ARRAY	= { PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR, BLESS_WEAPON, HASTE, NATURES_TOUCH, IRON_SKIN };
	public static final int[] HIGHT_DAILY_BUFF_ARRAY 	= { HASTE, IRON_SKIN, AQUA_PROTECTER, CONCENTRATION, INSIGHT };
	public static final int[] HIDDEN_VALIGE_BUFF_ARRAY	= { HASTE, FULL_HEAL };
	public static final int[] PCCAFE_BUFF_ARRAY			= { PHYSICAL_ENCHANT_DEX, REMOVE_CURSE, PHYSICAL_ENCHANT_STR, BLESS_WEAPON, BUFF_PCCAFE_EXP };
	
	public static final int[] GM_BUFF_NORMAL_ARRAY		= { PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR, BLESS_WEAPON, IRON_SKIN, LIFE_MAAN, BUFF_BLACK_SAND };
	public static final int[] GM_BUFF_DISPLAY_ARRAY		= { PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR, BLESS_WEAPON, IRON_SKIN, NATURES_TOUCH, INSIGHT };
	public static final int[] GM_BUFF_ALL_ARRAY			= { DECREASE_WEIGHT, PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR, BLESS_WEAPON, BERSERKERS, REDUCTION_ARMOR, BOUNCE_ATTACK, DOUBLE_BRAKE, UNCANNY_DODGE, RESIST_MAGIC, CLEAR_MIND, AQUA_PROTECTER, BURNING_WEAPON, IRON_SKIN, EXOTIC_VITALIZE, SOUL_OF_FLAME, CONCENTRATION, INSIGHT, IllUSION_AVATAR };
	
	public static final int[] ART_MAAN_BUFF_ARRAY		= { PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR, BLESS_WEAPON };
	public static final int[] GREAT_WARRIOR_BUFF_ARRAY	= { PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR };
	
	public static final int[] TARAS_NORMAL_BUFF_ARRAY	= { PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR, BLESS_WEAPON };
	public static final int[] TARAS_HIGHT_BUFF_ARRAY	= { BUFF_TARAS_HIGHT_MAGIC, BLESS_WEAPON, HASTE };
	
	public static final int[] SHOCK_STUN_ARRAY_1		= { 3000 };
	public static final int[] SHOCK_STUN_ARRAY_2		= { 3000, 3000, 4000 };
	public static final int[] SHOCK_STUN_ARRAY_3		= { 3000, 3000, 4000, 5000 };
	public static final int[] SHOCK_STUN_ARRAY_4		= { 3000, 3000, 4000, 4000, 5000, 6000 };
	
	public static final int[] FORCE_STUN_ARRAY_1		= { 3000, 4000, 4000, 5000 };
	public static final int[] FORCE_STUN_ARRAY_2		= { 3000, 4000, 5000, 5000, 6000 };
	public static final int[] FORCE_STUN_ARRAY_3		= { 3000, 4000, 5000, 5000, 6000, 6000, 7000};
	
	public static final int[] EMPIRE_ARRAY_1			= { 1000, 2000, 3000 };
	public static final int[] EMPIRE_ARRAY_2			= { 1000, 2000, 3000, 4000 };
	public static final int[] EMPIRE_ARRAY_3			= { 1000, 2000, 3000, 3000, 4000, 5000 };
	public static final int[] EMPIRE_ARRAY_4			= { 1000, 2000, 3000, 4000, 4000, 5000, 6000 };
	
	public static final int[] EMPIRE_OVERLOAD_ARRAY_1	= { 4000, 4000, 5000 };
	public static final int[] EMPIRE_OVERLOAD_ARRAY_2	= { 4000, 5000, 5000, 6000 };
	public static final int[] EMPIRE_OVERLOAD_ARRAY_3	= { 4000, 5000, 5000, 6000, 6000, 7000};
	
	public static final int[] PANTERA_ARRAY 			= { 2000, 3000 };
	public static final int[] PANTERA_SHOCK_ARRAY 		= { 2000, 3000, 4000, 4000 };
	public static final int[] PHANTOM_ARRAY 			= { 1000, 2000, 3000, 4000, 5000 };
	
	public static final int[] POWER_GRIP_ARRAY 			= { 1000, 2000, 2000, 3000, 3000, 3000, 4000 };
	public static final int[] DESPERADO_ARRAY 			= { 1000, 2000, 3000, 4000 };
	public static final int[] DESPERADO_ABSOLUTE_ARRAY 	= { 1000, 2000, 3000, 4000, 5000, 6000 };
	
	public static final int[] CRUEL_ARRAY				= { 2000, 3000 };
	public static final int[] CRUEL_CONVICTION_ARRAY	= { 2000, 3000, 4000, 4000 };
	
	public static final int[] EARTH_BIND_ARRAY			= { 2000, 2000, 3000, 3000, 4000, 4000, 5000, 5000, 6000, 6000, 7000, 8000 };
	public static final int[] SHADOW_STEP_ARRAY			= { 1000, 1000, 2000, 3000, 4000 };
	public static final int[] SHADOW_STEP_CHASER_ARRAY	= { 2000, 2000, 3000, 4000, 5000 };
	public static final int[] ETERNITY_ARRAY			= { 2000, 2000, 2000, 3000, 3000, 4000 };
	public static final int[] TEMPEST_ARRAY				= { 1000, 2000, 2000, 3000, 3000, 4000 };
	public static final int[] STRIKER_GALE_SHOT_ARRAY	= { 1000, 1000, 1000, 2000, 2000, 3000, 3000, 4000 };
	public static final int[] THUNDER_GRAB_ARRAY		= { 2000, 3000 };
	public static final int[] TRIPLE_STUN_ARRAY			= { 1000, 2000, 3000, 4000 };
	public static final int[] SHOCK_ATTACK_ARRAY		= { 3000, 3000, 4000, 4000, 5000 };
	public static final int[] ENSNARE_ARRAY				= { 2000, 3000, 3000, 4000, 4000 };
	public static final int[] OSIRIS_ARRAY				= { 2000, 3000, 3000, 4000, 4000 };
	public static final int[] BEHEMOTH_ARRAY			= { 1000, 2000, 3000, 3000, 4000, 4000 };
	
	public static final int[] MONSTER_STUN_ARRAY 		= { 2000, 3000, 4000 };
	public static final int[] MOB_DESPERADO_ARRAY_1		= { 2000, 3000, 4000 };
	public static final int[] MOB_DESPERADO_ARRAY_2		= { 2000, 3000, 4000, 5000, 6000 };
	
	// 인비지 상태서 사용 가능한 스킬
	public static final java.util.List<Integer> CAST_WITH_INVIS_LIST = java.util.Arrays.asList(new Integer[]{
			HEAL, LIGHT, SHIELD, TELEPORT, HOLY_WEAPON, CURE_POISON, ENCHANT_WEAPON, 
			DETECTION, DECREASE_WEIGHT, EXTRA_HEAL, BLESSED_ARMOR, PHYSICAL_ENCHANT_DEX, 
			COUNTER_MAGIC, MEDITATION, GREATER_HEAL, PHYSICAL_ENCHANT_STR, 
			HASTE, CANCELLATION, BLESS_WEAPON, HEAL_ALL, HOLY_WALK, GREATER_HASTE, BERSERKERS, 
			FULL_HEAL, INVISIBILITY, RESURRECTION, LIFE_STREAM, SHAPE_CHANGE, SHAPE_CHANGE_DOMINATION, SHAPE_CHANGE_100LEVEL,
			MASS_TELEPORT, COUNTER_DETECTION, DEATH_HEAL, GREATER_RESURRECTION, ABSOLUTE_BARRIER, 
			ENCHANT_ACCURACY, FREEZING_ARMOR, DIVINE_PROTECTION,
			
			REDUCTION_ARMOR, BOUNCE_ATTACK, COUNTER_BARRIER, BLOW_ATTACK,
			
			BLIND_HIDING, ENCHANT_VENOM, SHADOW_ARMOR, BRING_STONE, MOVING_ACCELERATION, 
			VENOM_RESIST, DOUBLE_BRAKE, UNCANNY_DODGE, SHADOW_FANG, DRESS_MIGHTY, 
			DRESS_DEXTERITY, ASSASSIN,
			
			TRUE_TARGET, GLOWING_WEAPON, SHINING_SHIELD, BRAVE_MENTAL,
			
			RESIST_MAGIC, BODY_TO_MIND, TELEPORT_TO_MATHER, ELEMENTAL_FALL_DOWN, 
			ELVEN_GRAVITY, CLEAR_MIND, PROTECTION_FROM_ELEMENTAL, SOUL_BARRIER,
			EARTH_WEAPON, AQUA_SHOT, EGLE_EYE, FIRE_SHILD, DANCING_BLADES, EYE_OF_STORM,
			NATURES_TOUCH, EARTH_GUARDIAN, BURNING_WEAPON, NATURES_BLESSING, CALL_OF_NATURE, 
			STORM_SHOT, CYCLONE, IRON_SKIN, EXOTIC_VITALIZE, WATER_LIFE, ELEMENTAL_FIRE,
			SOUL_OF_FLAME, FOCUS_WAVE, HURRICANE, SAND_STORM, INFERNO, MAGIC_SHIELD, LIBERATION,
			
			SCALES_EARTH_DRAGON, SCALES_WATER_DRAGON, SCALES_FIRE_DRAGON, SCALES_WIND_DRAGON, HALPHAS,
			
			IllUSION_OGRE, IllUSION_AVATAR, PATIENCE, INSIGHT, MIRROR_IMAGE, 
			REDUCE_WEIGHT, FOCUS_SPRITS, POTENTIAL,
			
			ALTERNATE, VANGUARD, RECOVERY,
			
			ANTA_BUFF, FAFU_BUFF, RIND_BUFF, VALL_BUFF, DRAGONRAID_BUFF,
			ADVANCE_SPIRIT_1
	});
	
	// 카운터 매직으로 방어할수 없는 스킬
	public static final java.util.List<Integer> EXCEPT_COUNTER_MAGIC_LIST = java.util.Arrays.asList(new Integer[]{
			HEAL, LIGHT, SHIELD, TELEPORT, HOLY_WEAPON, CURE_POISON, ENCHANT_WEAPON, 
			DETECTION, DECREASE_WEIGHT, EXTRA_HEAL, BLESSED_ARMOR, PHYSICAL_ENCHANT_DEX, 
			COUNTER_MAGIC, MEDITATION, GREATER_HEAL, REMOVE_CURSE, PHYSICAL_ENCHANT_STR,
			HASTE, CANCELLATION, BLESS_WEAPON, HEAL_ALL, HOLY_WALK, GREATER_HASTE, BERSERKERS, 
			FULL_HEAL, INVISIBILITY, RESURRECTION, LIFE_STREAM, IMMUNE_TO_HARM,
			MASS_TELEPORT, COUNTER_DETECTION, DEATH_HEAL, GREATER_RESURRECTION, ABSOLUTE_BARRIER, 
			SHAPE_CHANGE, SHAPE_CHANGE_DOMINATION, SHAPE_CHANGE_100LEVEL, ETERNITY, MASS_IMMUNE_TO_HARM, DIVINE_PROTECTION,
			
			SHOCK_STUN, REDUCTION_ARMOR, BOUNCE_ATTACK, COUNTER_BARRIER,
			ABSOLUTE_BLADE, BLOW_ATTACK, FORCE_STUN,
			
			BLIND_HIDING, ENCHANT_VENOM, SHADOW_ARMOR, BRING_STONE, MOVING_ACCELERATION, 
			VENOM_RESIST, DOUBLE_BRAKE, UNCANNY_DODGE, SHADOW_FANG, DRESS_MIGHTY, 
			DRESS_DEXTERITY, LUCIFER, ARMOR_BREAK, SHADOW_STEP,
			
			TRUE_TARGET, GLOWING_WEAPON, SHINING_SHIELD, BRAVE_MENTAL, EMPIRE, CAL_CLAN_ADVANCE,
			
			RESIST_MAGIC, BODY_TO_MIND, TELEPORT_TO_MATHER, TRIPLE_ARROW, 
			ELVEN_GRAVITY, CLEAR_MIND, PROTECTION_FROM_ELEMENTAL, SOUL_BARRIER,
			EARTH_WEAPON, AQUA_SHOT, EGLE_EYE, FIRE_SHILD, DANCING_BLADES, EYE_OF_STORM, NATURES_TOUCH, 
			EARTH_GUARDIAN, AREA_OF_SILENCE, BURNING_WEAPON, NATURES_BLESSING, CALL_OF_NATURE, 
			STORM_SHOT, IRON_SKIN, EXOTIC_VITALIZE, WATER_LIFE, ELEMENTAL_FIRE, SOUL_OF_FLAME,
			CYCLONE, INFERNO, LIBERATION,
			
			FOU_SLAYER, SCALES_EARTH_DRAGON, SCALES_FIRE_DRAGON, SCALES_WATER_DRAGON, SCALES_WIND_DRAGON, HALPHAS, CHAIN_REACTION, BEHEMOTH,
			
			MIRROR_IMAGE, INSIGHT, PATIENCE, BONE_BREAK, FOCUS_SPRITS,
			IllUSION_OGRE, IllUSION_AVATAR,
			CUBE_OGRE, CUBE_GOLEM, CUBE_LICH, CUBE_AVATAR, POTENTIAL, OSIRIS,
			
			DESPERADO, POWER_GRIP,
			
			JUDGEMENT, PHANTOM, PANTERA, BLADE,
			
			PRESSURE, CRUEL,
			
			EXP_POTION, EXP_POTION1, EXP_POTION2, EXP_POTION3, EXP_POTION4, EXP_POTION5, EXP_POTION6, EXP_POTION7, EXP_POTION8,
			BUFF_GOLD_FEATHER, BUFF_GOLD_FEATHER_GROW, 
			BUFF_MISOPIA_GROW, BUFF_MISOPIA_DEFFENS, BUFF_MISOPIA_ATTACK,
			BUFF_SPECIAL_GROW, BUFF_SPECIAL_DEFFENS, BUFF_SPECIAL_ATTACK,
			MOB_SLOW_18, MOB_DISEASE_1, MOB_CURSEPARALYZ_19, MOB_CANCELLATION,
			MOB_ABSOLUTE_BLADE, MOB_IMMUNE_BLADE, MOB_WINDSHACKLE_1, MOB_ARMOR_BRAKE,
			MOB_SHOCKSTUN_18, MOB_SHOCKSTUN_19, MOB_SHOCKSTUN_30, 
			MOB_RANGESTUN_18, MOB_RANGESTUN_19, MOB_RANGESTUN_20, MOB_RANGESTUN_30,
			ANTA_MESSAGE_2, ANTA_MESSAGE_3, ANTA_MESSAGE_4, ANTA_MESSAGE_5, ANTA_MESSAGE_6,
			ANTA_MESSAGE_7, ANTA_MESSAGE_8, ANTA_MESSAGE_10, ANTA_UNSUCK, 		
			PAP_PREDICATE1, PAP_PREDICATE3, PAP_PREDICATE5, PAP_PREDICATE6,
			PAP_PREDICATE7, PAP_PREDICATE8, PAP_PREDICATE9, PAP_PREDICATE11, PAP_PREDICATE12, 	
			VALLAKAS_PREDICATE2, VALLAKAS_PREDICATE4, VALLAKAS_PREDICATE5,
			RIND_ANSIG, ANTA_ANSIG, VALA_ANSIG, FAFU_ANSIG, 
			ADVANCE_SPIRIT_1	
	});
	
	// 2차 스킬 버그 방지 안배운 마법 사용 못하게 체크하는 스킬
	public static final java.util.List<Integer> NO_HAS_SKILL_CHECK_LIST = java.util.Arrays.asList(new Integer[]{
			ERUPTION, SUNBURST, WEAKNESS, HEAL_ALL, FREEZING_ARMOR, SUMMON_MONSTER, 
			HOLY_WALK, TORNADO, BERSERKERS, ENCHANT_ACCURACY, FULL_HEAL, FIRE_WALL, BLIZZARD, INVISIBILITY, 
			RESURRECTION, EARTHQUAKE, LIFE_STREAM, SILENCE, LIGHTNING_STORM, FOG_OF_SLEEPING, SHAPE_CHANGE, 
			MASS_TELEPORT, FIRE_STORM, FATAL_POTION, COUNTER_DETECTION, DEATH_HEAL, METEOR_STRIKE,
			GREATER_RESURRECTION, ICE_METEOR, DISINTEGRATE, ABSOLUTE_BARRIER, ICE_SPIKE, ETERNITY, MASS_IMMUNE_TO_HARM,
			
			SHOCK_STUN, REDUCTION_ARMOR, BOUNCE_ATTACK, COUNTER_BARRIER, 
			ABSOLUTE_BLADE, BLOW_ATTACK, FORCE_STUN,
			
			BLIND_HIDING, ENCHANT_VENOM, SHADOW_ARMOR, BRING_STONE, MOVING_ACCELERATION, 
			SHADOW_SLEEP, VENOM_RESIST, DOUBLE_BRAKE, UNCANNY_DODGE, SHADOW_FANG, DRESS_MIGHTY, 
			DRESS_DEXTERITY, ARMOR_BREAK, LUCIFER, AVENGER, SHADOW_STEP,
			
			TRUE_TARGET, GLOWING_WEAPON, SHINING_SHIELD, BRAVE_MENTAL, 
			GRACE, EMPIRE, PRIME, CAL_CLAN_ADVANCE,
			
			RESIST_MAGIC, BODY_TO_MIND, TELEPORT_TO_MATHER, TRIPLE_ARROW, ELEMENTAL_FALL_DOWN, ELVEN_GRAVITY, 
			SOUL_BARRIER, INFERNO, CLEAR_MIND, RETURN_TO_NATURE, PROTECTION_FROM_ELEMENTAL, 
			EARTH_WEAPON, AQUA_SHOT, EGLE_EYE, FIRE_SHILD, QUAKE, ERASE_MAGIC, SUMMON_LESSER_ELEMENTAL, 
			DANCING_BLADES, EYE_OF_STORM, EARTH_BIND, EARTH_GUARDIAN, AQUA_PROTECTER, AREA_OF_SILENCE, 
			SUMMON_GREATER_ELEMENTAL, BURNING_WEAPON, NATURES_BLESSING, CALL_OF_NATURE, STORM_SHOT, CYCLONE, 
			EXOTIC_VITALIZE, WATER_LIFE, ELEMENTAL_FIRE, STORM_WALK, POLLUTE_WATER, STRIKER_GALE, SOUL_OF_FLAME, 
			FOCUS_WAVE, HURRICANE, SAND_STORM, MAGIC_SHIELD, LIBERATION,
			
			BURNING_SLASH, DESTROY, MAGMA_BREATH, SCALES_EARTH_DRAGON, BLOOD_LUST, FOU_SLAYER, 
			MAGMA_ARROW, SCALES_WATER_DRAGON, THUNDER_GRAB, EYE_OF_DRAGON, 
			SCALES_FIRE_DRAGON, SCALES_WIND_DRAGON, HALPHAS,
			
			MIRROR_IMAGE, CONFUSION, SMASH, IllUSION_OGRE, CUBE_OGRE, CONCENTRATION, MIND_BREAK, BONE_BREAK, 
			CUBE_GOLEM, PHANTASM, IZE_BREAK, CUBE_LICH, 
			INSIGHT, PANIC, REDUCE_WEIGHT, IllUSION_AVATAR, CUBE_AVATAR, IMPACT, FOCUS_SPRITS, POTENTIAL, ENSNARE, OSIRIS,
			
			HOWL, POWER_GRIP, DESPERADO, TITAN_RISING,
			
			JUDGEMENT, PHANTOM, PANTERA, HELLFIRE, BLADE,
			
			ALTERNATE, POS_WAVE, VANGUARD, RECOVERY, PRESSURE, CRUEL	
	});
	
	// 중복할 수 없는 스킬
	public static final int[][] REPEATED_SKILLS = {
	    { HOLY_WEAPON, ENCHANT_WEAPON, BLESS_WEAPON, SHADOW_FANG },
		{ EARTH_WEAPON, AQUA_SHOT, EYE_OF_STORM, BURNING_WEAPON, STORM_SHOT },
		{ SHIELD, FIRE_SHILD, IRON_SKIN },
		{ HOLY_WALK, BLOOD_LUST, MOVING_ACCELERATION, STATUS_BRAVE, STATUS_ELFBRAVE, FOCUS_WAVE, HURRICANE, SAND_STORM },
		{ HASTE, GREATER_HASTE, STATUS_HASTE },
		{ PHYSICAL_ENCHANT_DEX, DRESS_DEXTERITY, BUFF_TARAS_HIGHT_MAGIC },
		{ PHYSICAL_ENCHANT_STR, DRESS_MIGHTY, BUFF_TARAS_HIGHT_MAGIC },
		{ DECREASE_WEIGHT, ELVEN_GRAVITY, REDUCE_WEIGHT },
		{ ARMOR_BREAK, MOB_ARMOR_BRAKE },
		{ IllUSION_OGRE, CUBE_OGRE },
		{ IllUSION_AVATAR, CUBE_AVATAR },
		{ IMMUNE_TO_HARM, LUCIFER },
		{ EXP_POTION, EXP_POTION1, EXP_POTION2, EXP_POTION3, EXP_POTION4, EXP_POTION5, EXP_POTION6, EXP_POTION7, EXP_POTION8 },
		{ POLLUTE_WATER, MOB_POLLUTE_WATER },
		{ GRACE_CROWN_1ST, GRACE_KNIGHT_1ST, GRACE_ELF_1ST, GRACE_WIZARD_1ST, GRACE_DARKELF_1ST, GRACE_DRAGONKNIGHT_1ST, GRACE_ILLUSIONIST_1ST, GRACE_WARRIOR_1ST, GRACE_FENCER_1ST, GRACE_LANCER_1ST, 
			GRACE_CROWN_2ST, GRACE_KNIGHT_2ST, GRACE_ELF_2ST, GRACE_WIZARD_2ST, GRACE_DARKELF_2ST, GRACE_DRAGONKNIGHT_2ST, GRACE_ILLUSIONIST_2ST, GRACE_WARRIOR_2ST, GRACE_FENCER_2ST, GRACE_LANCER_2ST, 
			GRACE_CROWN_3ST, GRACE_KNIGHT_3ST, GRACE_ELF_3ST, GRACE_WIZARD_3ST, GRACE_DARKELF_3ST, GRACE_DRAGONKNIGHT_3ST, GRACE_ILLUSIONIST_3ST, GRACE_WARRIOR_3ST, GRACE_FENCER_3ST, GRACE_LANCER_3ST 
		},
		{ BUFF_MISOPIA_GROW, BUFF_SPECIAL_GROW },
		{ BUFF_MISOPIA_DEFFENS, BUFF_SPECIAL_DEFFENS },
		{ BUFF_MISOPIA_ATTACK, BUFF_SPECIAL_ATTACK },
		{ BUFF_CRAY, BUFF_SAEL, BUFF_GUNTER, BUFF_BALRACAS, BUFF_ZAKEN, BUFF_ZAKEN_HALPAS },
		{ FAFU_MAAN, ANTA_MAAN, LIND_MAAN, VALA_MAAN, LIFE_MAAN, BIRTH_MAAN, SHAPE_MAAN, BLACK_MAAN, ABSOLUTE_MAAN },
		{ PAP_FIVEPEARLBUFF, PAP_MAGICALPEARLBUFF },
		{ FEATHER_BUFF_A, FEATHER_BUFF_B, FEATHER_BUFF_C, FEATHER_BUFF_D },
		{ BUFF_STR_ADD, BUFF_DEX_ADD, BUFF_INT_ADD },
	};
	
	// 상태 이상 스킬
	public static final java.util.List<Integer> STRANGE_SKILL_LIST = java.util.Arrays.asList(new Integer[]{
			EMPIRE,
			SHOCK_STUN, FORCE_STUN,
			EARTH_BIND, POLLUTE_WATER, STRIKER_GALE, ENTANGLE, WIND_SHACKLE,
			FOG_OF_SLEEPING, ICE_LANCE, CURSE_POISON, SLOW, DARKNESS, WEAKNESS, SILENCE, DECAY_POTION, FATAL_POTION, DEATH_HEAL, DISEASE, GREATER_SLOW, ETERNITY,
			SHADOW_SLEEP, ARMOR_BREAK, ELEMENTAL_FALL_DOWN, ERASE_MAGIC,
			DESTROY, DESTROY_2, 
			CONFUSION, BONE_BREAK, PHANTASM, PANIC, OSIRIS,
			POWER_GRIP, DESPERADO, TEMPEST,
			PHANTOM, PANTERA, JUDGEMENT,
			PRESSURE, CRUEL,
			ANTA_MESSAGE_6, ANTA_MESSAGE_7, ANTA_MESSAGE_8, VALLAKAS_PREDICATE2, VALLAKAS_PREDICATE4, VALLAKAS_PREDICATE5,
			MOB_SHOCKSTUN_18, MOB_SHOCKSTUN_19, MOB_SHOCKSTUN_30, MOB_RANGESTUN_18, MOB_RANGESTUN_19, MOB_RANGESTUN_20, MOB_RANGESTUN_30
	});
	
	// 셰이프 체인지 변신 배열
	public static final int[] SHAPE_CHANGE_POLY_ARRAY = { 
		29, 945, 947, 979, 1037, 1039, 3861, 3862, 3864, 3865, 3906, 95, 146, 2374, 2376, 2377,
		2378, 3866, 3867, 3868, 3869, 3870, 3871, 3874, 3876, 3882, 3883, 3884, 3885, 11358, 11396, 11397,
		12225, 12226, 11399, 11398, 12227
	};
	
	public static final int[] SUMMON_LESSER_ARRAY		= { 45306, 45303, 45304, 45305 };
	public static final int[] SUMMON_LESSER_GREAT_ARRAY	= { 81053, 81050, 81051, 81052 };
	
	// 디비 저장 스킬
	public static final java.util.List<Integer> SAVE_BUFF_LIST = java.util.Arrays.asList(new Integer[]{
			LIGHT, SHIELD, HASTE, GREATER_HASTE, HOLY_WALK, DECREASE_WEIGHT,
			HOLY_WEAPON, ENCHANT_WEAPON, BLESSED_ARMOR, BLESS_WEAPON,
			PHYSICAL_ENCHANT_DEX, PHYSICAL_ENCHANT_STR,
			FATAL_POTION, SILENCE, WEAKNESS, DISEASE, 
			SHAPE_CHANGE, SHAPE_CHANGE_DOMINATION, SHAPE_CHANGE_100LEVEL, FREEZING_ARMOR, ENCHANT_ACCURACY,
			
			REDUCTION_ARMOR, BOUNCE_ATTACK, COUNTER_BARRIER, BLOW_ATTACK,
			
			MOVING_ACCELERATION, DRESS_MIGHTY, DRESS_DEXTERITY, VENOM_RESIST, 
			ENCHANT_VENOM, SHADOW_ARMOR, DOUBLE_BRAKE, UNCANNY_DODGE, SHADOW_FANG,
			
			GLOWING_WEAPON, BRAVE_MENTAL,
			
			RESIST_MAGIC, CLEAR_MIND, ELVEN_GRAVITY,
			PROTECTION_FROM_ELEMENTAL, ERASE_MAGIC, ELEMENTAL_FALL_DOWN, SOUL_BARRIER,
			EARTH_GUARDIAN, EARTH_WEAPON, IRON_SKIN, QUAKE, EXOTIC_VITALIZE, SAND_STORM, ENTANGLE,
			DANCING_BLADES, FIRE_SHILD, ELEMENTAL_FIRE, BURNING_WEAPON, SOUL_OF_FLAME, INFERNO,
			NATURES_TOUCH, AQUA_SHOT, AQUA_PROTECTER, POLLUTE_WATER, FOCUS_WAVE,
			EGLE_EYE, EYE_OF_STORM, STORM_SHOT, STRIKER_GALE, CYCLONE, HURRICANE, WIND_SHACKLE,
			
			BLOOD_LUST,
			SCALES_EARTH_DRAGON, SCALES_WATER_DRAGON, SCALES_FIRE_DRAGON, SCALES_WIND_DRAGON,
			
			MIRROR_IMAGE, IllUSION_OGRE, IllUSION_AVATAR, FOCUS_SPRITS,
			CONCENTRATION, INSIGHT, PANIC, PATIENCE, REDUCE_WEIGHT,
			
			TITAN_RISING,
			
			STATUS_BRAVE, STATUS_ELFBRAVE, STATUS_HASTE, STATUS_FRUIT, STATUS_DRAGON_PEARL, 
			STATUS_BLUE_POTION, STATUS_BLUE_POTION2, 
			EXP_POTION, EXP_POTION1, EXP_POTION2, EXP_POTION3, EXP_POTION4, EXP_POTION5, EXP_POTION6, EXP_POTION7, EXP_POTION8,
			STATUS_CHAT_PROHIBITED, DRAGON_EXP_POTION,
			BUFF_MISOPIA_GROW, BUFF_MISOPIA_DEFFENS, BUFF_MISOPIA_ATTACK,
			BUFF_SPECIAL_GROW, BUFF_SPECIAL_DEFFENS, BUFF_SPECIAL_ATTACK,
			STATUS_CASHSCROLL, STATUS_CASHSCROLL2, STATUS_CASHSCROLL3, 
			NEW_CASHSCROLL1, NEW_CASHSCROLL2, NEW_CASHSCROLL3,
			KYULJUN_CASHSCROLL, HP_CASHSCROLL,
			FEATHER_BUFF_A, FEATHER_BUFF_B, FEATHER_BUFF_C, FEATHER_BUFF_D, BUFF_GOLD_FEATHER, BUFF_GOLD_FEATHER_GROW,
			COMA_A, COMA_B, BUFF_BLACK_SAND, SET_BUFF, NARUTER_CANDY,
			GRACE_OF_TOP, 
			GRACE_CROWN_1ST, GRACE_KNIGHT_1ST, GRACE_ELF_1ST, GRACE_WIZARD_1ST, GRACE_DARKELF_1ST, GRACE_DRAGONKNIGHT_1ST, GRACE_ILLUSIONIST_1ST, GRACE_WARRIOR_1ST, GRACE_FENCER_1ST, GRACE_LANCER_1ST,
			GRACE_CROWN_2ST, GRACE_KNIGHT_2ST, GRACE_ELF_2ST, GRACE_WIZARD_2ST, GRACE_DARKELF_2ST, GRACE_DRAGONKNIGHT_2ST, GRACE_ILLUSIONIST_2ST, GRACE_WARRIOR_2ST, GRACE_FENCER_2ST, GRACE_LANCER_2ST,
			GRACE_CROWN_3ST, GRACE_KNIGHT_3ST, GRACE_ELF_3ST, GRACE_WIZARD_3ST, GRACE_DARKELF_3ST, GRACE_DRAGONKNIGHT_3ST, GRACE_ILLUSIONIST_3ST, GRACE_WARRIOR_3ST, GRACE_FENCER_3ST, GRACE_LANCER_3ST,
			DOGAM_BUFF, LEVELUP_BONUS_BUFF, STATUS_WITCH_POTION, BUFF_PCCAFE_EXP,
			
			COOKING_1_0_N, COOKING_1_0_S, COOKING_1_1_N, COOKING_1_1_S, 
			COOKING_1_2_N, COOKING_1_2_S, COOKING_1_3_N, COOKING_1_3_S,
			COOKING_1_4_N, COOKING_1_4_S, COOKING_1_5_N, COOKING_1_5_S, 
			COOKING_1_6_N, COOKING_1_6_S, 
			
			COOKING_1_8_N, COOKING_1_8_S, COOKING_1_9_N, COOKING_1_9_S, 
			COOKING_1_10_N, COOKING_1_10_S, COOKING_1_11_N, COOKING_1_11_S, 
			COOKING_1_12_N, COOKING_1_12_S, COOKING_1_13_N, COOKING_1_13_S, 
			COOKING_1_14_N, COOKING_1_14_S, 
			
			COOKING_1_16_N, COOKING_1_16_S, COOKING_1_17_N, COOKING_1_17_S, 
			COOKING_1_18_N, COOKING_1_18_S, COOKING_1_19_N, COOKING_1_19_S,
			COOKING_1_20_N, COOKING_1_20_S, COOKING_1_21_N, COOKING_1_21_S, 
			COOKING_1_22_N, COOKING_1_22_S,
			
			COOK_STR, COOK_DEX, COOK_INT, COOK_GROW, 
			BLESS_COOK_STR, BLESS_COOK_DEX, BLESS_COOK_INT, BLESS_COOK_GROW,		
			COOK_METIS_GROW, COOK_METIS_NORMAL, METIS_BLESS_SCROLL,
			
			COOK_ADEN_SPECIAL_STEAK, COOK_ADEN_SPECIAL_CANAPE, COOK_ADEN_SPECIAL_SALAD, COOK_ADEN_TOMATO_SOUP,
			BLESS_COOK_ADEN_SPECIAL_STEAK, BLESS_COOK_ADEN_SPECIAL_CANAPE, BLESS_COOK_ADEN_SPECIAL_SALAD, BLESS_COOK_ADEN_TOMATO_SOUP,

			BUFF_ATTACK, BUFF_DEFENSE, BUFF_MAGIC, BUFF_TECHNIQUE, BUFF_SPIRIT, 
			BUFF_WISDOM, BUFF_INTELLIGENCE, BUFF_CONSTITUTION, BUFF_STRENGTH, BUFF_AGILITY,
			BUFF_INTELLIGENCE2, BUFF_CONSTITUTION2, BUFF_CRAFTSMANSHIP, BUFF_AGILITY2, BUFF_POWER, BUFF_DEXTERITY, 
			BUFF_KNOWLEDGE, BUFF_INSIGHT,
			
			BUFF_STR_ADD, BUFF_DEX_ADD, BUFF_INT_ADD,
			
			ANTA_BUFF, FAFU_BUFF, RIND_BUFF, VALL_BUFF,
			ANTA_MAAN, FAFU_MAAN, VALA_MAAN, LIND_MAAN, BIRTH_MAAN, SHAPE_MAAN, LIFE_MAAN, BLACK_MAAN, ABSOLUTE_MAAN	
	});
	
	public static final java.util.List<Integer> PROTO_ICON_SKILL_LIST = java.util.Arrays.asList(new Integer[]{
			TOWER_BUFF_E_BLESS, TOWER_BUFF_E_CURSE, TOWER_BUFF_W, TOWER_BUFF_S, TOWER_BUFF_N,
			BUFF_ZAKEN, BUFF_ZAKEN_HALPAS,
			GRACE_OF_TOP,
			GRACE_CROWN_1ST, GRACE_KNIGHT_1ST, GRACE_ELF_1ST, GRACE_WIZARD_1ST, GRACE_DARKELF_1ST, GRACE_DRAGONKNIGHT_1ST, GRACE_ILLUSIONIST_1ST, GRACE_WARRIOR_1ST, GRACE_FENCER_1ST, GRACE_LANCER_1ST,
			GRACE_CROWN_2ST, GRACE_KNIGHT_2ST, GRACE_ELF_2ST, GRACE_WIZARD_2ST, GRACE_DARKELF_2ST, GRACE_DRAGONKNIGHT_2ST, GRACE_ILLUSIONIST_2ST, GRACE_WARRIOR_2ST, GRACE_FENCER_2ST, GRACE_LANCER_2ST,
			GRACE_CROWN_3ST, GRACE_KNIGHT_3ST, GRACE_ELF_3ST, GRACE_WIZARD_3ST, GRACE_DARKELF_3ST, GRACE_DRAGONKNIGHT_3ST, GRACE_ILLUSIONIST_3ST, GRACE_WARRIOR_3ST, GRACE_FENCER_3ST, GRACE_LANCER_3ST,
			BUFF_GOLD_FEATHER, BUFF_GOLD_FEATHER_GROW,
			BUFF_MISOPIA_GROW, BUFF_MISOPIA_DEFFENS, BUFF_MISOPIA_ATTACK,
			BUFF_SPECIAL_GROW, BUFF_SPECIAL_DEFFENS, BUFF_SPECIAL_ATTACK, DRAGON_EXP_POTION,
			ANTA_MAAN, FAFU_MAAN, LIND_MAAN, VALA_MAAN, BIRTH_MAAN, SHAPE_MAAN, LIFE_MAAN, BLACK_MAAN, ABSOLUTE_MAAN,
			ADVANCE_SPIRIT_1, MP_REDUCTION_POTION, BUFF_VISUAL_OF_CAPTAIN, BUFF_PUFFER_FISH,
			BERSERKERS, FREEZING_ARMOR, ENCHANT_ACCURACY, HOLY_WEAPON, ENCHANT_WEAPON, BLESS_WEAPON, BLESSED_ARMOR, IMMUNE_TO_HARM, ABSOLUTE_BARRIER, MEDITATION, DECAY_POTION, FATAL_POTION, DIVINE_PROTECTION,
			BLOW_ATTACK, REDUCTION_ARMOR, ABSOLUTE_BLADE, COUNTER_BARRIER,
			SHADOW_FANG, LUCIFER, ASSASSIN, SHADOW_ARMOR,
			BRAVE_MENTAL,
			SOUL_BARRIER, STRIKER_GALE, CYCLONE, EGLE_EYE, CLEAR_MIND, AQUA_PROTECTER, MAGIC_SHIELD, LIBERATION, BURNING_SHOT, ELEMENTAL_FIRE, QUAKE, EARTH_GUARDIAN, INFERNO,
			SCALES_EARTH_DRAGON, SCALES_WATER_DRAGON, SCALES_FIRE_DRAGON, SCALES_WIND_DRAGON, HALPHAS,
			IllUSION_OGRE, IllUSION_AVATAR, PATIENCE, FOCUS_SPRITS, POTENTIAL,
			TITAN_RISING,
			ASURA,
			VANGUARD
	});
	
	// 캔슬로 해제되지 않는 스킬
	public static final java.util.List<Integer> NOT_CANCELABLE_SKILL_LIST = java.util.Arrays.asList(new Integer[]{
			/** 군주 **/
			TRUE_TARGET, GLOWING_WEAPON, SHINING_SHIELD, BRAVE_MENTAL, EMPIRE,
			
			/** 기사 **/
			SHOCK_STUN, REDUCTION_ARMOR, COUNTER_BARRIER, ABSOLUTE_BLADE, BLOW_ATTACK, FORCE_STUN,
			
			/** 법사 **/
			ABSOLUTE_BARRIER, STATUS_ETERNITY,
					
			/** 다엘 **/		
			UNCANNY_DODGE, SHADOW_FANG, DRESS_MIGHTY, DRESS_DEXTERITY, SHADOW_ARMOR,
			LUCIFER, DOUBLE_BRAKE, ARMOR_BREAK, ENCHANT_VENOM, VENOM_RESIST,
			
			/** 요정 **/
			RESIST_MAGIC, ELVEN_GRAVITY, SOUL_BARRIER, CLEAR_MIND, PROTECTION_FROM_ELEMENTAL,
			EARTH_WEAPON, AQUA_SHOT, EGLE_EYE, FIRE_SHILD, EYE_OF_STORM, NATURES_TOUCH,
			EARTH_GUARDIAN, BURNING_WEAPON, STORM_SHOT, IRON_SKIN, EXOTIC_VITALIZE, ELEMENTAL_FIRE,
			SOUL_OF_FLAME, CYCLONE, INFERNO, LIBERATION,
			
			/** 용기사 **/
			THUNDER_GRAB, HALPHAS,
			SCALES_EARTH_DRAGON, SCALES_WATER_DRAGON, SCALES_FIRE_DRAGON, SCALES_WIND_DRAGON,
			
			/** 환술사 **/
			IllUSION_OGRE, IllUSION_AVATAR, PATIENCE, INSIGHT, REDUCE_WEIGHT,
			MIRROR_IMAGE, BONE_BREAK, FOCUS_SPRITS, POTENTIAL, OSIRIS,
			
			/** 전사 **/
			DESPERADO, TITAN_RISING, POWER_GRIP,
					
			/** 검사 **/
			PANTERA, JUDGEMENT, STATUS_FRAME,
			STATUS_PHANTOM_NOMAL, STATUS_PHANTOM_RIPER, STATUS_PHANTOM_DEATH, STATUS_PHANTOM_REQUIEM,
			
			/** 창기사 **/
			PRESSURE, CRUEL, VANGUARD,
			
			/** 그외 **/
			COOK_STR, COOK_DEX, COOK_INT, COOK_GROW,
			BLESS_COOK_STR, BLESS_COOK_DEX, BLESS_COOK_INT, BLESS_COOK_GROW,
			COOK_METIS_GROW, COOK_METIS_NORMAL, METIS_BLESS_SCROLL	
	});
	
	// 이레이즈 매직이 안풀리는 스킬
	public static final java.util.List<Integer> NOT_DELETE_ERASE_MAGIC_SKILL_LIST = java.util.Arrays.asList(new Integer[]{
			SHOCK_STUN, TRIPLE_ARROW, DESPERADO,
			FOU_SLAYER, EMPIRE, 
			PHANTOM, PANTERA, SHADOW_STEP,
			FORCE_STUN, TEMPEST,
			PRESSURE, CRUEL
	});
	
	// 재사용 체크 안되는 스킬
	public static final java.util.List<Integer> NOT_REPEAT_SKILL_LIST = java.util.Arrays.asList(new Integer[]{
			SHOCK_STUN, EMPIRE,
			THUNDER_GRAB, SHAPE_CHANGE,
			DESPERADO, POWER_GRIP, TEMPEST,
			PANTERA, PHANTOM, SHADOW_STEP,
			FORCE_STUN, ETERNITY,
			CRUEL, DEATH_HEAL, OSIRIS,
			MOB_SHOCKSTUN_18, MOB_SHOCKSTUN_19, MOB_SHOCKSTUN_30, MOB_RANGESTUN_18, MOB_RANGESTUN_19, MOB_RANGESTUN_20, MOB_RANGESTUN_30,
			ANTA_MESSAGE_6, ANTA_MESSAGE_7, ANTA_MESSAGE_8,
			VALLAKAS_PREDICATE2, VALLAKAS_PREDICATE4, VALLAKAS_PREDICATE5
	});
	
	// 공격 액션을 실행하는 스킬
	public static final java.util.List<Integer> ON_ACTION_SKILL_LIST = java.util.Arrays.asList(new Integer[]{
			SHOCK_STUN, BONE_BREAK, EMPIRE, SMASH, DESPERADO, PHANTOM, FORCE_STUN, AVENGER, CRUEL, OSIRIS,
	});
	
	// 스킬 공격으로 성향치 패널티가 발생하지 않는 스킬
	public static final java.util.List<Integer> NOT_ALIGNMENT_PENALTY_SKILL_LIST = java.util.Arrays.asList(new Integer[]{
			OSIRIS, TEMPEST
	});
	
	// 보스몬스터에게 적용되지 않는 스킬
	public static final java.util.List<Integer> BOSS_NOT_ENABLE_SKILL_LIST = java.util.Arrays.asList(new Integer[]{
			ERASE_MAGIC, SLOW, GREATER_SLOW, ENTANGLE, MOB_SLOW_1, MOB_SLOW_18, MANA_DRAIN, WIND_SHACKLE,
	});
	
	// 파티시 출력되는 아이콘 스킬
	public static final java.util.List<Integer> PARTY_ICON_LIST = java.util.Arrays.asList(new Integer[]{
			HOLY_WEAPON, PHYSICAL_ENCHANT_DEX, STATUS_POISON_PARALYZED, STATUS_CURSE_PARALYZED,
			PHYSICAL_ENCHANT_STR, BLESS_WEAPON, BERSERKERS,
			IMMUNE_TO_HARM, DEATH_HEAL, STATUS_ETERNITY,
			SHOCK_STUN, FORCE_STUN, EMPIRE,
			ERASE_MAGIC, EARTH_BIND, POLLUTE_WATER, STRIKER_GALE,
			CUBE_OGRE, CUBE_GOLEM, CUBE_LICH, CUBE_AVATAR, OSIRIS,
			POWER_GRIP, DESPERADO, TEMPEST,
			PANTERA, STATUS_PANTERA_SHOCK, PRESSURE, CRUEL
	});
	
	// 체인 리액션 적용 스킬
	public static final java.util.List<Integer> CHAIN_REACTION_SKILL_LIST = java.util.Arrays.asList(new Integer[]{
			SHOCK_STUN, BONE_BREAK, EMPIRE, DESPERADO, PHANTOM, FORCE_STUN, CRUEL, OSIRIS,
			STATUS_STUN, PANTERA, STATUS_PANTERA_SHOCK, STATUS_DISINTEGRATE_NEMESIS, TEMPEST,
			STATUS_CONQUEROR, MOB_SHOCKSTUN_18, MOB_SHOCKSTUN_19, MOB_SHOCKSTUN_30, 
			MOB_RANGESTUN_18, MOB_RANGESTUN_19, MOB_RANGESTUN_20, MOB_RANGESTUN_30,
			STATUS_PHANTOM_NOMAL, STATUS_PHANTOM_RIPER, STATUS_PHANTOM_DEATH, STATUS_PHANTOM_REQUIEM,
			STATUS_SHOCK_ATTACK_TEL, STATUS_ETERNITY, SHADOW_STEP_CHASER, STATUS_PRESSURE_DEATH_RECAL,
			STATUS_FOU_SLAYER_FORCE_STUN, STATUS_BEHEMOTH_DEBUFF
	});
	
	public static void init(){}
}

