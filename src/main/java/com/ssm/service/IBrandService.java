package com.ssm.service;

import java.util.List;

import com.ssm.dto.Brand;

public interface IBrandService {
	 public List<Brand> selectAllBrand();
	 
	 public void insertBrand(Brand brand);  
	 
}
