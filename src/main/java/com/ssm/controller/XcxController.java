package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssm.dto.User;
import com.ssm.dto.Zh;
import com.ssm.service.IUserService;
import com.ssm.service.IZhService;

@RestController    
@RequestMapping("/xcx")    
public class XcxController {
	
	 @Resource    
	 private IZhService ZhService; 
	 
	
	 /* 判断用户是否过期
	 * 根据传过来的值 
	 * appid 和appsecre 从数据库获取到时间time1
	 * 当前 时间戳-time1
	 * 大于0 返回0
	 * 小于零 返回账号
	 * */ 
	@RequestMapping("/zhIfOk")
	public @ResponseBody Zh zhIfOk(HttpServletRequest request){
		 String appid=request.getParameter("appid");
		 String appsecre=request.getParameter("appsecre");
		 Zh zh = ZhService.selectZhTime(appid,appsecre);
		 return zh;
	}
    
	
	
}
