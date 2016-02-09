package com.shoppingcartapp.service;

import java.util.List;

import com.shoppingcartapp.model.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer customer);
	public Customer getCustomer(String customerId, String customerName);
	public List<Customer> getAllCustomers();
	public Customer updateCustomer(Customer customer);
	public boolean deleteCustomer(Customer customer);
}
