package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.ssm.service.IDingdanService;
import com.ssm.dao.IDingdanDao;
import com.ssm.dto.Dingdan;

@Service("dingdanService")
public class DingdanServiceImpl implements IDingdanService {
	@Resource    
    private IDingdanDao dingdanDao;
	
	public void insertDingdan(Dingdan dingdan) {    
        dingdanDao.insertDingdan(dingdan);    
    }
	
	@Override    
    public List<Dingdan> getAllDingdan() {    
        return dingdanDao.getAllDingdan();    
        
    } 
}
