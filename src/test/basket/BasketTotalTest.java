package test.basket;

import org.junit.Before;
import org.junit.Test;

import main.basket.BasketTotal;

public class BasketTotalTest {

	private BasketTotal basketTotal;
	private String productName;
	
	public void set() throws Exception{
		basketTotal=new BasketTotal();
	}
	
	public void getBaseCostMapNull()throws Exception{
		System.out.println("Items base price is null");
	}
	
	public void getCheckItemsNull()throws Exception{
		System.out.println("items list can't be null");
	}
	
	

	    @Before
	    public void setUp() throws Exception {
	        basketTotal = new BasketTotal();

	    }
	    @Test(expected = IllegalArgumentException.class)
	    public void getTotalPriceWithNullItems() throws Exception {
	        double price = basketTotal.getCheckItems(null);
	    }




}
