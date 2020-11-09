package com.wondersgroup.easyexcel.handler;

import com.alibaba.fastjson.JSON;
import com.wondersgroup.easyexcel.annotation.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: lizhu@wondesgroup.com
 * @date: 2020/11/5 16:10
 * @description: 日志拦截器
 */
@Slf4j
public class LogInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 拦截处理代码
        HandlerMethod method = (HandlerMethod) handler;
        Log logger = method.getMethodAnnotation(Log.class);
        if (null != logger) {
            //这个是需要拦截的方法
            log.info("[{}]请求被拦截，请求参数[{}]",method.getMethod().getName(), JSON.toJSON(method.getMethodParameters()));
        } else {
            //这个是不需要拦截的方法
            return true;
        }
        //返回true通过，返回false拦截
        return true;
    }
}
