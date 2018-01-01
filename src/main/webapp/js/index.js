$(function() {
	if ($.cookie("rememberUser")) {
		$("#rememberUser").attr("checked", true);
		$("#username").val($.cookie("username"));
		$("#password").val($.cookie("password"));
	}
	
	$("#userpwdA").click(function(){
			$("#userpwdA").hide();
			$("#qrcodeCanvas").hide();
			$("#username").show();
			$("#password").show();
			$("#loginBtn").show()
			$("#flabel").show();
	})
})

function saveUserInfo() {
	//alert($("#rememberUser").prop("checked"));
	;
	if ($("#rememberUser").prop("checked") == true) {
		var userName = $("#username").val();
		var passWord = $("#password").val();
		$.cookie("rememberUser", "true", {
			expires : 7
		}); // 存储一个带7天期限的 cookie
		$.cookie("username", userName, {
			expires : 7
		}); // 存储一个带7天期限的 cookie
		$.cookie("password", passWord, {
			expires : 7
		}); // 存储一个带7天期限的 cookie
	} else {
		$.cookie("rememberUser", "false", {
			expires : -1
		}); // 删除 cookie
		$.cookie("username", '', {
			expires : -1
		});
		$.cookie("password", '', {
			expires : -1
		});
	}
}


function login() {
        $.ajax({
            type: 'post',
            url: $('#loginForm').attr('action'),
            data: $('#loginForm').serialize(),
            async:false,
            dataType:'json',
            success: function(data){
                if (data.code == "0000"){
                	//记住密码
                	saveUserInfo();
                    location.href='/yygms/shop/list';
                }else{
                    $("#msg").text(data.msg);
                }
            }
        });  
 }

function QRcodeLogin() {
	$("#qrcodeCanvas").show();
	$("#username").hide();
	$("#password").hide();
	$("#loginBtn").hide()
	$("#flabel").hide()
	$("#userpwdA").show();
	/*$("#loginBtn").hide();
	$("#fgtpwdA").hide();
	$("#rememberUser").hide();
	$("#QRcodeA").hide();*/
	if($("#isCreateQR").val() == '0'){
		$("#qrcodeCanvas").qrcode({
			render : "canvas", // 设置渲染方式，有table和canvas，使用canvas方式渲染性能相对来说比较好
			text : "http://192.168.2.144:8080/yygms/user/find?username=user&password=123", // 扫描二维码后显示的内容,可以直接填一个网址，扫描二维码后自动跳向该链接
			width : "200", // 二维码的宽度
			height : "200", // 二维码的高度
			background : "#ffffff", // 二维码的后景色
			foreground : "#000000", // 二维码的前景色
			src : '../static/img/light.png' // 二维码中间的图片
		});
	}
	$("#isCreateQR").val('1');
 }



