package test.basket;

import static org.junit.Assert.*;

import org.junit.Test;

import main.basket.Items;

public class ItemsTest {

	private Items items;
	private String productName;
	public void setUp() throws Exception{
		items =new Items();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void addNullBasket() {
		items.addBasket(null);
	}
	
    
	public void clearAll() {
	    items  = new Items("Apple",0.60);
        items.addBasket(productName);
        assertTrue(items.getProductName().length()>0);
        items.clear();
        assertEquals("Basket must be empty",0,items.getProductName().length());
    
	}
	 @Test(expected = IllegalArgumentException.class)
	    public void createItemWithNullNameAndPrice() {
	        items = new Items(null,null);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void createItemWithNullName() {
	         items = new Items(null,0.10);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void createItemWithNullPrice() {
	         items = new Items("Test",null);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void createItemWithEmptyName() {
	         items = new Items("",0.10);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void createItemWithBlankSpaceName() {
	         items = new Items(" ",0.10);
	    }


	    @Test
	    public void testEquals() throws Exception {
	        Items item1 = new Items("Apple",0.10);
	        Items item2 = new Items("apple",0.10);

	        assertEquals("Items should be equal",item1,item2);
	        
	    }

	    @Test
	    public void testHashCode() throws Exception {
	        Items item1 = new Items("Apple",0.10);
	        Items item2 = new Items("apple",0.10);
	        Items item3 = new Items("apple",0.10);

	        assertEquals("Items should be equal",item1.hashCode(),item2.hashCode());
	        
	    }
	    
	    
	    @Test(expected = IllegalArgumentException.class)
	    public void addBasketWithEmptyName() {
	         items  = new Items("",0.60);
	        items.addBasket(productName);

	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void addBasketWithNameAsBlankSpace() {
	         items  = new Items(" ",0.60);
	        items.addBasket(productName);
	    }

	    @Test
	    public void addOneItem() {
	         items  = new Items("Apple",0.60);
	         items.addBasket(productName);

	        assertEquals("Should have 1 item",1,items.getNoOfItemMap().size());
	    }

	    @Test
	    public void addDifferentItems() {
	        Items item1  = new Items("Apple",0.60);
	        Items item2  = new Items("banana",0.40);
	        items.addBasket(productName);
	        

	        assertEquals("Should have 1 item",2,items.getNoOfItemMap().size());
	    }

	    @Test
	    public void addItemsOfSameType() {
	        Items item1  = new Items("Apple",0.60);
	        Items item2  = new Items("Apple",0.60);
	        items.addBasket(productName);
	        

	        assertEquals("Should have 1 item with qty as 2",1,items.getNoOfItemMap().size());
	        assertEquals("Should have 1 item with qty as 2",new Integer(2),items.getNoOfItemMap().get(item1));
	    }
}
