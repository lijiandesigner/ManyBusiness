package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.ssm.service.IDingdanService;
import com.ssm.dao.IDingdanDao;
import com.ssm.dto.Dingdan;
import com.ssm.dto.Dizhi;

@Service("dingdanService")
public class DingdanServiceImpl implements IDingdanService {
	private static final String Integer = null;
	@Resource    
    private IDingdanDao dingdanDao;
	
	public void insertDingdan(Dingdan dingdan) {    
        dingdanDao.insertDingdan(dingdan);    
    }
	
	@Override            
    public List<Dingdan> getAllDingdan(Integer zh_zh) {    
        return dingdanDao.getAllDingdan(zh_zh);    
        
    } 
	public List<Dingdan> selectByList() {
        return this.dingdanDao.selectByList();
    }
	
	//----------------hee*start----------------------------------------------
	/* 根据 dingdan_zh和dingdan_openid 获取用户对应的 订单 List对象
     * dingdan_zh Integer
     * dingdan_openid String
     * fenye 是否分页
     * */
	@Override 
	public List<Dingdan> getAllByOpenid(Integer dingdan_zh,String dingdan_openid,String fenye){
		List<Dingdan> dingdan=dingdanDao.selectAllByOpenid(dingdan_zh,dingdan_openid,fenye);
		if(dingdan==null) {
			return null;
		}
		return dingdan;
	}
	
	//----------------hee*end------------------------------------------------
}
