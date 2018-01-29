package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
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
    public List<Dingdan>  all(){
		List<Dingdan> m=dingdanService.getAllDingdan(1);
		//System.out.print(m);
    	//mv.setViewName("shouYin/all");
    	return m;
	}
	@RequestMapping("/allList")
	  public ModelAndView userList(@RequestParam(required=true,defaultValue="1") Integer page,HttpServletRequest request,Model model,ModelAndView mv){
	    //加载商户id
		HttpSession session = request.getSession();//初始化session对象
		Integer zh_id=(Integer)session.getAttribute("zh_id");//获取
		System.out.println(zh_id);

		//PageHelper.startPage(page, pageSize);这段代码表示，程序开始分页了，page默认值是1，pageSize默认是10，意思是从第1页开始，每页显示10条记录。
		PageHelper.startPage(page, 3); 
		//根据商户id查询订单的分页信息
	    List<Dingdan> userList = dingdanService.getAllDingdan(zh_id);
	    PageInfo<Dingdan> p=new PageInfo<Dingdan>(userList); 
	    List<Dingdan> l=p.getList();
	    System.out.println(l);
	    model.addAttribute("citylist", l);    
	    mv.addObject("page", p);
	    mv.setViewName("order/all");
	    return mv;
	  }
	
	
	
}
