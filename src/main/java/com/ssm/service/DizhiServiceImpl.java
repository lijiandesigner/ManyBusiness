package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.ssm.dao.IDizhiDao;
import com.ssm.dto.Dizhi;

@Service("dizhiService")
public class DizhiServiceImpl implements IDizhiService{
	@Resource    
    private IDizhiDao dizhiDao;
	public void insertDizhi(Dizhi dizhi) {    
        dizhiDao.insertDizhi(dizhi);    
    }
	
	@Override    
    public List<Dizhi> getAllDizhi() {    
        return dizhiDao.getAllDizhi();        
    } 
	
	
	//----------------hee*start----------------------------------------------
	/* 根据 dizhi_zh和dizhi_user 获取用户对应的 地址 List对象
     * dizhi_zh Integer
     * dizhi_user Integer
     * */
	@Override 
	public List<Dizhi> selectDizhiByZhUser(Integer dizhi_zh,Integer dizhi_user){
		List<Dizhi> dizhi=dizhiDao.getDizhiByZhUser(dizhi_zh,dizhi_user);
		if(dizhi==null) {
			return null;
		}
		return dizhi;
	}
	//----------------hee*end------------------------------------------------
}
