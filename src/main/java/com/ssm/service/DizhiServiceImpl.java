package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

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
}
