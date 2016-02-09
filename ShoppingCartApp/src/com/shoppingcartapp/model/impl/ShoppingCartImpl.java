package com.shoppingcartapp.model.impl;

import java.util.Map;

import com.shoppingcartapp.model.Item;
import com.shoppingcartapp.model.ShoppingCart;

public class ShoppingCartImpl extends ShoppingCart{

	public ShoppingCartImpl(Map<Item, Integer> items, double totalValue) {
		super(items, totalValue);
		// TODO Auto-generated constructor stub
	}

}
