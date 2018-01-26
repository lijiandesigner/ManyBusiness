package com.ssm.service;
import java.util.List;    

import com.ssm.dto.User;    
    
public interface IUserService {    
        
    public User getUserById(int userId);    
    
    public void insertUser(User user);    
    
    public void addUser(User user);    
    
    public List<User> getAllUser();
    
  //----------------------hee-------------------------
    /* 根据 openid 和 user_zh 确定用户
     * openid String
     * user_zh Integer
     * */
    public User getUserByOpenidUser_zh(String openid,Integer user_zh);
    
    /* 根据 openid 和 user_zh 确定用户
     * user User
     * openid String
     * */
    public void setByIdOenid(User user);
  //----------------------hee-------------------------
    
}    
