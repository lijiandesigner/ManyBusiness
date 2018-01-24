package com.ssm.service;
import java.util.List;    

import com.ssm.dto.User;    
    
public interface IUserService {    
        
    public User getUserById(int userId);    
    
    public void insertUser(User user);    
    
    public void addUser(User user);    
    
    public List<User> getAllUser();
    
  //----------------------hee-------------------------
    /* 接口
     * 获取用户 到期时期的方法
     * zh_appid 指定参数1
     * zh_appsecre 指定参数2
     * */
    public User selectUserTime(String zh_appid,String zh_appsecre);
  //----------------------hee-------------------------
    
}    
