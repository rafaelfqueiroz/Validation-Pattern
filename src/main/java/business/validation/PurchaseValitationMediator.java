package business.validation;

import domain.Purchase;

public class PurchaseValitationMediator extends AbstractValidationMediator<Purchase> {
	
	public PurchaseValitationMediator() {
		this(new BusinessValidationImpl());
	}
	
	public PurchaseValitationMediator(BusinessInvalidation businessValidation) {
		super(businessValidation);
	}
	
	@Override
	public BusinessInvalidation verify(Purchase purchase) {
		BusinessInvalidation invalidations = getInvalidation();
		invalidations
			.withRule(new EnoughMoneyRule(purchase))
			.withRule(new EnoughInStockRule(purchase))
			.exists();
		
		return invalidations;
	}

}
