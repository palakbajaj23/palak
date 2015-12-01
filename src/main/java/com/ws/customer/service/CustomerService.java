package com.ws.customer.service;

import java.util.List;

import com.ws.customer.model.Customer;

public interface CustomerService {

	public Customer getCustomer(int customer_id);

	public List<Customer> getAllCustomer();
	
	public void addCustomer(Customer customer);
	
	public void deleteCustomer(int customer_id);
}
