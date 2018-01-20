package com.ssm.dao;
import java.util.List;

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
	public List<Food> selectAll();
	
	/**
	 * @param _id 
	 * @return 
	 */
	public Food selectById(Integer _id);
	
	
}
