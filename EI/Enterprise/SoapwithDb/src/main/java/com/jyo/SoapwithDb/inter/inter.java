package com.jyo.SoapwithDb.inter;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jyo.SoapwithDb.dao.DaoClass;

public interface inter extends JpaRepository<DaoClass, String>
{
	
}
