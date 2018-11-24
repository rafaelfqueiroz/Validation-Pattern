package business.validation;

import domain.Purcharse;

public class EnoughMoneyRule implements BusinessRule {
	
	private Purcharse purcharse;
	public EnoughMoneyRule(Purcharse purcharse) {
		this.purcharse = purcharse;
	}

	@Override
	public Boolean check() {
		if (purcharse.getTotalPucharse() > purcharse.getCustomer().getMoney()) {
			return false;
		}
		return true;
	}

}
