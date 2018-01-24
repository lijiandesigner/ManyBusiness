package com.ssm.dao;
import java.util.List;    
import java.util.Map;    
    
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
    /* ʵ�ַ���
     * ��ȡ�û� ����ʱ�ڵķ���
     * zh_appid ָ������1
     * zh_appsecre ָ������2
     * */
    public User queryUserByAppoint(Integer zh_id,String zh_appid,String zh_appsecre);
    //----------------hee------------------------------------------------
        
}    
