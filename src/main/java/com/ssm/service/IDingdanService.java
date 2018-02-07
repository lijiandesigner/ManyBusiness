package com.ssm.service;
import java.util.List;

import com.ssm.dto.Dingdan;
public interface IDingdanService {
	public void insertDingdan(Dingdan dingdan);
	
	
	
	//---------------------------buzhiweihe-------------------
	
	/*
	 * 根据商户id查询该商户的所有已完成订单信息
	 */
		public List<Dingdan> getAllDingdan(Integer zh_zh);
	//---------------------------buzhiweihe-------------------
	
	public List<Dingdan> selectByList();
	 

	//----------------hee*start----------------------------------------------
	/* 根据 dingdan_zh和dingdan_openid 获取用户对应的 订单 List对象
     * dingdan_zh Integer
     * dingdan_openid String
     * fenye 是否分页
     * */ 
	public List<Dingdan> getAllByOpenid(Integer dingdan_zh,String dingdan_openid,String fenye);
	
	//----------------hee*end------------------------------------------------
}
