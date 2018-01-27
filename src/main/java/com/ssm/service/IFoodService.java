package com.ssm.service;

import java.util.List;

import com.ssm.dto.Food;
import com.ssm.dto.Lunbo;

public interface IFoodService {
	
	public void addFood(Food food);
	
	//*******************he*start**************************
		/*
		 * 获取所有商品
		 * */
	public List<Food> getFoodAll(Integer food_zh);
	//*******************he*end****************************
}
