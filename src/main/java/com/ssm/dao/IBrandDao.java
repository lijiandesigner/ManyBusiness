package com.ssm.dao;

import java.util.List;

import com.ssm.dto.Brand;

public interface IBrandDao {
	
	 public List<Brand> selectAllBrand(); 
	 
	 
	 public void insertBrand(Brand brand);
}
