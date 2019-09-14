package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gjq
 * @create 2019-09-13-20:35
 */
@Controller
@RequestMapping("/interceptor")
public class InterceptorController {


    /**
     * 拦截器
     *
     * @return
     */
    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        System.out.println("testInterceptor方法执行");
        return "success";
    }
}
