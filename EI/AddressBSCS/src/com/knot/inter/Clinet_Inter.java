package com.knot.inter;



import java.util.ArrayList;
import com.knot.model.Address;

public interface Clinet_Inter {
	public String insert_Client_Address(Address add);
	public ArrayList<Address> getAllCustomerAddresses() ;
	public Address getAddressWithDelay();

	
}
