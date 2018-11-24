package domain;

import lombok.Getter;
import lombok.Setter;

public class Product {
	
	public static final Double EMPTY = 0.0;

	@Getter @Setter private String name;
	@Getter @Setter private Double stock;
	@Getter @Setter private Double cost;
	
	public Boolean hasStock() {
		return getStock() > Product.EMPTY;
	}
	
}
