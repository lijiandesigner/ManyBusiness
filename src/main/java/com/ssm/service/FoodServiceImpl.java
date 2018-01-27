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
	//*******************he*end****************************
		
}
