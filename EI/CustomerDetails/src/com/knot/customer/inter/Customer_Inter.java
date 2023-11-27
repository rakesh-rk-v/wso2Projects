package com.knot.customer.inter;

import com.knot.customer.model.Address;
import com.knot.customer.model.Customer;

public interface Customer_Inter {
	public String insertCustomerDetails(Customer cust);
	public Customer getCustomerById(String id);
	public String insertCustomerAddress(Address add);
	public Address getAddressDetailsById(String id);
	public Customer getCustomerByIdWithDelay(String id);
}
