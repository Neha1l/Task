package test.com.basket.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.basket.impl.Cart;
import com.basket.impl.CartImpl;

public class CartTest {
	
	 @Test(expected = IllegalArgumentException.class)
		    public void createItemWithBlankSpaceNameAndPrice() {
		        Cart cart = new CartImpl(" ",0.10);
		    }
		 
		    @Test(expected = IllegalArgumentException.class)
		    public void createItemWithNullNameAndPrice() {
		        Cart cart = new CartImpl(null,(Double) null);
		    }
	
		    @Test(expected = IllegalArgumentException.class)
		    public void createItemWithNullNameAndValidPrice() {
		        Cart cart = new CartImpl(null,0.10);
		    }
	
		    @Test(expected = IllegalArgumentException.class)
		    public void createItemWithValidNameAndNullPrice() {
		        Cart cart = new CartImpl("Test",(Double) null);
		    }
	
		    @Test(expected = IllegalArgumentException.class)
		    public void createItemWithEmptyNameAndValidPrice() {
		        Cart cart = new CartImpl("",0.10);
		    }
		   @Test
		    public void testHashCode() throws Exception {
		        Cart cart1 = new CartImpl("Apple",0.10);
		        Cart cart2 = new CartImpl("apple",0.10);
		       
		        assertEquals("Items should be equal",cart1.hashCode(),cart2.hashCode());
		       
		    }
		   
		   @Test
		    public void testEquals() throws Exception {
		        Cart cart1 = new CartImpl("Apple",0.10);
		        Cart cart2= new CartImpl("Apple",0.10);
		        
	
		        assertEquals("Items should be equal",cart1,cart2);
		      
		    }
}

