package com.shoppingcartapp.model;

import java.util.Map;

public abstract class ShoppingCart {
	private Map<Item,Integer> items;
	private double totalValue;
	
	protected ShoppingCart(Map<Item, Integer> items, double totalValue) {
		super();
		this.items = items;
		this.totalValue = totalValue;
	}
	
	public Map<Item, Integer> getItems() {
		return items;
	}
	public void setItems(Map<Item, Integer> items) {
		this.items = items;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	
}
