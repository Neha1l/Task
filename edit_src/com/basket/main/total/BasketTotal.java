package com.basket.main.total;

import java.util.HashMap;
import java.util.Map.Entry;

import com.basket.main.to.ItemsListTO;

public class BasketTotal {
	
	static double sumEach;
	static double total=0;
	
	static HashMap<String, Double> itemCostPerUnit=Cart.getBaseCostOfItems(); 
 
	static HashMap<ItemsListTO, Integer> basketItems=Cart.getNoOfItems();  
	 	 
	
	 
 	 
		public static double getCheckItems(Cart c) { 
		
			 
 		//Get total cost 
		 
				
			 
				for(Entry<ItemsListTO, Integer> entryTotal:basketItems.entrySet()) { 
			 
					for(Entry<String, Double> costMap:itemCostPerUnit.entrySet()) { 
					 
					if(costMap.getKey().equals(entryTotal.getKey())) { 
								
						//System.out.println("Total Cost of each item "+entryTotal.getKey()); 
	 						
						sumEach	=costMap.getValue()*entryTotal.getValue(); 
	 					
						//System.out.println(costMap.getValue()*entryTotal.getValue()); 
	 						
						total+=sumEach; 
	 					
						//System.out.println("TotalCost="+total); 
	 						} 
	 				} 
	 					} 
	 			return total; 
	 			
	 			 
	 	} 
	 	 

}
