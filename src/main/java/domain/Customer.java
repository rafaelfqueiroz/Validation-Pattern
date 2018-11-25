package domain;

import lombok.Getter;
import lombok.Setter;

public class Customer {

	@Getter @Setter private String name;
	@Getter @Setter private Double money;
	
	public Customer() {	}
	public Customer(String name, Double money) {
		this.name = name;
		this.money = money;
	}
	
	
	
}
