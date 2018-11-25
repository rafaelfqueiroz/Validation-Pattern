package domain;

import lombok.Getter;
import lombok.Setter;

public class Product {
	
	public static final Double EMPTY = 0.0;

	@Getter @Setter private String name;
	@Getter @Setter private Double stock;
	@Getter @Setter private Double cost;
	
	public Product() {}
	public Product(String name, Double stock, Double cost) {
		this.name = name;
		this.stock = stock;
		this.cost = cost;
	}
	
	public Boolean hasStock() {
		return getStock() > Product.EMPTY;
	}
	
}
