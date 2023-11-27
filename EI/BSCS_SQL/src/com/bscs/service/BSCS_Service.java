package com.bscs.service;

import java.util.ArrayList;
import java.util.List;

import com.bscs.model.TestDataModel;
import com.bscs.model.TestModel;

public class BSCS_Service implements TestModel {
	
	List<TestDataModel> list = new ArrayList<TestDataModel>();
	TestDataModel tdm = new TestDataModel();
	
	@Override
	public TestDataModel getDataFromDB() {
		tdm.setCity("Hyderabad");
		list.add(tdm);
		return tdm;
	}

}
