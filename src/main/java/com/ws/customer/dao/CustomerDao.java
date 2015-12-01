package com.ws.customer.dao;

import java.util.List;

import com.ws.customer.model.Customer;

public interface CustomerDao {
	
	public Customer getCustomer(int customer_id);

	public List<Customer> getAllCustomer();
	
	public void addCustomer(Customer customer);
	
	public void deleteCustomer(int customer_id);
}
