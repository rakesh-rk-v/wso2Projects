package com.knot.customer.service;

import com.knot.customer.inter.Customer_Inter;
import com.knot.customer.model.Address;
import com.knot.customer.model.Customer;

public class CustomerService implements Customer_Inter{
	Customer_Service_Impl CS = new Customer_Service_Impl();
	@Override
	public String insertCustomerDetails(Customer cust) {
		return CS.insertCustomerDetails(cust);
	}

	@Override
	public Customer getCustomerById(String id) {
		return CS.getCustomerById(id);
	}
	@Override
	public String insertCustomerAddress(Address add) {
		return CS.insertCustomerAddress(add);
	}

	@Override
	public Address getAddressDetailsById(String id) {
		return CS.getAddressDetailsById(id);
	}


	@Override
	public Customer getCustomerByIdWithDelay(String id) {
		System.out.println("Cs "+ id);
		return CS.getCustomerByIdWithDelay(id);
	}
}
