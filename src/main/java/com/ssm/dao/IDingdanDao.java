package com.ssm.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.dto.Brand;
import com.ssm.dto.Dingdan;
import com.ssm.dto.Food;
public interface IDingdanDao {
	            
	 public List<Dingdan> getAllDingdan(Integer zh_zh); 
	 
	 public void insertDingdan(Dingdan Dingdan);
	 public List<Dingdan> selectByList();
	 
	 
	

}
