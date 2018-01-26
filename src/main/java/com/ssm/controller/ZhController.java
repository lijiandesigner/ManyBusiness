package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.dto.User;
import com.ssm.dto.Zh;
import com.ssm.service.IZhService;

@RestController    
@RequestMapping("/zh")    
public class ZhController {
	@Resource    
    private IZhService zhService;  
	//*******************hee*************************
	@RequestMapping("/test1")
	public String test(){
		 return "aaa";   
	}
	//*******************hee*************************
	//test
	//*******************buzhiweihe******************
	@RequestMapping("/log")
    public ModelAndView  log(ModelAndView mv){
    	mv.setViewName("login/ifLogin");
    	return mv;
	}
	@RequestMapping("/checklog")    
    public long checklog(HttpServletRequest request){    
    	String zh=request.getParameter("zh");//获取账号
    	String pwd=request.getParameter("pwd");//获取密码
    	Zh itemsCustom =  zhService.getZhByzh(zh);//根据输入账号去查
    	if(itemsCustom!=null) {
    		//有数据
    		String pwdm=itemsCustom.getZh_pwd();
    		if(pwd.equals(pwdm)) {
    			//账号密码正确
    			long date=System.currentTimeMillis()/1000;//获取当前时间
    			System.out.print(date);
    			long datem=(long)itemsCustom.getZh_time();//数据库用户到期时间
    			System.out.print("  d  ");
    			System.out.print(datem);
    			if(date<=datem) {
    				//未到期，跳转到登陆页面
    				System.out.print("weidao");
    				HttpSession session = request.getSession();//初始化session对象
    				session.setAttribute("zh", zh);//存账号进session 
    				return 2;
    			}else {
    				System.out.print("yi");
    				//已经到期，跳转到充值页面
    				return 1;	
    			}
    		}else {
    			//密码错误
    			return 0;
    		}
    	}else {
    		//没有数据
    		return 0;
    	}
    }
	
	
	//*******************buzhiweihe******************
	
}
