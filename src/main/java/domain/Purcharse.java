package domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Purcharse {

	@Getter @Setter List<Item> items;
	@Getter @Setter Customer customer;
	
	public Double getTotalPucharse() {
		return items.stream().mapToDouble(i -> i.getProduct().getCost()).sum();
	}
	
}
