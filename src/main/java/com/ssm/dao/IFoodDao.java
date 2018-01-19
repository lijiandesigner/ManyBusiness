package com.ssm.dao;
import java.util.List;

import com.ssm.dto.Food;

/**
 * @author lijian
 *
 */
public interface IFoodDao {
	
	/**
	 * @param _food 商品对象
	 */
	public void insertFood(Food _food);
	/**
	 * @return 返回所有商品对象
	 */
	public List<Food> selectAll();
	
	/**
	 * @param _id 
	 * @return 结果商品
	 */
	public Food selectById(Integer _id);
	
	
}
