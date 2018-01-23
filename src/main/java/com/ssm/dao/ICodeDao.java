package com.ssm.dao;

import java.util.List;

import com.ssm.dto.Code;


public interface ICodeDao {
	
	public void insertCode(Code code);
	
	public List<Code> getAllCode(); 
}
