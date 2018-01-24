package com.ssm.service;
import java.util.List;    

import com.ssm.dto.User;    
    
public interface IUserService {    
        
    public User getUserById(int userId);    
    
    public void insertUser(User user);    
    
    public void addUser(User user);    
    
    public List<User> getAllUser();
    
  //----------------------hee-------------------------
    /* �ӿ�
     * ��ȡ�û� ����ʱ�ڵķ���
     * zh_appid ָ������1
     * zh_appsecre ָ������2
     * */
    public User selectUserTime(String zh_appid,String zh_appsecre);
  //----------------------hee-------------------------
    
}    
