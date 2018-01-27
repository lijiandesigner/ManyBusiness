package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	@RequestMapping("/userList")
	  public ModelAndView userList(@RequestParam(required=true,defaultValue="1") Integer page,HttpServletRequest request,Model model,ModelAndView mv){
	      //PageHelper.startPage(page, pageSize);这段代码表示，程序开始分页了，page默认值是1，pageSize默认是10，意思是从第1页开始，每页显示10条记录。
	      PageHelper.startPage(page, 2);
	      List<Dingdan> userList = dingdanService.getAllDingdan();
	      PageInfo<Dingdan> p=new PageInfo<Dingdan>(userList);
	     
	      List<Dingdan> l=p.getList();
	      
	      mv.addObject("citylist", userList);
	      mv.addObject("page", p);
	      System.out.print(l);
	      System.out.print(p);
	      mv.setViewName("pwd/changePwd");
	      return mv;
	  }
}
