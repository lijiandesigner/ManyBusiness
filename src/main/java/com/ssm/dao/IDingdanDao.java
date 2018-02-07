package com.ssm.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.dto.Brand;
import com.ssm.dto.Dingdan;
import com.ssm.dto.Dizhi;
import com.ssm.dto.Food;
public interface IDingdanDao {
	            
	 public List<Dingdan> getAllDingdan(Integer zh_zh); 
	 
	 public void insertDingdan(Dingdan Dingdan);
	 public List<Dingdan> selectByList();
	 
	 
	
	//----------------hee*start----------------------------------------------
		
	/* 根据 dingdan_zh和dingdan_openid 获取用户对应的 订单 List对象
     * dingdan_zh Integer
     * dingdan_openid String
     * fenye 是否分页
     * */
	public List<Dingdan> selectAllByOpenid(@Param("dingdan_zh")Integer dingdan_zh,@Param("dingdan_openid")String dingdan_openid,@Param("fenye")String fenye);
	
	//----------------hee*end------------------------------------------------
}
