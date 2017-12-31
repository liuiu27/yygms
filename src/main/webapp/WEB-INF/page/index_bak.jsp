<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>一元购</title>
</head>
<%--<link rel="stylesheet" href="/asset/css/style.css"/>--%>
<script type="text/javascript" src="../plugs/js/jquery-1.9.js"></script>
<script type="text/javascript" src="../static/js/index.js"></script>
    <!-- Bootstrap -->
 <script src="../plugs/js/bootstrap.min.js"></script>
 <link href="../plugs/css/bootstrap.min.css" rel="stylesheet">
 

<body>
<div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="sr-only">测试</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Project name</a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> 首页</a></li>
				<li><a href="#shop"><span class="glyphicon glyphicon-shopping-cart"></span>购物</a></li>
				<li><a href="#support"><span class="glyphicon glyphicon-headphones"></span> 支持</a></li>
			</ul>
		</div>
	</div>
</div>
<form id="userForm" action="/user/find" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="password">
    <button type="button" onclick="login()">登录</button>
</form>
</body>
<script>
    


</script>
</html>