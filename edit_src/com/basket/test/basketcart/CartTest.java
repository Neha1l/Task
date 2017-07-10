package com.basket.test.basketcart;

import static org.junit.Assert.*;

import org.junit.*;

import com.basket.main.to.ItemsListTO;
import com.basket.main.total.Cart;

public class CartTest {

	private Cart cart;
	
	   @Before
	    public void setUp() throws Exception {
	        cart = new Cart();
	    }

	   @Test(expected = IllegalArgumentException.class)
	    public void addNullItem() {
	        cart.addBasket(null);
	    }
	   
	   @Test(expected = IllegalArgumentException.class)
	    public void addItemWithEmptyName() {
	        ItemsListTO itemsListTO  = new ItemsListTO("",0.60);
	        cart.addBasket(itemsListTO);

	    }
	   
	   @Test
	    public void clearsAllItemsFromTheBasket() {
	        ItemsListTO itemsListTO  = new ItemsListTO("Apple",0.60);
	        cart.addBasket(itemsListTO);
	        assertTrue(cart.getNoOfItems().size()>0);
	        cart.clear();
	        assertEquals("Basket must be empty",0,cart.getNoOfItems().size());
	    }
	   
	   @Test(expected = IllegalArgumentException.class)
	    public void addItemWithNameAsBlankSpace() {
	        ItemsListTO itemsListTO  = new ItemsListTO(" ",0.60);
	        cart.addBasket(itemsListTO);
	    }
	   
	   @Test
	    public void addOneItem() {
	        ItemsListTO itemsListTO  = new ItemsListTO("Apple",0.60);
	        cart.addBasket(itemsListTO);

	        assertEquals("Should have 1 item",1,cart.getNoOfItems().size());
	    }
	   
	   @Test
	    public void addTwoDifferentItems() {
	        ItemsListTO itemsListTO1  = new ItemsListTO("Apple",0.60);
	        ItemsListTO itemsListTO2  = new ItemsListTO("banana",0.40);
	        cart.addBasket(itemsListTO1);
	        cart.addBasket(itemsListTO2);
	        

	        assertEquals("Should have 1 item",2,cart.getNoOfItems().size());
	    }
	   
	    @Test
	    public void add2ItemsOfSameType() {
	        ItemsListTO itemsListTO1  = new ItemsListTO("Apple",0.60);
	        ItemsListTO itemsListTO2  = new ItemsListTO("Apple",0.60);
	        cart.addBasket(itemsListTO1);
	        cart.addBasket(itemsListTO2);

	        assertEquals("Should have 1 item with qty as 2",1,cart.getNoOfItems().size());
	        assertEquals("Should have 1 item with qty as 2",new Integer(2),cart.getNoOfItems().get(itemsListTO1));
	    }


}
