package main.basket;

import java.util.HashMap;
import java.util.Map.Entry;

public class BasketTotal {

	static double sumEach;
	static double total=0;
	static HashMap<String, Double> itemCostPerUnit=BasketTotal.getBaseCostMap();
	static HashMap<String,Integer> noOfItemsPicked= new HashMap<String,Integer>();
	
	private static HashMap<String, Double> baseCostMap=new HashMap<>();
	
	public static HashMap<String, Double> getBaseCostMap() {
		 baseCostMap.put("Bananas",10.0);
		 baseCostMap.put("Oranges",15.0);
		 baseCostMap.put("Apples",18.0);
		 baseCostMap.put("Lemons", 20.0);
		 baseCostMap.put("Peaches", 10.0);
		return baseCostMap;
	}
	public static double getCheckItems(Items items) {
		if(items==null) {
			throw new IllegalArgumentException("Basket can't be null");
		}
		
		//Get total cost
		
			HashMap<String, Integer> basketItems=items.getNoOfItemMap();
			
			for(Entry<String, Integer> entryTotal:noOfItemsPicked.entrySet()) {
			
				for(Entry<String, Double> costMap:itemCostPerUnit.entrySet()) {
				
					if(costMap.getKey().equals(entryTotal.getKey())) {
							System.out.println("Total Cost of each item "+entryTotal.getKey());
						sumEach	=costMap.getValue()*entryTotal.getValue();
						System.out.println(costMap.getValue()*entryTotal.getValue());
						total+=sumEach;
						System.out.println("TotalCost="+total);
						}
				}
					}
			return total;
			
	}
	
}

