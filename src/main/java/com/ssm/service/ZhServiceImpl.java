package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.IZhDao;
import com.ssm.dto.Zh;
import com.ssm.service.IZhService; 
@Service("zhService")
public class ZhServiceImpl implements IZhService {
	@Resource    
    private IZhDao zhDao;
	public void insertZh(Zh zh) {    
        zhDao.insertZh(zh);    
    }
	
	@Override    
    public List<Zh> getAllZh() {    
		
        return zhDao.getAllZh();
        
        
    }
	
	//----------------------hee-------------------------
	 /* 判断用户是否过期
	 * 根据传过来的值 
	 * appid 和appsecre 从数据库获取到时间time1
	 * 当前 时间戳-time1
	 * 大于0 返回0
	 * 小于零 返回账号
	 * */ 
	public Zh selectZhTime(String zh_appid,String zh_appsecre) {
		return zhDao.queryZhByAppoint(null,zh_appid,zh_appsecre);
	}
    //----------------------hee-------------------------
}
