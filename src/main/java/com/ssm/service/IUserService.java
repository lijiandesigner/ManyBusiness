package com.ssm.service;
import java.util.List;    

import com.ssm.dto.User;    
    
public interface IUserService {    
        
    public User getUserById(int userId);    
    
    public void insertUser(User user);    
    
    public void addUser(User user);    
    
    public List<User> getAllUser();
    
  //----------------------hee-------------------------
	 /* 判断用户是否过期
	 * 根据传过来的值 
	 * appid 和appsecre 从数据库获取到时间time1
	 * 当前 时间戳-time1
	 * 大于0 返回0
	 * 小于零 返回账号
	 * */ 
    public Zh selectUserTime(String zh_appid,String zh_appsecre);
  //----------------------hee-------------------------
    
}    
