package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.dto.User;
import com.ssm.dto.Zh;
import com.ssm.service.IFoodService;
import com.ssm.service.IUserService;
import com.ssm.service.IZhService;


@RestController    
@RequestMapping("/xcx")    
public class XcxController {
	@Resource    
    private IZhService zhService;
	
	
	/*
	 * 测试方法
	 * */
	@RequestMapping("/aaa")
	public String test(){
		 return "bbb";  
	}
	//*******************hee***************************
	@RequestMapping("/ifZhTime")
	public String ifZhTime(HttpServletRequest request){
		 //获取post参数
		 String zh_appid=request.getParameter("zh_appid");
		 String zh_appsecre=request.getParameter("zh_appsecre");
		 //通过server服务 获取 对应字段
		 Zh zh = zhService.selectZhTime("wxa104503bc7b7216c","733e6b09895e5ebca63689d5e3cb0ad8");
		 //Integer aaa=null;
		 return "aa"; 
	}
	//*******************hee***************************
}
