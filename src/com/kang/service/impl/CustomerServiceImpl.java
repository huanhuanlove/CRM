package com.kang.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.kang.dao.CustomerDao;
import com.kang.service.CustomerService;

@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	

}
