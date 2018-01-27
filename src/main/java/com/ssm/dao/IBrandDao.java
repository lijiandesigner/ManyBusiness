package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.dto.Brand;
import com.ssm.dto.Zh;

public interface IBrandDao {
	
	 public List<Brand> selectAllBrand(); 
	 
	 
	 public void insertBrand(Brand brand);
	 
	//----------------hee------------------------------------------------
	    /* 获取 所有分类
	     * OrderBy  string  排序方式 大写
	     * */
    public List<Brand> selectAllBrandOrderBy(@Param("brand_zh")Integer brand_zh,@Param("OrderBy")String OrderBy);
    //----------------hee------------------------------------------------
}
