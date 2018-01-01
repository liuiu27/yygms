<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录后台管理系统</title>
<link href="../static/css/style.css" rel="stylesheet" type="text/css" />
<!-- <script src="../plugs/js/cloud.js" type="text/javascript"></script> -->

<script type="text/javascript" src="../plugs/js/jquery-1.9.js"></script>
<script type="text/javascript" src="../plugs/js/jquery.cookie.js"></script>
<script type="text/javascript" src="../plugs/js/jquery-qrcode.js"></script>

<script type="text/javascript" src="../js/index.js"></script>


<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  
});  
</script> 

</head>

<body style="background-color:#df7611; background-image:url(../static/img/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎来到帆之一元购</span>    
    <ul>
    <li><a href="#">回首页</a></li>
    <li><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    </ul>    
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    <input id ='isCreateQR' name="isCreateQR" type="hidden"  value="0" />
    <form id="loginForm" name="loginForm"  action="/yygms/user/find" >
    <ul>
     <li> <div id="qrcodeCanvas"  style="display: none"></div></li>
    <li><input id ='username' name="username" type="text" class="loginuser" value="" onclick="JavaScript:this.value=''"/></li>
    <li><input id ="password" name="password" type="text" class="loginpwd" value="" onclick="JavaScript:this.value=''"/></li>
    <li><input id ="loginBtn" name="loginBtn" onclick="login()"  type="button" class="loginbtn" value="登录"  />
    <!--  <input name="QRcodeLoginBnt" onclick="QRcodeLogin()"  type="button" class="loginbtn" value="扫码登录"  /> -->
    <label id= "flabel"><input id="rememberUser" name="rememberUser" type="checkbox" value="" checked="checked" />记住密码
    <a  id="fgtpwdA" href="#">忘记密码？</a> <a id="QRcodeA" onclick="QRcodeLogin()" href="#">扫码登录</a>
    </label><a id="userpwdA" style="display: none" onclick="userpwdLogin()" href="#">账号登录</a> </li>
 	<li > <p id ="msg" style="color: red"> </p> </li>
    </ul>
    </form>
    </div>
    
   
    </div>
    
    
    
    <div class="loginbm">版权所有  2014  <a href="http://www.uimaker.com">uimaker.com</a>  仅供学习交流，勿用于任何商业用途</div>
	
    
</body>

</html>
