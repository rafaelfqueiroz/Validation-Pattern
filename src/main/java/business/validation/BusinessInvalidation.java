package business.validation;

public interface BusinessInvalidation {

	Boolean exists();
	BusinessInvalidation withRule(BusinessRule rule);

}
