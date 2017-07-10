package com.basket.main.to;

public class ItemsListTO {
	String items;
	public double price;
	int quantity;
	
	


		public ItemsListTO(String prodName, double eachPrice, int perQuantity) {
			this.items=prodName.toUpperCase();
			this.price=eachPrice;
			this.quantity=perQuantity;
			
		}

	public ItemsListTO( String items,double price) {
			
			this.price = price;
			this.items = items;
		}

		public ItemsListTO() {
		
	}

		public double getPrice() {
			return price;
		}

		public int getQuantity() {
			return quantity;
		}

		public String getItems() {
			return items;
		}

		@Override
		public int hashCode() {
		
			return items.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null || getClass() != obj.getClass())
				return false;
			ItemsListTO it = (ItemsListTO) obj;
			return items.equals(it.items);
		}

	

	
		 
		

}
