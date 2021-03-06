package business.validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import domain.Customer;
import domain.Item;
import domain.Product;
import domain.Purchase;

public class EnouthInStockRuleTest {
	
	private Product meal = null;
	private Product rice = null;
	private Product potato = null;
	
	@Before
	public void prepareStock() {
		this.meal = new Product("Meal", 20.0, 18.5);
		this.rice = new Product("Rice", 50.0, 1.1);
		this.potato = new Product("Potato", 150.5, 0.5);
	}

	@Test
	public void testStockFull() {
		List<Item> cart = new ArrayList<>();
		cart.add(new Item(meal, 2.0));
		cart.add(new Item(rice, 2.0));
		Purchase purchase = new Purchase(
								new Customer("Rafael", 1500.0), 
								cart
							);
		
		BusinessRule rule = new EnoughInStockRule(purchase);
		
		assertTrue(rule.check());
	}
	
	@Test
	public void testItemOutOfStock() {
		List<Item> cart = new ArrayList<>();
		cart.add(new Item(potato, 200.0));
		
		Purchase purchase = new Purchase(
				new Customer("Rafael", 1500.0), 
				cart
			);
		
		BusinessRule rule = new EnoughInStockRule(purchase);
		
		assertFalse(rule.check());
	}
}
