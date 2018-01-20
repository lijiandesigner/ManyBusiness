package com.ssm.dao;

import java.util.List;

import com.ssm.dto.Brand;
import com.ssm.dto.User;

public interface IBrandDao {
	
	 public List<Brand> getAllBrand(); 
	 
	 public void insertBrand(Brand brand);
}
