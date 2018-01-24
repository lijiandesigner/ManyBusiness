package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.dto.User;
import com.ssm.service.IUserService;

@RestController    
@RequestMapping("/xcx")    
public class XcxController {
	
	 @Resource    
	 private IUserService userService; 
	
	/* �ж��û��Ƿ����
	 * ���ݴ�������ֵ 
	 * appid ��appsecre �����ݿ��ȡ��ʱ��time1
	 * ��ǰ ʱ���-time1
	 * ����0 ����0
	 * С���� �����˺�
	 * */ 
	@RequestMapping("/zhIfOk")
	public String zhIfOk(HttpServletRequest request){
		 String appid=request.getParameter("appid");
		 String appsecre=request.getParameter("appsecre");
		 User result =  userService.selectUserTime(appid,appsecre);
		 return result;
	}
    
	
	
}
