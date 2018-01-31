<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
<title>编辑</title>

<link rel="stylesheet" type="text/css" href="../global/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="../global/bootstrap/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" href="../system/iCheck/minimal/blue.css" />
<link rel="stylesheet" type="text/css" href="../system/select2/select2.min.css" />
<link rel="stylesheet" type="text/css" href="../system/dist/css/AdminLTE.min.css" />
<link rel="stylesheet" type="text/css" href="../system/dist/css/skins/skin-blue.min.css" />

<script type="text/javascript" src="../global/jQuery/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="../global/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../system/slimScroll/jquery.slimscroll.min.js"></script>
<script type="text/javascript" src="../system/dist/js/app.min.js"></script>
<script type="text/javascript" src="../global/jQuery/jquery.pjax.js"></script>
<script type="text/javascript" src="../global/jQuery/jquery.form.js"></script>

<script type="text/javascript" src="../system/editable/bootstrap-editable.js"></script>
<link rel="stylesheet" type="text/css" href="../system/editable/bootstrap-editable.css" />

<script type="text/javascript" src="../global/nprogress/nprogress.js"></script>
<link rel="stylesheet" type="text/css" href="../global/nprogress/nprogress.css" />

<link rel="stylesheet" type="text/css" href="../global/jQuery-gDialog/animate.min.css" />
<link rel="stylesheet" type="text/css" href="../global/Amaranjs/amaran.min.css" />
<script type="text/javascript" src="../global/Amaranjs/jquery.amaran.min.js"></script>
<link rel="stylesheet" type="text/css" href="../global/bootstrap/js/bootstrap-dialog.min.css" />
<script type="text/javascript" src="../global/bootstrap/js/bootstrap-dialog.min.js"></script>

<script type="text/javascript" src="../system/datetimepicker/moment-with-locales.min.js"></script>
<link rel="stylesheet" type="text/css" href="../system/datetimepicker/bootstrap-datetimepicker.min.css" />
<script type="text/javascript" src="../system/datetimepicker/bootstrap-datetimepicker.min.js"></script>

<script type="text/javascript" src="../system/multiselect/multiselect.min.js"></script>

<script type="text/javascript" src="../system/iCheck/icheck.min.js"></script>

<script type="text/javascript" src="../system/select2/select2.min.js"></script>


<link rel="stylesheet" type="text/css" href="../system/bootstrap-switch/bootstrap-switch.min.css" />
<script type="text/javascript" src="../system/bootstrap-switch/bootstrap-switch.min.js"></script>

<link rel="stylesheet" type="text/css" href="../global/cropper/cropper.min.css" />
<script type="text/javascript" src="../global/cropper/cropper.min.js"></script>
<link rel="stylesheet" type="text/css" href="../global/cropper/cropper.main.css" />
<script type="text/javascript" src="../global/cropper/cropper.main.js"></script>

<script type="text/javascript" src="../system/chart/Chart.min.js"></script>

<script type="text/javascript" src="../system/dist/js/common.js"></script>
<link rel="stylesheet" type="text/css" href="../system/kindeditor/themes/default/default.css" />
<script type="text/javascript" src="../system/kindeditor/kindeditor-all.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="../system/dist/js/html5shiv.min.js"></script>
<script type="text/javascript" src="../system/dist/js/respond.min.js"></script>
<![endif]-->
</head>
<body class="hold-transition skin-blue fixed sidebar-mini">

   
        
<section class="content-header">
    <h1>用户信息</h1>
    <ol class="breadcrumb">
        <li class="active"><i class="fa fa-dashboard"></i> 用户信息</li>
    </ol>
</section>
<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="nav-tabs-custom">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#tab1" data-toggle="tab">基本参数</a></li>
                    <li><a href="#tab2" data-toggle="tab">修改密码</a></li>
                    <li><a href="#tab3" data-toggle="tab">修改头像</a></li>
                    <li class="pull-right"><a href="javascript:history.back(-1)" class="btn btn-sm" style="padding:10px 2px;"><i class="fa fa-list"></i> 返回</a></li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="tab1">
                        <form class="form-horizontal" method="POST" action="" onsubmit="return false" >
                            <input type="hidden" name="id" value="1" />
                            <input type="hidden" name="actions" value="user" />
                            <div class="form-group">
                                <label class="col-sm-2 control-label">用户名</label>
                                <div class="col-sm-7"><input class="form-control" disabled="disabled" value="admin" placeholder="用户名"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">姓名</label>
                                <div class="col-sm-7"><input class="form-control" name="name" value="苏晓信" placeholder="姓名"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">手机号码</label>
                                <div class="col-sm-7"><input class="form-control" name="moblie" value="15823075587" placeholder="手机号码"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">性别</label>
                                <div class="col-sm-7">
                                    <select class="form-control select2" name="sex" style="width:100%;">
                                        <option value="1" selected="selected" >男</option>
                                        <option value="0"  >女</option>
                                    </select>
                                </div>
                            </div>
                         
                         
                            <div class="form-group">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-7">
                                    <div class="btn-group pull-right">
                                        <button type="submit" class="btn btn-info pull-right submits" data-loading-text="&lt;i class='fa fa-spinner fa-spin '&gt;&lt;/i&gt; 提交">提交</button>
                                    </div>
                                    <div class="btn-group pull-left">
                                        <button type="reset" class="btn btn-warning">撤销</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    
                    <div class="tab-pane" id="tab2">
                        <form class="form-horizontal" method="POST" action="" onsubmit="return false" >
                            <input type="hidden" name="id" value="1" />
                            <input type="hidden" name="actions" value="password" />
                            <div class="form-group hide">
                                <label class="col-sm-2 control-label">旧密码</label>
                                <div class="col-sm-7"><input class="form-control" name="oldpassword" value="" placeholder="旧密码" type="password"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">新密码</label>
                                <div class="col-sm-7"><input class="form-control" name="password" value="" placeholder="新密码" type="password"></div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">确认密码</label>
                                <div class="col-sm-7"><input class="form-control" name="repassword" value="" placeholder="确认密码" type="password"></div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-7">
                                    <div class="btn-group pull-right">
                                        <button type="submit" class="btn btn-info pull-right submits" data-loading-text="&lt;i class='fa fa-spinner fa-spin '&gt;&lt;/i&gt; 提交">提交</button>
                                    </div>
                                    <div class="btn-group pull-left">
                                        <button type="reset" class="btn btn-warning">撤销</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    
                    <div class="tab-pane" id="tab3">
                        <!--
                        <form class="form-horizontal" method="POST" action="" onsubmit="return false" >
                            <input type="hidden" name="id" value="1" />
                            <input type="hidden" name="actions" value="avatar" />
                            <div class="form-group">
                                <label class="col-sm-2 control-label">头像</label>
                                <div class="col-sm-7">
                                    <div class="input-group">
                                        <input class="form-control" name="avatar" value="/uploads/avatar/20180129/20180129171418_393801.jpg" placeholder="头像" >
                                        <span class="input-group-btn"><button class="btn btn-success btn-flat up-btn" type="button" data-url="admin/uploads/avatar?dir=avatar"><i class="fa fa-cloud-upload"> 上传</i></button></span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-2"></div>
                                <div class="col-sm-7">
                                    <div class="btn-group pull-right">
                                        <button type="submit" class="btn btn-info pull-right submits" data-loading-text="&lt;i class='fa fa-spinner fa-spin '&gt;&lt;/i&gt; 提交">提交</button>
                                    </div>
                                    <div class="btn-group pull-left">
                                        <button type="reset" class="btn btn-warning">撤销</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                        -->
                        <div class="form-horizontal">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">头像</label>
                                <div class="col-sm-7">
                                    <div id="avatar-box">
                                        <div class="ibox-content">
                                            <div class="row">
                                                <div id="crop-avatar" class="col-md-6">
                                                    <div class="avatar-view" title="点击修改头像">
                                                        <img src="/uploads/avatar/20180129/20180129171418_393801.jpg" alt="avatar">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="modal fade" id="avatar-modal" aria-hidden="true" aria-labelledby="avatar-modal-label" role="dialog" tabindex="-1">
                                            <div class="modal-dialog modal-lg">
                                                <div class="modal-content">
                                                    <form class="avatar-form" action="http://localhost/wen/public/admin/User/index" enctype="multipart/form-data" method="post" style="border:1px solid red;">
                                                        <input type="hidden" name="id" value="1" />
                                                        <input type="hidden" name="actions" value="avatar" />
                                                        <div class="modal-header">
                                                            <button class="close" data-dismiss="modal" type="button">&times;</button>
                                                            <h4 class="modal-title" id="avatar-modal-label">图片大小限制在 2.00M</h4>
                                                        </div>
                                                        <div class="modal-body">
                                                            <div class="avatar-body">
                                                                <div class="avatar-upload">
                                                                    <input class="avatar-src" name="avatar_src" type="hidden">
                                                                    <input class="avatar-data" name="avatar_data" type="hidden">
                                                                    <label for="avatarInput">图片上传</label>
                                                                    <input class="avatar-input" id="avatarInput" name="file" type="file"></div>
                                                                <div class="row">
                                                                    <div class="col-md-9">
                                                                        <div class="avatar-wrapper"></div>
                                                                    </div>
                                                                    <div class="col-md-3">
                                                                        <div class="avatar-preview preview-lg"></div>
                                                                        <!--
                                                                        <div class="avatar-preview preview-md"></div>
                                                                        <div class="avatar-preview preview-sm"></div>
                                                                        -->
                                                                    </div>
                                                                </div>
                                                                <div class="row avatar-btns">
                                                                    <div class="col-md-9">
                                                                        <div class="btn-group">
                                                                            <button class="btn" data-method="rotate" data-option="-90" type="button"><i class="fa fa-undo"></i> 向左旋转</button>
                                                                        </div>
                                                                        <div class="btn-group">
                                                                            <button class="btn" data-method="rotate" data-option="90" type="button"><i class="fa fa-repeat"></i> 向右旋转</button>
                                                                        </div>
                                                                    </div>
                                                                    <div class="col-md-3">
                                                                        <button class="btn btn-info btn-block" type="submit"><i class="fa fa-save"></i> 保存修改</button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                   
                </div>
            </div>
        </div>
    </div>
</section>


    </div>
    
        
  <!--   <footer class="main-footer">
        <div class="pull-right">Version 1.4</div>
        Copyright &copy; 2016-2017 <a href="#" >QQ群：184278846</a>
    </footer> -->
</div>
<script type="text/javascript">
var KDEDT_DELETE_URL = 'admin/uploads/delete';   //【删除地址】如果有使用到KindEditor编辑器的文件空间删除功能，必须添加该删除地址全局变量

$(function(){
    /*ajax页面加载icheck，有该控件的页面才需要*/
    $('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
        checkboxClass: 'icheckbox_minimal-blue',
        radioClass: 'iradio_minimal-blue'
    });
    
    /*ajax页面加载icheck，有该控件的页面才需要*/
    $(".select2").select2({language:"zh-CN"});
    
    $('.timepicker').datetimepicker({
        format: 'YYYY-MM-DD',   //YYYY-MM-DD HH:mm:ss
        locale: moment.locale('zh-cn')
    });
    
    KindEditor.create('textarea[name="info"]',{
        width : '100%',   //宽度
        height : '320px',   //高度
        resizeType : '1',   //禁止拖动
        allowFileManager : false,   //允许对上传图片进行管理
        uploadJson : 'admin/uploads/upload',   //文件上传地址
        fileManagerJson : 'admin/uploads/manager',   //文件管理地址
        urlType : 'domain',   //带域名的路径
        formatUploadUrl: true,   //自动格式化上传后的URL
        autoHeightMode: false,   //开启自动高度模式
        afterBlur: function () { this.sync(); }   //同步编辑器数据
    });
    
    return new CropAvatar($('#avatar-box'));
    
    })
</script>
</body>
</html>