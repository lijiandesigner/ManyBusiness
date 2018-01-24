package com.ssm.dao;

import java.util.List;

import com.ssm.dto.Zh;

public interface IZhDao {
	public void insertZh(Zh zh);
	
	
	public List<Zh> getAllZh(); 
	
	
	
	//----------------hee------------------------------------------------
    /* where 擦查询zh表
     * zh_id 字段
     * zh_appid 字段
     * zh_appsecre 字段
     * */
    public Zh queryZhByAppoint(Integer zh_id,String zh_appid,String zh_appsecre);
    //----------------hee------------------------------------------------
}
