package com.my.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gjq
 * @create 2019-09-13-19:43
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    /**
     * 处理异常的业务逻辑
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param handler
     * @param ex
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception ex) {
        SysException e = null;
        if (ex instanceof SysException) {
            e = (SysException) ex;
        } else {
            e = new SysException("系统维护中");
        }
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();

        //存入提示信息
        mv.addObject("errorMsg", e.getMessage());
        mv.setViewName("error");

        return mv;
    }
}
