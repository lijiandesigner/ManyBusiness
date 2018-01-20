package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.ssm.service.ICodeService;
import com.ssm.dao.ICodeDao;
import com.ssm.dto.Code;
import com.ssm.dto.User;

@Service("codeService")
public class CodeServiceImpl implements ICodeService {
	@Resource    
    private ICodeDao codeDao;
	public void insertCode(Code code) {    
        codeDao.insertCode(code);    
    }
	
	@Override    
    public List<Code> getAllCode() {    
        return codeDao.getAllCode();    
    } 
	
}
