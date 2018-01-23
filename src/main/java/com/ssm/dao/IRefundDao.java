package com.ssm.dao;

import java.util.List;

import com.ssm.dto.Refund;

public interface IRefundDao {
	public void insertRefund(Refund refund);
	
	
	public List<Refund> getAllRefund(); 
}
