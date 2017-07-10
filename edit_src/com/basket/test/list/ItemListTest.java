package com.basket.test.list;

import static org.junit.Assert.*;

import org.junit.Test;

import com.basket.main.to.ItemsListTO;
import com.basket.main.total.Cart;

public class ItemListTest {
	
	 @Test(expected = IllegalArgumentException.class)
	    public void createItemWithBlankSpaceNameAndPrice() {
	        ItemsListTO itemsListTO = new ItemsListTO(" ",0.10);
	    }
	 
	    @Test(expected = IllegalArgumentException.class)
	    public void createItemWithNullNameAndPrice() {
	        ItemsListTO itemsListTO = new ItemsListTO(null,(Double) null);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void createItemWithNullNameAndValidPrice() {
	        ItemsListTO itemsListTO = new ItemsListTO(null,0.10);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void createItemWithValidNameAndNullPrice() {
	        ItemsListTO itemsListTO = new ItemsListTO("Test",(Double) null);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void createItemWithEmptyNameAndValidPrice() {
	        ItemsListTO itemsListTO = new ItemsListTO("",0.10);
	    }
	   @Test
	    public void testHashCode() throws Exception {
	        ItemsListTO itemsListTO1 = new ItemsListTO("Apple",0.10);
	        ItemsListTO itemsListTO2 = new ItemsListTO("apple",0.10);
	       
	        assertEquals("Items should be equal",itemsListTO1.hashCode(),itemsListTO2.hashCode());
	       
	    }
	   
	   @Test
	    public void testEquals() throws Exception {
	        ItemsListTO itemsListTO1 = new ItemsListTO("Apple",0.10);
	        ItemsListTO itemsListTO2= new ItemsListTO("Apple",0.10);
	        

	        assertEquals("Items should be equal",itemsListTO1,itemsListTO2);
	      
	    }
}