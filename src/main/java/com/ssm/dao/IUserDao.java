package com.ssm.dao;
import java.util.List;    
import java.util.Map;    
    
import com.ssm.dto.User;    
//鐗规暀娴嬭瘯    
public interface IUserDao {    
        
    public User queryByPrimaryKey(Integer id);    
        
    public List<User> queryUserByBatch(Map<String,Object> params);    
        
    public void insertUser(User user);    
        
    public void insertUserByBatch(List<User> list);    
        
    public void deleteByPrimaryKey(Integer id);    
        
    public void delteUserByBatch(Map<String,Object> params);    
        
    public void updateByPrimaryKey(Integer id);    
    
    public List<User> getAllUser(); 
    
    //----------------hee------------------------------------------------
    /* 实现服务
     * 获取用户 到期时期的方法
     * zh_appid 指定参数1
     * zh_appsecre 指定参数2
     * */
    public User queryUserByAppoint(Integer zh_id,String zh_appid,String zh_appsecre);
    //----------------hee------------------------------------------------
        
}    
