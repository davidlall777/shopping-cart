package com.shoppingcartapp.service;

import java.util.List;

import com.shoppingcartapp.model.Customer;
import com.shoppingcartapp.model.Receipt;

public interface ReceiptService {
	public Receipt createReceipt(Receipt receipt);
	public Receipt getReceipt(String receiptID);
	public List<Receipt> getAllReceipts(Customer customer);
	public Receipt updateReceipt(Receipt receipt);
	public boolean deleteReceipt(Receipt receipt);
}
