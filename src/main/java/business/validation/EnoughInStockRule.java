package business.validation;

import domain.Item;
import domain.Product;
import domain.Purcharse;

public class EnoughInStockRule implements BusinessRule {
	
	private Purcharse purcharse;
	public EnoughInStockRule(Purcharse purcharse) {
		this.purcharse = purcharse;
	}

	@Override
	public Boolean check() {
		Boolean hasEnoughStock = purcharse.getItems()
										.stream().map(Item::getProduct)
										.anyMatch(Product::hasStock);
		return hasEnoughStock;
	}

}
