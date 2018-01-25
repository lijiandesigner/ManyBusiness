package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.dto.Zh;
import com.ssm.service.IFoodService;
import com.ssm.service.IUserService;
import com.ssm.service.IZhService;


@RestController    
@RequestMapping("/xcx")    
public class XcxController {
	@Resource    
    private IUserService userService;
	
	@Resource    
    private IFoodService foodService;
	
	/*
	 * 测试方法
	 * */
	@RequestMapping("/aaa")
	public String test(){
		 return "bbb";
	}
}
