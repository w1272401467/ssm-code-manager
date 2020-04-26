package com.wjj.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//这是一个springMvc拦截器，只要实现了HandlerInterceptor 就是拦截器了
public class SpringMvcInterceptor implements HandlerInterceptor {

    //   请求发送到controller之前执行,true 就去执行controller
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("请求发送到controller之前执行!");
        return false;
    }

//    是在controller调用完成之后执行
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("是在controller调用完成之后执行!");
    }

//    请求完成后,也许要释放资源
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("请请求完成后,也许要释放资源!");
    }
}
