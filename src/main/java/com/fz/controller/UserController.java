package com.fz.controller;

import com.fz.entity.User;
import com.fz.service.UserService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = Logger.getLogger(String.valueOf(UserController.class));

    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
System.err.println("囧狙击");
        return "index";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Map<String, Object> find(User user, HttpServletRequest request){
        Map<String,Object> map = new HashedMap();
        System.out.println("你已通过springMVC进入controller方法。。。。");
        logger.info("你已通过springMVC进入controller方法。。。。");
        User loginuser = userService.findByUsernameAndPwd(user.getUsername(),user.getPassword());
        if(loginuser != null){
        	 map.put("result","success");
        }else {
        	map.put("result","fail");
        } 
        return map;
    }

    @RequestMapping("/success")
    public String success(){
        System.out.println("登录成功。。。。");
        logger.info("登录成功。。。。");
        return "success";
    }

}
