package com.ssm.controller;

import java.util.List;
import javax.annotation.Resource;    
import javax.servlet.http.HttpServletRequest;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
<<<<<<< HEAD
    }*/  
=======
    }  
    
    @RequestMapping("/login")    
    public String login(){    
    	 /*return "redirect:/brand/all";*/
    	 System.out.println("Ìø×ªÊ§°Ü");
    	 return "/brand/all";
    }
    
    @RequestMapping("/test/{id}")    
    public @ResponseBody User findItemsById(@PathVariable("id") Integer id) throws Exception{
    	User itemsCustom =  userService.getUserById(id);
		return itemsCustom;
	}
>>>>>>> branch 'master' of https://github.com/lijiandesigner/ManyBusiness
   
}    