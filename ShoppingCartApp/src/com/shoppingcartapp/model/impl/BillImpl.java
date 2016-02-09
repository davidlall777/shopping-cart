package com.shoppingcartapp.model.impl;

import java.util.Map;

import com.shoppingcartapp.model.Bill;
import com.shoppingcartapp.model.Customer;
import com.shoppingcartapp.model.Item;

public class BillImpl extends Bill {

	public BillImpl(String id, Customer customer, String status, Map<Item, Integer> itemList, float taxAmount,
			float discountAmount, double billAmount) {
		super(id, customer, status, itemList, taxAmount, discountAmount, billAmount);
		// TODO Auto-generated constructor stub
	}

}
