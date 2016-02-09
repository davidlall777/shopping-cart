package com.shoppingcartapp.service;

import com.shoppingcartapp.model.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer);
	public Customer getCustomer(String customerName);
	public Customer updateCustomer(Customer customer);
	public boolean deleteCustomer(Customer customer);
}
