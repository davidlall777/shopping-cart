package com.shoppingcartapp.service;

import java.util.List;

import com.shoppingcartapp.model.Bill;
import com.shoppingcartapp.model.Customer;
import com.shoppingcartapp.model.ShoppingCart;

public interface BillService {
	public Bill createBill(ShoppingCart cart);
	public Bill getBill(Customer customer);
	public List<Bill> getBills(Customer customer);
	public Bill updateBill(ShoppingCart cart);
	public boolean deleteBill(ShoppingCart cart);
	public boolean deleteBill(Bill bill);
}
