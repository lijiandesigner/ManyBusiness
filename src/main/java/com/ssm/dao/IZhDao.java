package com.ssm.dao;

import java.util.List;

import com.ssm.dto.Zh;

public interface IZhDao {
	public void insertZh(Zh zh);
	
	
	public List<Zh> getAllZh(); 
}
