<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
	<title>商城后台</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport"/>

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

</head>
<body class="hold-transition skin-blue fixed sidebar-mini" >
	<div class="wrapper">

     <header class="main-header">
        <a href="#" class="logo"><span class="logo-mini">TF</span><span class="logo-lg">TuFanInc</span></a>
        <nav class="navbar navbar-../-top">
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <li class="dropdown messages-menu">
                        <a href="/" target="keke" >收银台</a>
                    </li>
                    <li class="dropdown messages-menu">
                        <a href="javascript:void(0);" class="delete-one" data-url="{:url('Index/cleanCache')}" data-id="-1" >清除缓存</a>
                    </li>
                    <li class="dropdown user user-menu">
                        <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown">

                        <!-- {:cookie('avatar')}http://localhost/wen/public/uploads/avatar/20171231/20171231195941_566670.jpg -->
                            <img style="border: 1px solid red;" src="__IMG__{:cookie('avatar')}" class="user-image">
                            <span class="hidden-xs">苏小心</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="user-header">
                                <img src="__IMG__{:cookie('avatar')}" class="img-circle">
                                <p>苏晓信<small>Member since admin</small></p>
                            </li>
                            <li class="user-footer">
                                <div class="pull-left"><a href="../user/a" target="keke" class="btn btn-default btn-flat">个人设置</a></div>
                                <div class="pull-right"><a href="{:url('Login/loginOut')}" class="btn btn-default btn-flat">退出</a></div>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <aside class="main-sidebar">
        <section class="sidebar">
            <div class="user-panel">
                <div class="pull-left image"><img src="{:cookie('avatar')}" class="img-circle" alt="苏晓信"></div>
                <div class="pull-left info">
                    <p>苏晓信</p>
                    <a href="#"><i class="fa fa-circle text-success"></i>在线</a>
                </div>
            </div>
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="搜索">
                    <span class="input-group-btn">
                        <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i></button>
                    </span>
                </div>
            </form>
            <ul class="sidebar-menu">
                <li class="header">菜单</li>
                    <li class="treeview"><a href="../dingdan/all" target="keke" ><i class="fa fa-home"></i><span>收银台</span></a></li>
                    <li class="treeview"><a href="../dingdan/allList" target="keke"><i class="fa fa-home" target="keke" ></i><span>订单管理</span></a></li>
                    <li class="treeview"><a href="#"><i class="fa fa-home" target="keke" ></i><span>分类管理</span></a></li>
                    <li class="treeview"><a href="#"><i class="fa fa-home" target="keke" ></i><span>商品管理</span></a></li>
                    <li class="treeview"><a href="#"><i class="fa fa-magic" target="keke" ></i><span>桌号管理</span></a></li>
                    <li class="treeview"><a href="#"><i class="fa fa-wrench" target="keke" ></i><span>广告管理</span></a></li>
                    <li class="treeview"><a href="#"><i class="fa fa-home" target="keke" ></i><span>退款申请</span></a></li>
                    <li class="treeview"><a href="#"><i class="fa fa-home" target="keke" ></i><span>退款订单</span></a></li>
                  </ul>
               </li>
            </ul>
        </section>
    </aside> 
    <div class="content-wrapper" >
        <iframe name="keke" src="http://www.baidu.com" 
        "></iframe>
    </div>
  	<script type="text/javascript">
  		
  		$(function(){
  			var ww=$(".wrapper").width();
  			var wh=$(".main-header").height();
  			var bh=$(window).height();
  			var lw=$(".sidebar").width();
  			
  			$("iframe").css({"height":bh-wh,"width":ww-lw});
  		})
  	</script>
</div>
</body>
</html>