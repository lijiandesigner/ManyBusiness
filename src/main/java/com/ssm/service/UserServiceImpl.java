package com.ssm.service;
import java.util.List;    

import javax.annotation.Resource;    
    
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
    
    
}    
