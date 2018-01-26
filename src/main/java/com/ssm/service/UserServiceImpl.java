package com.ssm.service;
import java.util.List;    

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;    
    
import com.ssm.dao.IUserDao;    
import com.ssm.dto.User;    
import com.ssm.service.IUserService;    
    
@Service("userService")    
public class UserServiceImpl implements IUserService {    
    @Resource    
    private IUserDao userDao;    
        
    public User getUserById(int userId) {    
        return userDao.queryByPrimaryKey(userId);    
    }    
    
    public void insertUser(User user) {    
        userDao.insertUser(user);    
    }    
    
    public void addUser(User user) {    
    	
        userDao.insertUser(user);    
    }    
    
    @Override    
    public List<User> getAllUser() {    
        return userDao.getAllUser();    
    }
    
  //----------------------hee-------------------------
    /* 根据 openid 和 user_zh 确定用户
     * openid String
     * user_zh Integer
     * */
    public User getUserByOpenidUser_zh(String openid,Integer user_zh) {
    	User user=userDao.queryUserByOpenidUser_zh(openid,user_zh);
    	if(user!=null) {
    		return userDao.queryUserByOpenidUser_zh(openid,user_zh);
    	}
    	return null;
    }
    
    /* 根据 openid 和 user_zh 确定用户
     * user User
     * openid String
     * */
    public void setByIdOenid(User user,Integer user_zh,String openid) {
    	userDao.updateByIdOenid(user,user_zh,null,openid);
    }
  //----------------------hee-------------------------
    
    
}    
