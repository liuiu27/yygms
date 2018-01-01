function login() {
        $.ajax({
            type: 'post',
            url: $('#loginForm').attr('action'),
            data: $('#loginForm').serialize(),
            //async:false,
            dataType:'json',
            success: function(data){
                if (data.result == "success"){
                    location.href='/yygms/shop/list';
                }else{
                    alert("用户名或者密码错误！");
                }
            }
        });
 }