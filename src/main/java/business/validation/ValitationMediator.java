package business.validation;

public interface ValitationMediator<E> {

	public BusinessInvalidation verify(E e);
	
}
