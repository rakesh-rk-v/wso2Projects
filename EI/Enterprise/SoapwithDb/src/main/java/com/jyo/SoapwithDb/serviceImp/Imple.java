package com.jyo.SoapwithDb.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jyo.SoapwithDb.dao.DaoClass;
import com.jyo.SoapwithDb.inter.inter;
@Service
public class Imple
{
 @Autowired
 private inter inte;
 public DaoClass method(DaoClass dao)
 {
	return inte.save(dao) ;
	 
 }
 public List<DaoClass> getList(DaoClass dao)
 {
	return inte.findAll() ;
	 
 }

}
