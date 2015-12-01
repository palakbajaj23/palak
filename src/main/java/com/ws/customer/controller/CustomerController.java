package com.ws.customer.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ws.customer.model.Customer;
import com.ws.customer.service.CustomerService;

@RestController
public class CustomerController {
	@Resource
	private CustomerService customerService;

	@RequestMapping(value = CustomerRestURIConstants.GET_CUSTOMER, method = RequestMethod.GET)
	public Customer customerdetail(@PathVariable("id") int customerid) {
		Customer customerdetails = customerService.getCustomer(customerid);
		return customerdetails;
	}

	@RequestMapping(value = CustomerRestURIConstants.GET_ALL_CUSTOMER, method = RequestMethod.GET)
	public List<Customer> customerList() {
		List<Customer> customerList = customerService.getAllCustomer();
		return customerList;
	}

	@RequestMapping(value = CustomerRestURIConstants.CREATE_CUSTOMER, method = RequestMethod.POST)
	public String addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return "Customer Added Successfully!";
	}
	@RequestMapping(value= CustomerRestURIConstants.DELETE_CUSTOMER, method = RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable("id") int customerid){
		customerService.deleteCustomer(customerid);
		return "Customer Deleted Successfully";
	}
}
