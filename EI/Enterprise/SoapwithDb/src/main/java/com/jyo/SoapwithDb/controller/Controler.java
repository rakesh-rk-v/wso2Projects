package com.jyo.SoapwithDb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controler 
{
	@Autowired
	RestTemplate rest;
	
	@RequestMapping(value="/send",method=RequestMethod.POST)
	public String call() {
	
		String uri ="http://localhost:8080/Employee/services/EmployeeServiceImpl";
		String result = rest.getForObject(uri,String.class);
	
		return result; 
	}
	@RequestMapping(value="/send",method=RequestMethod.GET)
	public String getcall() {
	
		String uri ="http://localhost:8080/Employee/services/EmployeeServiceImpl";
		String result = rest.getForObject(uri,String.class);
	
		return result; 
	}
	
// @RequestMapping(value="/jyo",method=RequestMethod.POST)
//  public DaoClass meth1(DaoClass dao)
//  {
//	return imp.method(dao);
//	  
//  }
// @RequestMapping(value="/jyothi",method=RequestMethod.GET)
// public List<DaoClass> meth2(DaoClass dao)
// {
//	return imp.getList(dao);
//	  
// }
}
