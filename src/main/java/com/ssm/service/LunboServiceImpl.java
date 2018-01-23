package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.ssm.service.ILunboService;
import com.ssm.dao.ILunboDao;
import com.ssm.dto.Lunbo;

@Service("lunboService")
public class LunboServiceImpl implements ILunboService {
	@Resource    
    private ILunboDao lunboDao;
	public void insertLunbo(Lunbo lunbo) {    
        lunboDao.insertLunbo(lunbo);    
    }
	
	@Override    
    public List<Lunbo> getAllLunbo() {    
        return lunboDao.getAllLunbo();    
    } 
}
