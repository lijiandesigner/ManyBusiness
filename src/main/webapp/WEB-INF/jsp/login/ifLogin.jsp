<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>登陆</title>

<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

<link rel="stylesheet" type="text/css" href="../global/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../global/bootstrap/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="../global/Amaranjs/amaran.min.css">
<link rel="stylesheet" type="text/css" href="../system/dist/css/AdminLTE.min.css">

<!--[if lt IE 9]>
{load href="/static/system/dist/js/html5shiv.min.js" /}
{load href="/static/system/dist/js/respond.min.js" /}
<![endif]-->
</head>
<body class="hold-transition login-page" style="height:auto;">
<div class="login-box">
    <div class="login-logo"><a href="#" style="">商家后台</a></div>
    <div class="login-box-body">
        <p class="login-box-msg">请填写用户名密码登陆系统</p>
        <form action="checklog" method="POST" onsubmit="return false" >
            <div class="form-group has-feedback">
                <input type="text" class="form-control" name="zh" placeholder="用户名">
                <span class="glyphicon form-control-feedback fa fa-user fa-lg"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" name="pwd" placeholder="密码">
                <span class="glyphicon form-control-feedback fa fa-lock fa-lg"></span>
            </div>
            <div class="row form-group">
                <div class="col-xs-6"><input class="form-control" name="code" placeholder="验证码"></div>
                <div class="col-xs-4">
                    <img src="" id="code" alt="captcha" onclick="this.src='{:captcha_src()}?rnd=' + Math.random();" />
                </div>
            </div>
            <div class="row">
                <div class="col-xs-8"></div>
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat login" data-loading-text="&lt;i class='fa fa-spinner fa-spin '&gt;&lt;/i&gt; 登陆">登陆</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script src="../global/jQuery/jquery-2.2.3.min.js"></script>
<script src="../global/bootstrap/js/bootstrap.min.js"></script>
<script src="../global/jQuery/jquery.form.js"></script>
<link rel="stylesheet" type="text/css" href="../global/jQuery-gDialog/animate.min.css">
<script src="../global/Amaranjs/jquery.amaran.min.js"></script>
<script src="../system/dist/js/login.js"></script>

</body>
</html>