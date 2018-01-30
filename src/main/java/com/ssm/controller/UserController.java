package com.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;    
import javax.servlet.http.HttpServletRequest;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
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
    @RequestMapping("/geren")
    public String geren(HttpServletRequest request) {
    	MultipartHttpServletRequest mhsr=(MultipartHttpServletRequest) request;
    	MultipartFile file=mhsr.getFile("file");
    	String name = file.getName(); 

        System.out.println(name);//得到的是file 
        
        String originalFilename = file.getOriginalFilename(); 

        System.out.println(originalFilename);//得到上传的文件名全称 
        File dest=new File(originalFilename);
        try {
			file.transferTo(dest);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    	return "/geren";
    }
    @RequestMapping("/a")
    public ModelAndView geren(ModelAndView mv) {
    	mv.setViewName("/user/geren");
    	return mv;
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