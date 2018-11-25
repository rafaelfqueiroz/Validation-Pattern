package domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Purchase {
	
	@Getter @Setter List<Item> items;
	@Getter @Setter Customer customer;
	
	public Purchase() {}
	public Purchase(Customer customer, List<Item> items) {
		this.customer = customer;
		this.items = items;
	}
	
	public Double getTotalPucharse() {
		double sum = items.stream().mapToDouble(i -> i.getQuantity() * i.getProduct().getCost()).sum();
		return sum;
	}
	
}
