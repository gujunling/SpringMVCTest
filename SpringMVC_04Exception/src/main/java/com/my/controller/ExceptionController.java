package com.my.controller;

import com.my.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gjq
 * @create 2019-09-13-19:14
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    /**
     * 异常处理的测试方法
     *
     * @return
     */
    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("testException方法执行");
        try {
            //模拟异常
            int i = 1 / 0;
        } catch (Exception e) {
            //打印异常信息
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("哈哈哈哈，出现错误了");
        }
        return "success";
    }
}
