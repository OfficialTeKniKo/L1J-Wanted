package l1j.server.server.model.item.ablity;

import l1j.server.server.model.item.ablity.enchant.L1EnchantAblity;

public class ItemHitupDragon implements ItemAbility {// 용언 적중
	private static class newInstance {
		public static final ItemAbility INSTANCE = new ItemHitupDragon();
	}
	public static ItemAbility getInstance(){
		return newInstance.INSTANCE;
	}
	private ItemHitupDragon(){}

	@Override
	public Object info(l1j.server.server.model.Instance.L1ItemInstance item, l1j.server.server.model.Instance.L1PcInstance pc){
		int hit = item.getItem().getHitupDragon();
		L1EnchantAblity enchantAblity = item.getEnchantAblity();
		if (enchantAblity != null) {
			int value = enchantAblity.getHitupDragon();
			if (value != 0) {
				hit += value;
			}
		}
		if (pc != null && (pc.getType() == 5 || pc.getType() == 6)) {
			int itemId = item.getItemId();
			if (itemId >= 600056 && itemId <= 600060) {//85 레벨 엘릭서 룬
				return hit += 5;
			}
			if (itemId >= 600061 && itemId <= 600065) {//90 레벨 엘릭서 룬
				return hit += 10;
			}
			if (itemId >= 600066 && itemId <= 600070) {//91 레벨 엘릭서 룬
				return hit += 11;
			}
			if (itemId >= 600070 && itemId <= 600075) {//92 레벨 엘릭서 룬
				return hit += 12;
			}
			if (itemId >= 600080 && itemId <= 600084) {//93 레벨 엘릭서 룬
				return hit += 13;
			}
			if (itemId >= 600085 && itemId <= 600089) {//94 레벨 엘릭서 룬
				return hit += 14;
			}
			if (itemId >= 600090 && itemId <= 600094) {//95 레벨 엘릭서 룬
				return hit += 15;
			}
			if (itemId >= 600700 && itemId <= 600704) {//96 레벨 엘릭서 룬
				return hit += 16;
			}
			if (itemId >= 600705 && itemId <= 600709) {//97 레벨 엘릭서 룬
				return hit += 17;
			}
			if (itemId >= 600710 && itemId <= 600714) {//98 레벨 엘릭서 룬
				return hit += 18;
			}
			if (itemId >= 600715 && itemId <= 600719) {//99 레벨 엘릭서 룬
				return hit += 19;
			}
			if (itemId == 600720) {// 영광의 엘릭서 룬
				return hit += 20;
			}
		}
		return hit;
	}
	
	@Override
	public ItemAbility copyInstance() {
		return new ItemHitupDragon();
	}
}

