package com.ssm.dao;

import java.util.List;

import com.ssm.dto.Lunbo;

public interface ILunboDao {
	public void insertLunbo(Lunbo lunbo);
	
	
	
	
	public List<Lunbo> getAllLunbo();
	
	//*******************he*start**************************
		/*
		 * 通过 
		 * lunbo_show  string
		 * lunbo_zh integer
		 * */
	public List<Lunbo> selectRowByLunbo(Lunbo lunbo);
	//*******************he*end****************************
}
