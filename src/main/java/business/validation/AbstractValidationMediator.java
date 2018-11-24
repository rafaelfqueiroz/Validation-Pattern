package business.validation;

public abstract class AbstractValidationMediator<E> implements ValitationMediator<E> {

	protected BusinessInvalidation invalidation;
	
	public AbstractValidationMediator(BusinessInvalidation invalidation) {
		this.invalidation = invalidation;
	}

	protected BusinessInvalidation getInvalidation() {
		return this.invalidation;
	}

}
