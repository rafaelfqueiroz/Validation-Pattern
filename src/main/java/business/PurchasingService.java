package business;

import business.validation.PurchaseValitationMediator;
import business.validation.ValitationMediator;
import domain.Purchase;

public class PurchasingService {
	
	private ValitationMediator<Purchase> validator;
	
	public PurchasingService() {
		this.validator = new PurchaseValitationMediator();
	}

	/**
	 * Applies business logic on purchase to check if the transaction is possible to occur.
	 * @param purchase
	 */
	public void save(Purchase purchase) {
		validator.verify(purchase);
	}

}
