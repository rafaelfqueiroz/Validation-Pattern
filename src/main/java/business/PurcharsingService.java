package business;

import business.validation.PurcharseValitationMediator;
import business.validation.ValitationMediator;
import domain.Purcharse;

public class PurcharsingService {
	
	private ValitationMediator<Purcharse> validator;
	
	public PurcharsingService() {
		this.validator = new PurcharseValitationMediator();
	}

	/**
	 * Applies business logic on purcharse to check if the transaction is possible to occur.
	 * @param purcharse
	 */
	public void save(Purcharse purcharse) {
		validator.verify(purcharse);
	}

}
