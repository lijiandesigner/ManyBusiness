package com.ssm.service;

import java.util.List;

import com.ssm.dto.Zh;

public interface IZhService {
	public void insertZh(Zh zh);
	
	
	
	
	public List<Zh> getAllZh();
	
	//----------------------hee-------------------------
	 /* 判断用户是否过期
	 * 根据传过来的值 
	 * appid 和appsecre 从数据库获取到时间time1
	 * 当前 时间戳-time1
	 * 大于0 返回0
	 * 小于零 返回账号
	 * */ 
    public Zh selectZhTime(String zh_appid,String zh_appsecre);
    //----------------------hee-------------------------
    
  //----------------------buzhiweihe-------------------------
    public Zh getZhByzh(String zh_zh);
    
  //----------------------buzhiweihe-------------------------
}
