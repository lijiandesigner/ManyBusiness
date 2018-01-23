package com.ssm.service;

import java.util.List;

import com.ssm.dto.Refund;

public interface IRefundService {
	public void insertRefund(Refund refund);
	
	
	
	
	public List<Refund> getAllRefund();
}
