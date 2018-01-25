/**
 * login
 */
$(function(){
    //登陆
   // $.amaran({ 'message':'wang', 'clearAll':true });
    $('body').off('click', '.login');
    $('body').on("click", '.login', function(event){
        var _this = $(this);
        _this.button('loading');
        var form = _this.closest('form');
        if(form.length){
        	alert();
           $.post("checklog",{},function(aa){
        	   alert(aa);
        	   console.log(aa);
           }) 
        }
    });
})