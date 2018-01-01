package com.fz.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fz.common.enums.ErrorEnum;
import com.fz.common.exception.BizException;
import com.fz.common.exception.ParamException;
import com.fz.common.reponse.ResultBean;
import com.fz.entity.User;
import com.fz.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = Logger.getLogger(String.valueOf(UserController.class));

    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
    	String UUID=  java.util.UUID.randomUUID().toString().replaceAll("-", "");  
    	System.err.println("囧狙击");
        return "index";
    }

    @RequestMapping( value="/find")
    @ResponseBody
    public ResultBean find(User user){
    	ResultBean resultBean= 	new ResultBean();
    	
	   	if(StringUtils.isEmpty(user.getUsername())){
	    	return new ResultBean(new ParamException(ErrorEnum.PARAM_CHECK_NOTEMPTY, "用户名","username"));
	    }
    	if(StringUtils.isEmpty(user.getPassword())){
    		return new ResultBean(new ParamException(ErrorEnum.PARAM_CHECK_NOTEMPTY, "用户名","username"));
    	}
        Map<String,Object> map = new HashMap();
        System.out.println("你已通过springMVC进入controller方法。。。。");
        logger.info("你已通过springMVC进入controller方法。。。。");
        User loginuser = userService.findByUsernameAndPwd(user.getUsername(),user.getPassword());
        if(loginuser == null){
        	return new ResultBean(new ParamException(ErrorEnum.LOGIN_NOTUSER));
        }
        return resultBean;
    }



	@ResponseBody
    @RequestMapping("/success")
    public String success(){
        System.out.println("登录成功。。。。");
        logger.info("登录成功。。。。");
        return "success";
    }

}
