package com.shoppingcartapp.model.service;

import java.util.Map;

import com.shoppingcartapp.model.Bill;
import com.shoppingcartapp.model.Customer;
import com.shoppingcartapp.model.Item;
import com.shoppingcartapp.model.Receipt;
import com.shoppingcartapp.model.ShoppingCart;
import com.shoppingcartapp.model.impl.BillImpl;
import com.shoppingcartapp.model.impl.ReceiptImpl;
import com.shoppingcartapp.model.impl.ShoppingCartImpl;

public class ModelFactoryService {

	public Bill createBill(String id, Customer customer, String status, Map<Item, Integer> itemList, float taxAmount,
			float discountAmount, double billAmount) {
		return new BillImpl(id, customer, status, itemList, taxAmount, discountAmount, billAmount);
	}
	
	public Receipt createReceipt(String id, Bill bill) {
		return new ReceiptImpl(id,bill);
	}
	
	public ShoppingCart createShoppingCart(Map<Item, Integer> items, double totalValue){
		return new ShoppingCartImpl(items,totalValue);
	}
}
