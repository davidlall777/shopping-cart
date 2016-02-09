package com.shoppingcartapp.model;

import java.util.Map;

public abstract class Bill {
	
	private String id;
	private Customer customer;
	private String status;
	private Map<Item,Integer> itemList;
	private float taxAmount;
	private float discountAmount;
	private double billAmount;
	
	protected Bill(String id, Customer customer, String status, Map<Item, Integer> itemList, float taxAmount,
			float discountAmount, double billAmount) {
		this.id = id;
		this.customer = customer;
		this.status = status;
		this.itemList = itemList;
		this.taxAmount = taxAmount;
		this.discountAmount = discountAmount;
		this.billAmount = billAmount;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<Item, Integer> getItemList() {
		return itemList;
	}
	public void setItemList(Map<Item, Integer> itemList) {
		this.itemList = itemList;
	}
	public float getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(float taxAmount) {
		this.taxAmount = taxAmount;
	}
	public float getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(float discountAmount) {
		this.discountAmount = discountAmount;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
}
