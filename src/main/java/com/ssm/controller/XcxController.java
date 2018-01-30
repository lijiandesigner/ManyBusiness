package com.ssm.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import java.net.*;
import java.io.*;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ssm.dto.Brand;
import com.ssm.dto.Dizhi;
import com.ssm.dto.Food;
import com.ssm.dto.Lunbo;
import com.ssm.dto.User;
import com.ssm.dto.Zh;
import com.ssm.service.IBrandService;
import com.ssm.service.IDizhiService;
import com.ssm.service.IFoodService;
import com.ssm.service.ILunboService;
import com.ssm.service.IUserService;
import com.ssm.service.IZhService;


@RestController    
@RequestMapping("/xcx")    
public class XcxController {
	@Resource    
    private IZhService zhService;
	
	@Resource    
    private IUserService userService;
	
	@Resource    
    private ILunboService lunboService;
	
	@Resource    
    private IFoodService foodService;
	
	@Resource    
    private IBrandService brandService;
	
	@Resource    
    private IDizhiService dizhiService;
	
	
	
	/*
	 * 测试方法
	 * */
	@RequestMapping("/aaa")
	public String test(){
		 return "bbb";  
	}
	//*******************hee***************************
	
	/*
	 * xcx app.js 
	 * 过期时间判断
	 */
	@RequestMapping("/ifZhTime")
	public String ifZhTime(HttpServletRequest request){
		 //获取post参数
		 String zh_appid=request.getParameter("zh_appid");
		 String zh_appsecre=request.getParameter("zh_appsecre");
		 //通过server服务 获取 对应字段
		 // zh = zhService.selectZhTime("wxa104503bc7b7216c","733e6b09895e5ebca63689d5e3cb0ad8");
		 Zh zh = zhService.selectZhTime(zh_appid,zh_appsecre);
		 
		 Integer time_sql=zh.getZh_time();//到期 时间戳
		 long time_now= new Date().getTime()/1000;//当前 时间戳
		 //System.out.println(time_sql+"aaaa"+time_now);
		 String ifok="0";//默认返回0 xcx跳转 暂停页面
		 
		 if(time_sql-time_now>0) {
			ifok="1";//返回1  xcx正常跳转
		 }
		 
		 JSONObject jObject=new JSONObject();//json 声明
		 Integer user_zh=zh.getZh_id();//获取店铺标识 id
		 jObject.put("user_zh",user_zh);
         jObject.put("ifok", ifok);
        
		 
		 return jObject.toString();
	}
	
	/*
	 * xcx app.js 
	 * 店铺不过期，访问用户信息获取
	 */
	@RequestMapping("/openid")
	public String openid(HttpServletRequest request) throws Exception{
		String zh_appid=request.getParameter("zh_appid");
		String zh_appsecre=request.getParameter("zh_appsecre");
		String resCode=request.getParameter("code");
		String name=request.getParameter("name");
		String avatarUrl=request.getParameter("avatarUrl");
		String gender=request.getParameter("gender");
		String province=request.getParameter("province");
		String city=request.getParameter("city");
		Integer user_zh=Integer.parseInt(request.getParameter("user_zh"));
		
		String requestUrl = "https://api.weixin.qq.com/sns/jscode2session?appid="+zh_appid+"&secret="+zh_appsecre+"&js_code="+resCode+"&grant_type=authorization_code";
		
		//System.out.println(requestUrl);
		String res=doGet(requestUrl);//get请求 数据 openid 和session_key
		JSONObject jsStr = JSONObject.parseObject(res); //将字符串{“id”：1}
		String openid=jsStr.getString("openid");//获取openid
		//System.out.println(openid);
		
		//用户  信息录入数据库
		User user=new User();
		//设置对象的值
		user.setOpenid(openid);
		user.setUser_name(name);
		user.setUser_url(avatarUrl);
		user.setUser_sex(gender);
		user.setUser_province(province);
		user.setUser_city(city);
		user.setUser_zh(user_zh);
		//System.out.println(user.getOpenid());
		//先判断用户存不存在 存在更新 不存在 插入
		User getUser=userService.getUserByOpenidUser_zh(openid,user_zh);
		if(getUser!=null) {
			userService.setByIdOenid(user);
		}else {
			userService.insertUser(user);
		}
		
		
		return res;
	}
	
	/*
	 * xcx category.js 
	 * 获取 指定店铺轮播信息
	 */
	@RequestMapping("/getLunbo")
	public List<Lunbo> getLunbo(HttpServletRequest request){
		Integer zh=Integer.parseInt(request.getParameter("zh"));//获取post参数
		Lunbo lunbo=new Lunbo();
		lunbo.setLunbo_zh(zh);
		lunbo.setLunbo_show("1");
		List<Lunbo> lunbo_select=lunboService.getRowByLunbo(lunbo);//得到查询结果
		//System.out.println(lunbo_select);
        
		return lunbo_select;
	}
	
	/*
	 * xcx category.js 
	 * 获取所有商品 
	 */
	@RequestMapping("/wx_index_brand")
	public String wx_index_brand(HttpServletRequest request){
		Integer zh=Integer.parseInt(request.getParameter("zh"));//获取post参数
		List<Food> food_select=foodService.getFoodAll(zh);//得到查询结果
		
		JSONObject jsonObject = new JSONObject();
		//过滤 获得数据  
		for(int i = 0 ; i < food_select.size(); i++) {
			if(food_select.get(i).getFood_index_show()==1) {//上架物品
				//System.out.printf("%s\n",food_select.get(i).getFood_name());
				JSONObject jsonObject2 = new JSONObject();
				jsonObject2.put("id", food_select.get(i).getId());
				jsonObject2.put("name", food_select.get(i).getFood_name());
				jsonObject2.put("pic", food_select.get(i).getFood_pic());//图片
				jsonObject2.put("sold", food_select.get(i).getFood_num());
				jsonObject2.put("price", food_select.get(i).getFood_money()/1000);
				jsonObject2.put("show", food_select.get(i).getFood_index_show());
				String key=food_select.get(i).getId().toString();	
				jsonObject.put(key,jsonObject2);
				System.out.println(jsonObject.get(key));
			}
		}
		
		return jsonObject.toJSONString(jsonObject, SerializerFeature.DisableCircularReferenceDetect);
	}
	
	/*
	 * xcx category.js 
	 * 获取所有 分类
	 */
	@RequestMapping("/wx_index_goodsList")
	public JSONObject wx_index_goodsList(HttpServletRequest request){
		Integer zh=Integer.parseInt(request.getParameter("zh"));//获取post参数
		//Integer zh=1;
		List<Brand> brand_select=brandService.getAllBrandOrderBy(zh,"desc");//得到查询结果
        		
		//获取 food 中所有不 显示的商品 id
		List<Food> food_id=foodService.getByfood_index_show(zh,0);//得到查询结果
		
		JSONObject jsonObject1 = new JSONObject();
		//过滤 获得数据  
		for(Integer i = 0 ; i < brand_select.size(); i++) {
				JSONObject jsonObject2 = new JSONObject();
				jsonObject2.put("id", brand_select.get(i).getId());
				jsonObject2.put("pic", brand_select.get(i).getBrand_pic());
				jsonObject2.put("classifyName", brand_select.get(i).getBrand_name());
				
				String arr_string=brand_select.get(i).getBrand_goods();//获得 goods 字符串 去掉 两边[]
				
				arr_string=arr_string.replace(arr_string.charAt(0)+"","");
				arr_string=arr_string.replace(arr_string.charAt(arr_string.length()-1)+"","");
				String [] stringArr= arr_string.split(",");
							
				//剔除 下架商品
				if(food_id!=null) {
					for(Food list : food_id){
						String ifok=list.getId().toString();
						int a = Arrays.binarySearch(stringArr,ifok);
						if(a>0) {
							stringArr[a] = stringArr[stringArr.length-1];
							stringArr = Arrays.copyOf(stringArr, stringArr.length-1);
							System.out.println("存在"+a);
							
						}
			            //System.out.println(list.getId());
			        }				
				}
				jsonObject2.put("goods",stringArr);
				jsonObject2.put("select_goods",new int[0]);
				jsonObject2.put("num", "");
				jsonObject1.put(i.toString(),jsonObject2);
		}
		
		return jsonObject1;
	}
	
	/*
	 * xcx category.js 
	 * 获取所有 地址
	 */
	@RequestMapping("/dizhi_select")
	public List<Dizhi> dizhi_select(HttpServletRequest request){
		Integer zh=Integer.parseInt(request.getParameter("zh"));//获取post参数
		String openid=request.getParameter("openid");//获取post参数
//		Integer zh=1;
//		String openid="ousEf0YdCYgPBMco5t-GM_J-DHy8";
		
		User user_id=userService.getUserByOpenidUser_zh(openid,zh);//包含 需要信息 的对象（id）
		List<Dizhi> dizhi=dizhiService.selectDizhiByZhUser(user_id.getId(),zh);
				
		return dizhi;
	}
	
	/*
	 * xcx dizhi_add中add.js 
	 * 获取所有 地址
	 */
	@RequestMapping("/dizhi_add")
	public void dizhi_add(HttpServletRequest request){
		Integer dizhi_zh=Integer.parseInt(request.getParameter("dizhi_zh"));//dizhi_zh
		String openid=request.getParameter("openid");//获取post参数
		User user_id=userService.getUserByOpenidUser_zh(openid,dizhi_zh);
		Integer dizhi_user=user_id.getId();
		String dizhi_name=request.getParameter("dizhi_name");//获取post参数
		String dizhi_sex=request.getParameter("dizhi_sex");//获取post参数
		String dizhi_phone=request.getParameter("dizhi_phone");//获取post参数
		String dizhi_dizhi=request.getParameter("dizhi_dizhi");//获取post参数
		String dizhi_menpai=request.getParameter("dizhi_menpai");//获取post参数
		Integer dizhi_select=1;
		
		//根据 user_id 把 dizhi_select=1 改为0
		
		
	}

	
	//Get 方法封装
	public static String doGet(String url) throws Exception {    
	    URL localURL = new URL(url);    
	    URLConnection connection = localURL.openConnection();    
	    HttpURLConnection httpURLConnection = (HttpURLConnection) connection;    
	    httpURLConnection.setRequestProperty("Accept-Charset", "utf-8");    
	    httpURLConnection.setRequestProperty("Content-Type",    
	            "application/text");    
	
	    InputStream inputStream = null;    
	    InputStreamReader inputStreamReader = null;    
	    BufferedReader reader = null;    
	    StringBuffer resultBuffer = new StringBuffer();    
	    String tempLine = null;    
	
	    if (httpURLConnection.getResponseCode() >= 300) {    
	        throw new Exception(    
	                "HTTP Request is not success, Response code is "    
	                        + httpURLConnection.getResponseCode());    
	    }    
	
	    try {    
	        inputStream = httpURLConnection.getInputStream();    
	        inputStreamReader = new InputStreamReader(inputStream);    
	        reader = new BufferedReader(inputStreamReader);    
	
	        while ((tempLine = reader.readLine()) != null) {    
	            resultBuffer.append(tempLine);    
	        }    
	
	    } finally {    
	
	        if (reader != null) {    
	            reader.close();    
	        }    
	
	        if (inputStreamReader != null) {    
	            inputStreamReader.close();    
	        }    
	
	        if (inputStream != null) {    
	            inputStream.close();    
	        }    
	
	    }    
	    return resultBuffer.toString();    
	}
	//*******************hee***************************
}
