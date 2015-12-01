package com.ws.customer.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ws.customer.dao.CustomerDao;
import com.ws.customer.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Resource
	private CustomerDao customerDao;

	public Customer getCustomer(int customer_id) {
		return customerDao.getCustomer(customer_id);
	}

	public List<Customer> getAllCustomer() {
		return customerDao.getAllCustomer();
	}

	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	public void deleteCustomer(int customer_id) {
		customerDao.deleteCustomer(customer_id);
	}

}
