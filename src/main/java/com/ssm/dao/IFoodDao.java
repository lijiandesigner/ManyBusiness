package com.ssm.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.dto.Food;

/**
 * @author lijian
 *
 */
public interface IFoodDao {
	
	/**
	 * @param _food 
	 */
	
	
	//public void insertFood(Food _food);
	/**
	 * @return 
	 */
	
	public List<Food> selectAll(Integer food_zh);
	
	/**
	 * @param _id 
	 * @return 
	 */
	
	public Food selectById(Integer _id);
	
	//----------------hee*start----------------------------------------------
	/* 根据 food_index_show 确定下架物品 id
     * food_index_show Integer
     * */
	public List<Food> selectByfood_index_show(@Param("food_zh")Integer food_zh,@Param("food_index_show")Integer food_index_show);
	//----------------hee*end------------------------------------------------
}
