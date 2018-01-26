package com.ssm.dao;
import java.util.List;    
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ssm.dto.User;    
//特教测试    
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
    /* 根据 openid 和 user_zh 确定用户
     * openid String
     * user_zh Integer
     * */
    public User queryUserByOpenidUser_zh(@Param("openid")String openid,@Param("user_zh")Integer user_zh);
    
    //更新用户基本 信息
    public void updateByIdOenid(@Param("user")User user,@Param("getUser_zh")Integer getUser_zh,@Param("getId")Integer getId,@Param("getOpenid")String getOpenid); 
    //----------------hee------------------------------------------------
        
}    
