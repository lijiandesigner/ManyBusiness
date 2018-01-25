package com.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController    
@RequestMapping("/zh")    
public class ZhController {
	
	//*******************hee*************************
	@RequestMapping("/test1")
	public String test(){
		 return "aaa";   
	}
	//*******************hee*************************
	//test
	//*******************buzhiweihe******************
	@RequestMapping("/test")
    public ModelAndView  findItemsById(ModelAndView mv){
    	mv.setViewName("brand/all");
    	return mv;
	}
	//*******************buzhiweihe******************
	
}
