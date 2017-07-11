package test.com.basket.main.total;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.basket.impl.Cart;
import com.basket.impl.CartImpl;
import com.basket.main.total.CheckItems;

public class CheckItemsTest {

	private CheckItems checkItems;
	
	   @Before
	    public void setUp() throws Exception {
	        checkItems = new CheckItems();
	    }

	   @Test(expected = IllegalArgumentException.class)
	    public void addNullItem() {
	        checkItems.addBasket(null);
	    }
	   
	   @Test(expected = IllegalArgumentException.class)
	    public void addItemWithEmptyName() {
	        Cart cart  = new CartImpl("",0.60);
	        checkItems.addBasket(cart);
	        

	    }
	   
	   @Test
	    public void clearsAllItemsFromTheBasket() {
	        Cart cart  = new CartImpl("Apple",0.60);
	        checkItems.addBasket(cart);
	        assertTrue(checkItems.getNoOfItems().size()>0);
	        checkItems.clear();
	        assertEquals("Basket must be empty",0,checkItems.getNoOfItems().size());
	    }
	   
	   @Test(expected = IllegalArgumentException.class)
	    public void addItemWithNameAsBlankSpace() {
	        Cart cart  = new CartImpl(" ",0.60);
	        checkItems.addBasket(cart);
	    }
	   
	   @Test
	    public void addOneItem() {
	        Cart cart  = new CartImpl("Apple",0.60);
	        checkItems.addBasket(cart);

	        assertEquals("Should have 1 item",1,checkItems.getNoOfItems().size());
	    }
	   
	   @Test
	    public void addTwoDifferentItems() {
	        Cart cart1  = new CartImpl("Apple",0.60);
	        Cart cart2  = new CartImpl("banana",0.40);
	        checkItems.addBasket(cart1);
	        checkItems.addBasket(cart2);
	        

	        assertEquals("Should have 1 item",2,checkItems.getNoOfItems().size());
	    }
	   
	    @Test
	    public void add2ItemsOfSameType() {
	        Cart cart1  = new CartImpl("Apple",0.60);
	        Cart cart2  = new CartImpl("Apple",0.60);
	        checkItems.addBasket(cart1);
	        checkItems.addBasket(cart2);

	        assertEquals("Should have 1 item with qty as 2",1,checkItems.getNoOfItems().size());
	        assertEquals("Should have 1 item with qty as 2",new Integer(2),checkItems.getNoOfItems().get(cart1));
	    }

}
