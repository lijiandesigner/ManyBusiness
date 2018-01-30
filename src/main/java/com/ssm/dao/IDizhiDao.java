package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.dto.Dizhi;
import com.ssm.dto.Food;

public interface IDizhiDao {
	public void insertDizhi(Dizhi dizhi);
	
	public List<Dizhi> getAllDizhi(); 
	
	
	//----------------hee*start----------------------------------------------
	/* 根据 dizhi_zh和dizhi_user 获取用户对应的 地址 List对象
     * dizhi_zh Integer
     * dizhi_user Integer
     * */
	public List<Dizhi> getDizhiByZhUser(@Param("dizhi_zh")Integer dizhi_zh,@Param("dizhi_user")Integer dizhi_user);
	//----------------hee*end------------------------------------------------
}
