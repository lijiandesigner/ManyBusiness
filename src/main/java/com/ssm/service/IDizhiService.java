package com.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.dto.Dizhi;

public interface IDizhiService {
	public void insertDizhi(Dizhi dizhi);
	
	
	
	
	public List<Dizhi> getAllDizhi();
	
	
	//----------------hee*start----------------------------------------------
	
	/* 根据 dizhi_zh和dizhi_user 获取用户对应的 地址 List对象
     * dizhi_zh Integer
     * dizhi_user Integer
     * */
	public List<Dizhi> selectDizhiByZhUser(Integer dizhi_zh,Integer dizhi_user);
	
	/* dizhi_zh dizhi_user 确定数据 把 dizhi_select 更新为0
     * dizhi_zh Integer
     * dizhi_user Integer
     * */
	public void setByBuff(Integer dizhi_select,Integer dizhi_zh,Integer dizhi_user);
	public void setByBuffId(Integer dizhi_select,Integer dizhi_zh,Integer id);
	
	/* 更新  dizhi_name dizhi_sex dizhi_phone dizhi_dizhi dizhi_menpai 根据 id
     * */
	public void setateById(Dizhi dizhi);
	
	/* 删除  地址 根据 id 和dizhi_zh
     * */
	public void shanById(Integer dizhi_zh,Integer id);
	
	//----------------hee*end------------------------------------------------
}
