package com.fz.common.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.fz.common.exception.BizException;
import com.fz.common.exception.ParamException;

public class MyExceptionHandler implements HandlerExceptionResolver {  
  
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,  
            Exception ex) {  
        Map<String, Object> model = new HashMap<String, Object>();  
        model.put("ex", ex);  
          
        // 根据不同错误转向不同页面  
        if(ex instanceof BizException) {  
            return new ModelAndView("error-business", model);  
        }else if(ex instanceof ParamException) {  
            return new ModelAndView("error-parameter", model);  
        } else {  
            return new ModelAndView("error", model);  
        }  
    }  
}  