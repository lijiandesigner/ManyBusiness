package com.ssm.controller;

import java.util.List;
import javax.annotation.Resource;    
import javax.servlet.http.HttpServletRequest;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.dto.User;

import com.ssm.service.IUserService;    
    
@RestController    
@RequestMapping("/user")    
public class UserController {  
	//private String kn="User";
    @Resource    
    private IUserService userService;    
        
    @RequestMapping("/userList")    
    public String userList(HttpServletRequest request,Model model){    
        List<User> uList = userService.getAllUser();    
        model.addAttribute("uList", uList);    
        return "userList";    
    }    
        
    @RequestMapping("/showUser")    
    public String showUser(HttpServletRequest request,Model model){    
        int userId = Integer.parseInt(request.getParameter("id"));    
        User user = userService.getUserById(userId);    
        model.addAttribute("user", user);    
        return "showUser";    
    }    
        
    @RequestMapping("/userinfo")    
    public String addUserUI(){    
        return "userinfo";    
    }    
        
   /* @RequestMapping("/addUser")    
    public String addUser(HttpServletRequest request,Model model){    
        User user = new User();
        user.setId(2);
        user.setName(String.valueOf(request.getParameter("name")));    
        user.setPassword(String.valueOf(request.getParameter("password")));    
        user.setAge(Integer.parseInt(String.valueOf(request.getParameter("age"))));    
        userService.addUser(user);    
        return "redirect:/user/userList";    

    }*/  
//---------------------------bzwh---------------------------------------
    public void lo() {
    	
    	
    };
    
    @RequestMapping("/buzhi")
    public String buzhi() {
    	return "dd";
    }
  //---------------------------bzwh---------------------------------------
  
//--------------------------hee-----------------------------------   
    @RequestMapping("/login")    
    public @ResponseBody User login(HttpServletRequest request){    
    	 /*return "redirect:/brand/all";*/
    	 String aa=request.getParameter("id"); 
    	 String name = request.getParameter("name");
    	 System.out.print(aa);
    	 System.out.print(name);
    	 int id=Integer.parseInt(request.getParameter("id"));
    	 User itemsCustom =  userService.getUserById(id);
 		 return itemsCustom;
    }
    
    @RequestMapping("/test")
    public ModelAndView  findItemsById(ModelAndView mv){
    	mv.setViewName("brand/all");
    	return mv;
	}
    
//--------------------------hee----------------------------------- 

   
}    