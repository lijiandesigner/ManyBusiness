/**
 * login
 */
$(function(){
    //登陆
    
    $('body').off('click', '.login');
    $('body').on("click", '.login', function(event){
        var _this = $(this);
        _this.button('loading');
        var form = _this.closest('form');
        if(form.length){
           var zh=$("input[name='zh']").val();
           var pwd=$("input[name='pwd']").val();
           $.post("checklog",{"zh":zh,"pwd":pwd},function(aa){
        	   if(aa=="2"){
        		   //跳登陆页
        		   $.amaran({ 'message':'登陆成功', 'clearAll':true });
        		   _this.button('reset');
        	   }else if(aa=="1"){
        		   //跳充值页面
        		   $.amaran({ 'message':'账户余额不足', 'clearAll':true });
        		   _this.button('reset');
        	   }else{
        		   //提示账号或密码错误
        		   $.amaran({ 'message':'账号或密码错误', 'clearAll':true });
        		   _this.button('reset');
        	   }
           }) 
        }
    });
})