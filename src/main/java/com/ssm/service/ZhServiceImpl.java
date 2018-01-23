package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import com.ssm.dao.IZhDao;
import com.ssm.dto.Zh;
import com.ssm.service.IZhService;    
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
}
