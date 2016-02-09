package com.shoppingcartapp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppingcartapp.model.Bill;
import com.shoppingcartapp.model.Customer;
import com.shoppingcartapp.model.ShoppingCart;
import com.shoppingcartapp.service.BillService;

@Service
public class BillServiceImpl implements BillService{

	@Override
	public Bill createBill(ShoppingCart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill getBill(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> getBills(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill updateBill(ShoppingCart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBill(ShoppingCart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBill(Bill bill) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
