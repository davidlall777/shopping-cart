package com.shoppingcartapp.service;

import java.util.List;

import com.shoppingcartapp.model.PaymntMethod;

public interface PaymntMethodService {

	public PaymntMethod createPaymntMethod(PaymntMethod paymntMethod);
	public PaymntMethod getPaymntMethod(String paymntMethodID);
	public List<PaymntMethod> getAllPaymntMethods();
	public PaymntMethod updatePaymntMethod(PaymntMethod paymntMethod);
	public boolean deleteUnusedPaymntMethod(PaymntMethod paymntMethod);
	public boolean deactivatePaymntMethod(PaymntMethod paymntMethod);
}
