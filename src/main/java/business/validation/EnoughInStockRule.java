package business.validation;

import domain.Purchase;

public class EnoughInStockRule implements BusinessRule {
	
	private Purchase purcharse;
	public EnoughInStockRule(Purchase purcharse) {
		this.purcharse = purcharse;
	}

	@Override
	public Boolean check() {
		Boolean hasEnoughStock = purcharse.getItems()
										.stream()
										.anyMatch(i -> i.getQuantity() <= i.getProduct().getStock());
		return hasEnoughStock;
	}

}
