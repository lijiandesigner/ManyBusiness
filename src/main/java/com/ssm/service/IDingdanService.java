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
	

	
}
