package com.shoppingcartapp.model;

import java.util.List;
import java.util.Map;

public abstract class ShoppingCart {
	private Map<Item,Integer> itemMap;
	private List<Item> items;
	private List<Integer> quantities;
	private double totalValue=0.0;
	
	protected ShoppingCart(List<Item> items, List<Integer> quantities, double totalValue) {
		this.items = items;
		this.quantities = quantities;
		this.totalValue = totalValue;
	}
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Integer> getQuantities() {
		return quantities;
	}

	public void setQuantities(List<Integer> quantities) {
		this.quantities = quantities;
	}

	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	
}
