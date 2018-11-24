package business.validation;

import java.util.ArrayList;
import java.util.List;

public class BusinessValidationImpl implements BusinessInvalidation {

	private List<BusinessRule> rules = new ArrayList<>();
	
	public BusinessValidationImpl() {}
	
	public BusinessValidationImpl(BusinessRule rule) {
		withRule(rule);
	}
	
	@Override
	public Boolean exists() {
		return rules.stream().anyMatch(BusinessRule::check);
	}

	@Override
	public BusinessInvalidation withRule(BusinessRule rule) {
		rules.add(rule);
		return this;
	}

}
