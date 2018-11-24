package business.validation;

import domain.Purcharse;

public class PurcharseValitationMediator extends AbstractValidationMediator<Purcharse> {
	
	public PurcharseValitationMediator() {
		this(new BusinessValidationImpl());
	}
	
	public PurcharseValitationMediator(BusinessInvalidation businessValidation) {
		super(businessValidation);
	}
	
	@Override
	public BusinessInvalidation verify(Purcharse purcharse) {
		BusinessInvalidation invalidations = getInvalidation();
		invalidations
			.withRule(new EnoughMoneyRule(purcharse))
			.withRule(new EnoughInStockRule(purcharse))
			.exists();
		
		return invalidations;
	}

}
