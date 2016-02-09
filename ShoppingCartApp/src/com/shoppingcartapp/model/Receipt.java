package com.shoppingcartapp.model;

public abstract class Receipt {
	private String id;
	private Bill bill;
	
	protected Receipt(String id, Bill bill) {
		this.id = id;
		this.bill = bill;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
		
}
