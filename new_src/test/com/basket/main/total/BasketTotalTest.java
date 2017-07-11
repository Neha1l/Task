package test.com.basket.main.total;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.basket.impl.Cart;
import com.basket.impl.CartImpl;
import com.basket.main.total.BasketTotal;
import com.basket.main.total.CheckItems;

public class BasketTotalTest {

	 private BasketTotal basketTotal;
	    CheckItems checkItems;
	    

	    @Before
	    public void setUp() throws Exception {
	        basketTotal = new BasketTotal();

	    }

	    @Test
	    public void getTotalPriceWithNoItems() throws Exception {
	    	CheckItems checkItems=new CheckItems();
	        Double actual = basketTotal.getCheckItems(checkItems);
	        Double expected = 0.00;
	       
	        assertTrue("Price should be 0",actual.compareTo(expected) == 0 );
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void getTotalPriceWithNullItems() throws Exception {
	        Double price = basketTotal.getCheckItems(null);
	    }

	    @Test
	    public void getTotalPriceWithOneItem() throws Exception {
	    	CheckItems checkItems=new CheckItems();
	        Cart cart1 = new CartImpl();
	        Cart cart2 = new CartImpl("Banana",0.60);
	        checkItems.addBasket(cart2);

	        Double actual = basketTotal.getCheckItems(checkItems);
	        Double expected =(double) Math.round(0.60);
	        
	        
	        
	        assertTrue("Price should be 0.60",actual.compareTo(expected) == 0 );
	    }

	    @Test
	    public void getTotalPriceWith1Item3Quanity() throws Exception {
	    	CheckItems checkItems=new CheckItems();
	        String name = "Banana";
	        double price = 0.60;
	        Cart cart1 = new CartImpl(name,price);
	        Cart cart2 = new CartImpl(name,price);
	        Cart cart3 = new CartImpl(name,price);
	        checkItems.addBasket(cart1);
	        checkItems.addBasket(cart2);
	        checkItems.addBasket(cart3);

	        Double actual = basketTotal.getCheckItems(checkItems);
	        Double expected =(double) Math.round(1.60);
	       
	        assertTrue("Price should be 1.80", actual.compareTo(expected) == 0 );
	    }

	    @Test
	    public void getTotalPriceWith3ItemQuanity1each() throws Exception {
	    	CheckItems checkItems=new CheckItems();
	        Cart cart1 = new CartImpl("Banana",0.60);
	        Cart cart2 = new CartImpl("Apple",0.50);
	        Cart cart3 = new CartImpl("Orange",0.40);
	        checkItems.addBasket(cart1);
	        checkItems.addBasket(cart2);
	        checkItems.addBasket(cart3);

	        Double actual = basketTotal.getCheckItems(checkItems);
	        Double expected = (double) Math.round(1.50);
	       	       
	        assertTrue("Price should be 1.50", actual.compareTo(expected) == 0 );

	    }

	    @Test
	    public void getTotalPriceWithMultiItemMultiQuanity() throws Exception {
	    	CheckItems checkItems=new CheckItems();
	        Cart cart1 = new CartImpl("Banana",0.60);
	        Cart cart2 = new CartImpl("Apple",0.50);
	        Cart cart3 = new CartImpl("Orange",0.40);
	        Cart cart4 = new CartImpl("Banana",0.60);
	        Cart cart5 = new CartImpl("Orange",0.40);
	        Cart cart6 = new CartImpl("Orange",0.40);
	        checkItems.addBasket(cart1);
	        checkItems.addBasket(cart2);
	        checkItems.addBasket(cart3);
	        checkItems.addBasket(cart4);
	        checkItems.addBasket(cart5);
	        checkItems.addBasket(cart6);
	        
	        
	        Double actual = basketTotal.getCheckItems(checkItems);
	        Double expected = (double) Math.round(2.90);
	       

	        assertTrue("Price should be 2.90", actual.compareTo(expected) == 0 );

	    
	}
}
