package domain;

import lombok.Getter;
import lombok.Setter;

public class Item {

	@Getter @Setter private Product product;
	@Getter @Setter private Double quantity;
	
	public Item() {	}
	public Item(Product product, Double quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	
}
