package com.ssm.service;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.IFoodDao;
import com.ssm.dto.Food;

@Service("FoodServer")
public class FoodServiceImpl implements IFoodService {
	
	@Resource    
    private IFoodDao foodDao;
	
	@Override
	public void addFood(Food food) {
		// TODO Auto-generated method stub
		
		
		
	}

	
	
	//*******************he*start**************************
	/*
	 * 获取所有商品
	 * */
	@Override
	public List<Food> getFoodAll(Integer food_zh) {
		// TODO Auto-generated method stub
		List<Food> food_select=foodDao.selectAll(food_zh);
		return  food_select;
	}
	
	/*
	 * 获取所有 下架商品id
	 * */
	@Override
	public List<Food> getByfood_index_show(Integer food_zh,Integer food_index_show) {
		// TODO Auto-generated method stub
		List<Food> food_select=foodDao.selectByfood_index_show(food_zh,food_index_show);
		if(food_select==null) {
			return  null;
		}
		return  food_select;
	}
	//*******************he*end****************************
		
}
