package com.basket.test.basketcart;

import static org.junit.Assert.*;

import org.junit.*;

import com.basket.main.to.ItemsListTO;
import com.basket.main.total.BasketTotal;
import com.basket.main.total.Cart;

public class BasketTotalTest {

	

	    private BasketTotal basketTotal;
	    
	    ItemsListTO ItemsListTO;

	    @Before
	    public void setUp() throws Exception {
	        basketTotal = new BasketTotal();

	    }

	    @Test
	    public void getTotalPriceWithNoItems() throws Exception {
	        Cart cart = new Cart();
	        Double actual = basketTotal.getCheckItems(cart);
	        Double expected = 0.00;
	       
	        assertTrue("Price should be 0",actual.compareTo(expected) == 0 );
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void getTotalPriceWithNullItems() throws Exception {
	        Double price = basketTotal.getCheckItems(null);
	    }

	    @Test
	    public void getTotalPriceWithOneItem() throws Exception {
	    	Cart cart = new Cart();
	        ItemsListTO itemsListTO = new ItemsListTO();
	        ItemsListTO itemsListTO2 = new ItemsListTO("Banana",0.60);
	        cart.addBasket(itemsListTO2);

	        Double actual = basketTotal.getCheckItems(cart);
	        Double expected =(double) Math.round(0.60);
	        
	        
	        
	        assertTrue("Price should be 0.60",actual.compareTo(expected) == 0 );
	    }

	    @Test
	    public void getTotalPriceWith1Item3Quanity() throws Exception {
	        Cart cart = new Cart();
	        String name = "Banana";
	        double price = 0.60;
	        ItemsListTO itemsListTO1 = new ItemsListTO(name,price);
	        ItemsListTO itemsListTO2 = new ItemsListTO(name,price);
	        ItemsListTO itemsListTO3 = new ItemsListTO(name,price);
	        cart.addBasket(itemsListTO1);
	        cart.addBasket(itemsListTO2);
	        cart.addBasket(itemsListTO3);

	        Double actual = basketTotal.getCheckItems(cart);
	        Double expected =(double) Math.round(1.60);
	       
	        assertTrue("Price should be 1.80", actual.compareTo(expected) == 0 );
	    }

	    @Test
	    public void getTotalPriceWith3ItemQuanity1each() throws Exception {
	        Cart cart = new Cart();
	        ItemsListTO itemsListTO1 = new ItemsListTO("Banana",0.60);
	        ItemsListTO itemsListTO2 = new ItemsListTO("Apple",0.50);
	        ItemsListTO itemsListTO3 = new ItemsListTO("Orange",0.40);
	        cart.addBasket(itemsListTO1);
	        cart.addBasket(itemsListTO2);
	        cart.addBasket(itemsListTO3);

	        Double actual = basketTotal.getCheckItems(cart);
	        Double expected = (double) Math.round(1.50);
	       	       
	        assertTrue("Price should be 1.50", actual.compareTo(expected) == 0 );

	    }

	    @Test
	    public void getTotalPriceWithMultiItemMultiQuanity() throws Exception {
	        Cart cart = new Cart();
	        ItemsListTO itemsListTO1 = new ItemsListTO("Banana",0.60);
	        ItemsListTO itemsListTO2 = new ItemsListTO("Apple",0.50);
	        ItemsListTO itemsListTO3 = new ItemsListTO("Orange",0.40);
	        ItemsListTO itemsListTO4 = new ItemsListTO("Banana",0.60);
	        ItemsListTO itemsListTO5 = new ItemsListTO("Orange",0.40);
	        ItemsListTO itemsListTO6 = new ItemsListTO("Orange",0.40);
	        cart.addBasket(itemsListTO1);
	        cart.addBasket(itemsListTO2);
	        cart.addBasket(itemsListTO3);
	        cart.addBasket(itemsListTO4);
	        cart.addBasket(itemsListTO5);
	        cart.addBasket(itemsListTO6);
	        
	        Double actual = basketTotal.getCheckItems(cart);
	        Double expected = (double) Math.round(2.90);
	       

	        assertTrue("Price should be 2.90", actual.compareTo(expected) == 0 );

	    
	}
}
