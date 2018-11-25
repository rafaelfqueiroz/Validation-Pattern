package business.validation;

import domain.Purchase;

public class EnoughMoneyRule implements BusinessRule {
	
	private Purchase purcharse;
	public EnoughMoneyRule(Purchase purchase) {
		this.purcharse = purchase;
	}

	@Override
	public Boolean check() {
		if (purcharse.getTotalPucharse() > purcharse.getCustomer().getMoney()) {
			return false;
		}
		return true;
	}

}
