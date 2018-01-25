package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	@RequestMapping("/test")
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
    public @ResponseBody List<Zh> checklog(HttpServletRequest request){    
    	 String name = request.getParameter("zh");
    	 System.out.print(name);
    	 List<Zh> itemsCustom =  zhService.getAllZh();
 		 return itemsCustom;
    }
	//*******************buzhiweihe******************
	
}
