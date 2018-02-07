package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.ssm.dao.IDizhiDao;
import com.ssm.dto.Dizhi;

@Service("dizhiService")
public class DizhiServiceImpl implements IDizhiService{
	@Resource    
    private IDizhiDao dizhiDao;
	public void insertDizhi(Dizhi dizhi) {    
        dizhiDao.inserDizhi(dizhi);    
    }
	
	@Override    
    public List<Dizhi> getAllDizhi() {    
        return dizhiDao.getAllDizhi();        
    } 
	
	
	//----------------hee*start----------------------------------------------
	/* 根据 dizhi_zh和dizhi_user 获取用户对应的 地址 List对象
     * dizhi_zh Integer
     * dizhi_user Integer
     * */
	@Override 
	public List<Dizhi> selectDizhiByZhUser(Integer dizhi_zh,Integer dizhi_user){
		List<Dizhi> dizhi=dizhiDao.getDizhiByZhUser(dizhi_zh,dizhi_user,null);
		if(dizhi==null) {
			return null;
		}
		return dizhi;
	}
	
	/* dizhi_zh dizhi_user 确定数据 把 dizhi_select 更新为0
     * dizhi_zh Integer
     * dizhi_user Integer
     * */
	@Override 
	public void setByBuff(Integer dizhi_select,Integer dizhi_zh,Integer dizhi_user){
		dizhiDao.updateByBuff(dizhi_select,dizhi_zh,dizhi_user,null); 
	}
	//选中 状态 0->1
	@Override 
	public void setByBuffId(Integer dizhi_select,Integer dizhi_zh,Integer id) {
		dizhiDao.updateByBuff(dizhi_select,dizhi_zh,null,id);
	}
	
	/* 更新  dizhi_name dizhi_sex dizhi_phone dizhi_dizhi dizhi_menpai 根据 id
     * */
	@Override 
	public void setateById(Dizhi dizhi){
		dizhiDao.updateById(dizhi);
	}
	
	/* 删除  地址 根据 id 和dizhi_zh
     * */
	@Override 
	public void shanById(Integer dizhi_zh,Integer id){
		dizhiDao.deleteById(dizhi_zh,id);
	}
	
	//----------------hee*end------------------------------------------------
}
