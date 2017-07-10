package main.basket;

import java.util.HashMap;

public class Items {

	private String productName;
	private Double price;
	
	private HashMap<String, Integer> noOfItemMap;
	
	
	public String getProductName() {
		return productName;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public HashMap<String, Integer> getNoOfItemMap() {
		return noOfItemMap;
	}
	public void setNoOfItemMap(HashMap<String, Integer> noOfItemMap) {
		this.noOfItemMap = noOfItemMap;
	}
	
	public Items(String productName){
		this.productName=productName;
	}
public Items(String productName, Double price) {
		
		if(productName == null||productName.isEmpty()) {
			throw new IllegalArgumentException("Item name can't be null");
		}
		if(price == null ||price<0.0) {
			 throw new IllegalArgumentException("Item price can not be null or less than 0.0");
		}
		
		this.productName=productName.toUpperCase();
		this.price=price;
	}
	
	public Items() {
		noOfItemMap= new HashMap<>();
	}
	
	public void addBasket(String productName) {
		if(productName==null) {
			throw new IllegalArgumentException("Basket can't be null");
		}
		if(noOfItemMap.containsKey(productName)) {
			noOfItemMap.replace(productName, noOfItemMap.get(productName)+1);
		}else {
			noOfItemMap.put(productName, 1);
		}
		
	}
	
	public void clear() {
		noOfItemMap.clear();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null||getClass() != obj.getClass())
			return false;
		Items it=(Items) obj;
		return productName.equals(it.productName);
	}
	
	@Override
	public int hashCode() {
		
		return productName.hashCode();
	}
}
