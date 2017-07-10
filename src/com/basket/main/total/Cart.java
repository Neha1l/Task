package com.basket.main.total;

import java.util.HashMap;

import com.basket.main.to.ItemsListTO;

public class Cart {

	private static HashMap<ItemsListTO, Integer> noOfItems;
	private static HashMap<String, Double> baseCostOfItems;

	
	
	
	public static HashMap<ItemsListTO, Integer> getNoOfItems() {
		return noOfItems;
	}


	public static HashMap<String, Double> getBaseCostOfItems() {
		 baseCostOfItems.put("Bananas",10.0); 
		 baseCostOfItems.put("Oranges",15.0); 
		 baseCostOfItems.put("Apples",18.0); 
		 baseCostOfItems.put("Lemons", 20.0); 
		 baseCostOfItems.put("Peaches", 10.0); 
		return baseCostOfItems; 
	}

	public void addBasket(ItemsListTO itemsListTO) { 
		
		
	 		if(noOfItems.containsKey(itemsListTO)) { 
	 			noOfItems.replace(itemsListTO, noOfItems.get(itemsListTO)+1); 
	 		}else { 
	 			noOfItems.put(itemsListTO, 1); 
	 		} 
	 		 
	 	} 
	public void clear() { 
			noOfItems.clear(); 
			} 


	

}
