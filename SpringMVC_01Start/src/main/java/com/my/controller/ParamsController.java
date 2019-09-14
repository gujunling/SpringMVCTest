package com.my.controller;

import com.my.domain.Account;
import com.my.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求参数绑定的控制器类
 *
 * @author gjq
 * @create 2019-09-09-22:38
 */
@Controller
@RequestMapping("/params")
public class ParamsController {

    /**
     * 请求参数绑定的测试
     *
     * @return
     */
    @RequestMapping("/testParams")
    public String testParams(String username, String password) {
        System.out.println("请求参数绑定的测试......");
        System.out.println("用户名为：" + username);
        System.out.println("密码为：" + password);
        return "success";
    }

    /**
     * 请求参数绑定,将数据封装到Javabean中
     *
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println(account);
        return "success";
    }


    /**
     * 自定义类型转换器实现
     *
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user) {
        System.out.println(user);
        return "success";
    }


    /**
     * Servlet原生的API
     *
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("测试成功");
        System.out.println(request + "," + response);
        return "success";
    }


}
