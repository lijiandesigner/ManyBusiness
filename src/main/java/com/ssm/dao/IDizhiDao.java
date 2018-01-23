package com.ssm.dao;

import java.util.List;

import com.ssm.dto.Dizhi;

public interface IDizhiDao {
	public void insertDizhi(Dizhi dizhi);
	public List<Dizhi> getAllDizhi(); 
}
