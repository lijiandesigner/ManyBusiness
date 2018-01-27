package com.ssm.service;

import java.util.List;

import com.ssm.dto.Brand;

public interface IBrandService {
	 public List<Brand> selectAllBrand();
	 
	 public void insertBrand(Brand brand);  
	 
	 //----------------hee------------------------------------------------
	    /* 获取 所有分类
	     * OrderBy  string  排序方式 大写
	     * */
	 public List<Brand> getAllBrandOrderBy(Integer brand_zh, String OrderBy);
	 //----------------hee------------------------------------------------
}
