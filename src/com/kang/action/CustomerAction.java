package com.kang.action;

import com.kang.dao.BaseDao;
import com.kang.domin.Customer;
import com.kang.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	private static final long serialVersionUID = 1L;
	private Customer customer = new Customer();
	private CustomerService customerService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	public void setCustom(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public Customer getModel() {
		return customer;
	}
	
	
	//**********************************************************************
	
	//跳转到添加页面
	public String toAddPage() {	
		
		return "toAddPage";
	}
	
	
	//顾客添加
	public String addCustom() {
		customerService.add(customer);
		return "addCustom";
	}

}
