function login() {
	debugger
        $.ajax({
            type: 'post',
            url: $('#loginForm').attr('action'),
            data: $('#loginForm').serialize(),
            async:false,
            dataType:json,
            success: function(data){
            	debugger;
                if (data.result == "success"){
                    location.href='/shop/list';
                }else{
                    alert("用户名或者密码错误！");
                }
            }
        });
 }