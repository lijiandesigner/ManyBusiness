package com.ssm.dao;
import java.util.List;

import com.ssm.dto.Brand;
import com.ssm.dto.Dingdan;
public interface IDingdanDao {
	            
	 public List<Dingdan> getAllDingdan(); 
	 
	 public void insertDingdan(Dingdan Dingdan);
	 public List<Dingdan> selectByList();
}
