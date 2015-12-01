package com.ws.customer.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ws.customer.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Resource
	private SessionFactory sessionFactory;

	public Customer getCustomer(int customer_id) {
		Customer customer = (Customer) sessionFactory.getCurrentSession().get(
				Customer.class, customer_id);
		return customer;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomer() {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"from customer");
		List<Customer> customerList = query.list();
		return customerList;
	}

	public void addCustomer(Customer customer) {
		sessionFactory.getCurrentSession().save(customer);
	}

	public void deleteCustomer(int customer_id) {
		Customer customer = getCustomer(customer_id);
		sessionFactory.getCurrentSession().delete(customer);
	}

}
