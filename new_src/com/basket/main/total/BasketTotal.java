package com.basket.main.total;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

import com.basket.impl.Cart;
import com.basket.impl.CartImpl;


public class BasketTotal {

	
		static double total=0;
		
		static Map<Cart, Integer> itemCostPerUnit=CheckItems.getNoOfItems(); 
			 
		 static Cart cart = new CartImpl();
	
		 public static double getCheckItems(CheckItems checkItems) { 
				
				 
	 		//Get total cost 
			 
									 
					
					if(checkItems.getNoOfItems().keySet().equals(cart.getItems()))
					{
					
					total=cart.getPrice()*itemCostPerUnit.get(cart);
					}
		 			return total; 
		 			
		 			 
			}
		 	 

}
