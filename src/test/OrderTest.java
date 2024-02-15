package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import menu.MenuItem;
import menu.Order;

class OrderTest {
	
	private MenuItem fries, burger, soda;
	private Order o;
	
	@BeforeEach
	void setup() {
		fries = new MenuItem("Fries", 2.50);
		burger = new MenuItem("Fries", 8.00);
		soda = new MenuItem("Fries", 1.75);
		
		o = new Order();
	}
	
	
	@Test
	void testItemCountSimple() {
		
		//Step 1: Set up objects
		MenuItem fries = new MenuItem("Fries", 2.50);
		Order o = new Order();
		o.addItem(fries);
		
		//Step 2: Call method that is being tested
		int num = o.getNumberOfItems();
		
		//Step 3: Use assertions to verify results
		assertTrue(num == 1);
		
	}
	
	@Test
	void testItemCountEmpty() {
		
		//Step 1: Set up objects
		
		
		//Step 2: Call method that is being tested
		int num = o.getNumberOfItems();
		
		//Step 3: Use assertions to verify results
		assertTrue(num == 0);
	}
	
	@Test
	void testTotalEmptyOrder() {
		
		//Step 1: Set up objects
		
		//Step 2: Call method that is being tested
		double sum = o.computeTotal();
		
		//Step 3: Use assertions to verify results
		assertEquals(0.0, sum, 0.01);
	}
	
	@Test
	void testTotalOneItem() {
		//Step 1: Set up objects
		o.addItem(fries);
		
		//Step 2: Call method that is being tested
		double sum = o.computeTotal();
		
		//Step 3: Use assertions to verify results
		assertEquals(2.50, sum, 0.01);
	}
	
	@Test
	void testTotalManyItems() {
		//Step 1: Set up objects

		o.addItem(fries);
		o.addItem(burger);
		o.addItem(soda);
		
		//Step 2: Call method that is being tested
		double sum = o.computeTotal();
		
		//Step 3: Use assertions to verify results
		assertEquals(12.25, sum, 0.01);
		
	}

}
