package com.basket.main.total;

import java.util.TreeMap;

import com.basket.impl.Cart;

public class CheckItems {


	private static TreeMap<Cart, Integer> noOfItems;
	
	public CheckItems() {
	noOfItems=new TreeMap<>();
	}
	
	public static TreeMap<Cart, Integer> getNoOfItems() {
		return noOfItems;
	}


	

	//count the quantity 
	public TreeMap<Cart, Integer> addBasket(Cart cart) { 
		noOfItems.put(cart, 1);
		
		if(noOfItems.containsKey(cart)) { 
	 			noOfItems.replace(cart, noOfItems.get(cart)+1); 
	 		}
		return noOfItems; 
	 	
		
	 	} 
	//Clears all items
	public void clear() { 
			noOfItems.clear(); 
			} 

}
