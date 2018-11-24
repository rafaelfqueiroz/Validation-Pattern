package domain;

import lombok.Getter;
import lombok.Setter;

public class Item {

	@Getter @Setter private Product product;
	@Getter @Setter private Float quantity;
}
