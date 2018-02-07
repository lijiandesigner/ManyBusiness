package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.dto.Dizhi;
import com.ssm.dto.Food;

public interface IDizhiDao {
	public void inserDizhi(Dizhi dizhi);
	
	public List<Dizhi> getAllDizhi(); 
	
	
	//----------------hee*start----------------------------------------------
	
	/* 根据 dizhi_zh和dizhi_user 获取用户对应的 地址 List对象
     * dizhi_zh Integer
     * dizhi_user Integer
     * */
	public List<Dizhi> getDizhiByZhUser(@Param("dizhi_zh")Integer dizhi_zh,@Param("dizhi_user")Integer dizhi_user,@Param("dizhi_select")Integer dizhi_select);
	
	/* dizhi_zh dizhi_user 确定数据 把 dizhi_select 更新为0
     * dizhi_zh Integer
     * dizhi_user Integer
     * */
	public void updateByBuff(@Param("dizhi_select")Integer dizhi_select,@Param("dizhi_zh")Integer dizhi_zh,@Param("dizhi_user")Integer dizhi_user,@Param("id")Integer id);
	
	/* 更新  dizhi_name dizhi_sex dizhi_phone dizhi_dizhi dizhi_menpai 根据 id
     * */
	public void updateById(Dizhi dizhi);
	
	/* 删除  地址 根据 id 和dizhi_zh
     * */
	public void deleteById(@Param("dizhi_zh")Integer dizhi_zh,@Param("id")Integer id);
	
	//----------------hee*end------------------------------------------------
}
