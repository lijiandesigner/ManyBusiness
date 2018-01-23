package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.ssm.service.IRefundService;
import com.ssm.dao.IRefundDao;
import com.ssm.dto.Refund;
@Service("refundService")
public class RefundServiceImpl implements IRefundService {
	@Resource    
    private IRefundDao refundDao;
	public void insertRefund(Refund refund) {    
        refundDao.insertRefund(refund);    
    }
	
	@Override    
    public List<Refund> getAllRefund() {  
		
        return refundDao.getAllRefund();    
    } 
}
