package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 *
 * @author gjq
 * @create 2019-09-09-17:59
 */
@Controller
@RequestMapping("/user")
public class HelloController {

    /**
     * 入门案例
     *
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("hello 帅锅");
        return "success";
    }


    /**
     * RequestMapping注解的使用
     *
     * @return
     */
    @RequestMapping("/requestMapping")
    public String testRequestMapping() {
        System.out.println("哈哈哈哈哈，RequestMapping");
        return "success";
    }


}
