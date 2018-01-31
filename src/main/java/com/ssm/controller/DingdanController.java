package com.ssm.controller;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.dto.Dingdan;
import com.ssm.service.IDingdanService;
import com.ssm.service.IZhService;
import com.ssm.controller.PublicCommZip;

@RestController    
@RequestMapping("/dingdan")    
public class DingdanController {
	@Resource    
    private IDingdanService dingdanService; 
//------------------------------buzhiweihe--------------------------------------------------------------	
	@RequestMapping("/all")
    public List<Dingdan>  all(){
		List<Dingdan> m=dingdanService.getAllDingdan(1);
		//System.out.print(m);
    	//mv.setViewName("shouYin/all");
    	return m;
	}
	@RequestMapping("/allList")
	  public ModelAndView userList(@RequestParam(required=true,defaultValue="1") Integer page,HttpServletRequest request,Model model,ModelAndView mv){
	    //加载商户id
		HttpSession session = request.getSession();//初始化session对象
		Integer zh_id=(Integer)session.getAttribute("zh_id");//获取
		System.out.println(zh_id);

		//PageHelper.startPage(page, pageSize);这段代码表示，程序开始分页了，page默认值是1，pageSize默认是10，意思是从第1页开始，每页显示10条记录。
		PageHelper.startPage(page, 3); 
		//根据商户id查询订单的分页信息
	    List<Dingdan> userList = dingdanService.getAllDingdan(zh_id);
	    PageInfo<Dingdan> p=new PageInfo<Dingdan>(userList); 
	    List<Dingdan> l=p.getList();
	    System.out.println(l);
	    model.addAttribute("citylist", l);    
	    mv.addObject("page", p);
	    mv.setViewName("order/all");
	    return mv;
	  }
	@RequestMapping("/ce")
	 private static void cutImage() throws IOException {
		PublicCommZip imgobj=new PublicCommZip();
		
		imgobj.zipWidthHeightImageFile(new File("D:\\image\\x.jpg"),new File("D:\\image\\dd.jpg"),425,638,0.9f);
        String type = "jpg";
        // 裁剪的位置C:\\spider\\
        int x = 10;
        int y = 10;
        int width = 100;
        int height = 100;
      //  File str = new File("../kekekeke");
		/*if(!str.exists()){
			str.mkdirs();
		}*/
        // 文件地址
       /* File file = new File("c.jpg");
        InputStream input = new FileInputStream(file); 
        ImageInputStream imageStream = null;
        try {
            // 图片类型 默认 jpg
            String imageType = (null == type || "".equals(type)) ? "jpg" : type;
            // 将图片转化为 imageReader
            Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName(imageType);
            ImageReader reader = readers.next();
            // 读入图片
            imageStream = ImageIO.createImageInputStream(input);
            reader.setInput(imageStream, true);
            // 参数
            ImageReadParam param = reader.getDefaultReadParam();
            // 图片裁剪范围
            Rectangle rect = new Rectangle(x, y, width, height);
            param.setSourceRegion(rect);
            // 裁剪出图片
            BufferedImage bi = reader.read(0, param);
            // 输出达到文件夹
            ImageIO.write(bi, imageType, new File("C:/Users/ting/git/ManyBusiness/src/main/webapp/d.jpg")); 
        } catch (Exception e) {

        } finally {
            // 关闭stream
            imageStream.close();
        }*/
        
        
        
//------------------------------buzhiweihe------------------------------------------------------
    }
	
	
	
}
