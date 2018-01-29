<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="..//global/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="..//global/bootstrap/css/font-awesome.min.css" />
	<link rel="stylesheet" type="text/css" href="..//system/iCheck/minimal/blue.css" />
	<link rel="stylesheet" type="text/css" href="..//system/select2/select2.min.css" />
	<link rel="stylesheet" type="text/css" href="..//system/dist/css/AdminLTE.min.css" />
	<link rel="stylesheet" type="text/css" href="..//system/dist/css/skins/skin-blue.min.css" />

	<script type="text/javascript" src="..//global/jQuery/jquery-2.2.3.min.js"></script>
	<script type="text/javascript" src="..//global/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="..//system/slimScroll/jquery.slimscroll.min.js"></script>
	<script type="text/javascript" src="..//system/dist/js/app.min.js"></script>
	<script type="text/javascript" src="..//global/jQuery/jquery.pjax.js"></script>

	<link rel="stylesheet" type="text/css" href="..//system/kindeditor/themes/default/default.css" />
	<script type="text/javascript" src="..//system/kindeditor/kindeditor-all.js"></script>
	<script type="text/javascript" src="..//system/kindeditor/lang/zh-CN.js"></script>
	<link rel="stylesheet" type="text/css" href="../global/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../global/bootstrap/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="../global/Amaranjs/amaran.min.css">
<link rel="stylesheet" type="text/css" href="../system/dist/css/AdminLTE.min.css">
	<link rel="stylesheet" type="text/css" href="../global/jQuery-gDialog/animate.min.css">
	<script src="../global/jQuery/jquery-2.2.3.min.js"></script>
<script src="../global/bootstrap/js/bootstrap.min.js"></script>
<script src="../global/jQuery/jquery.form.js"></script>
<script src="../global/Amaranjs/jquery.amaran.min.js"></script>
	<style type="text/css">
		.bott a{
			display:block;
			width:50px;
			height:30px;
			background-color:#337ab7;
			color:#ffffff;
			float:left;
			margin-left:5px;
			border-radius:3px;
			
			
		}
		.bott a:hover{
			color:#d9d6d6;
		}
		.bott span{
			float:left;
			margin-left:5px;
		}
	</style>
<title>订单</title>
</head>
<body>
  <center>
        <table class="table table-bordered table-hover table-sort" style="text-align: center;width:95%;margin-top:20px;" >
          <tr style="text-align: center;" >
            <th style="text-align: center;" >订单编号</th>
            <th style="text-align: center;" >购买人</th>
            <th style="text-align: center;" >地址</th>
            <th style="text-align: center;" >电话</th>
            <th style="text-align: center;" >商品</th>
            <th style="text-align: center;" >金额</th>
            <th style="text-align: center;" >下单时间</th>
          </tr>
          <c:forEach items="${citylist}" var="map" >
	          <tr>
	            <td>${map.dingdan_num}</td>
	            <td>${citylist[1].dingdan_name}</td>
	            <td>${citylist[2].dingdan_dizhi}</td>
	            <td>${citylist[0].dingdan_phone}</td>
	            <td>buzhiweihe</td>
	            <td>${citylist[0].dingdan_money}</td>
	            <td>${citylist[0].dingdan_time_s}</td>
	          </tr>
          </c:forEach>
        </table>
        <div class="bott" style="width:350px;height:30px;line-height:30px;margin:auto;">
        	<a href="allList?page=${page.firstPage}">第一页</a>
	        <a href="allList?page=${page.nextPage}">下一页</a>
	         <span>  ${page.pageNum}/${page.pages}  </span>
	        <a href="allList?page=${page.prePage}">上一页</a>
	        <a href="allList?page=${page.lastPage}">最后页</a>
	        <div class="go" style="float:right;height:30px;">
	        	<input class="ye" type="number" style="width:50px;height:30px;padding:0px;display:inline-block float:left;"><button class="ke" style="height:30px;float:right;line-height:30px;background-color:#337ab7;border:1px solid #0687f6; " >Go</button>
	        </div>
        </div>
        <div class="big" style="display:none;">${page.pages}</div>
        <div class="sma" style="display:none;">${page.pageNum}</div>
    </center>
    <script>
    	$(function(){
    		$(".ke").click(function(){
    			var a=$(".ye").val();
    			var big=$(".big").text();
    			if(a>big|a<1){
    				 $.amaran({ 'message':'不存在此页', 'clearAll':true });
    			}else{
    				window.location.href="../dingdan/allList?page="+a;
    			}
    		})
    	})
    </script>
  </body>
</html>