package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.ssm.service.IBrandService;
import com.ssm.dao.IBrandDao;
import com.ssm.dto.Brand;

@Service("brandService") 
public class BrandServiceImpl implements IBrandService {
	@Resource    
    private IBrandDao brandDao;
	public void insertBrand(Brand brand) {    
        brandDao.insertBrand(brand);    
    }
	
	@Override    
    public List<Brand> selectAllBrand() {    
        return brandDao.selectAllBrand();   
        
    }
	
	//----------------hee------------------------------------------------
	    /* 获取 所有分类
	     * OrderBy  string  排序方式 大写
	     * */
	 @Override 
	 public List<Brand> getAllBrandOrderBy(Integer brand_zh,String OrderBy){
		 return brandDao.selectAllBrandOrderBy(brand_zh,OrderBy);
	 }
	//----------------hee------------------------------------------------
}
