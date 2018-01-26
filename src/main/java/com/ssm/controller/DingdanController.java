package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.dto.Dingdan;
import com.ssm.service.IDingdanService;
import com.ssm.service.IZhService;

@RestController    
@RequestMapping("/dingdan")    
public class DingdanController {
	@Resource    
    private IDingdanService dingdanService; 
	
	@RequestMapping("/all")
    public List<Dingdan>  all(ModelAndView mv){
		java.util.List<Dingdan> m=dingdanService.getAllDingdan();
    	//mv.setViewName("shouYin/all");
    	return m;
	}
}
