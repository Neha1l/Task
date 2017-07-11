package com.basket.impl;

public class CartImpl implements Cart {

	public String items;
	double price;
	
	

	public CartImpl(String items,double price){
	this.items=items.toLowerCase();
	this.price=price;
	}
  

	public CartImpl() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getItems() {
		// TODO Auto-generated method stub
		return this.items;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public int hashCode() {
	
		return items.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;;
		
		CartImpl cartImpl = (CartImpl) obj;
		if(items.equals(cartImpl.items))
			result= true;
		
		return result;
	}
	
	
}
