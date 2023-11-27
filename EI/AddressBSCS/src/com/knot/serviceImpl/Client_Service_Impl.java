package com.knot.serviceImpl;
import java.util.ArrayList;

import com.knot.inter.Clinet_Inter;
import com.knot.model.Address;

import com.knot.service.Clientservice;

public  class Client_Service_Impl implements Clinet_Inter{
	Clientservice cs = new Clientservice();
	@Override
	public String insert_Client_Address(Address add) {
		return cs.insert_Client_Address(add);
	}
	@Override
	public ArrayList<Address> getAllCustomerAddresses() {
		return cs.getAllCustomerAddresses();
	}
	@Override
	public Address getAddressWithDelay() {
		
		return null;
	}

}
