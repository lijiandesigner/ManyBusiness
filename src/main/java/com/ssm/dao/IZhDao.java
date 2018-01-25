package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
    public Zh queryZhByAppoint(@Param("zh_id")Integer zh_id,@Param("zh_appid")String zh_appid,@Param("zh_appsecre")String zh_appsecre);
    //public Zh queryZhByAppoint(String zh_appid,String zh_appsecre);
    //----------------hee------------------------------------------------
    
    
    
    //------------------buzhiweihe-------------------------------------
    public Zh getZhByzhD(String zh_zh);
    //------------------byzhiweihe-------------------------------------
}
