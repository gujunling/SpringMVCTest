package com.my.controller;

import com.my.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author gjq
 * @create 2019-09-10-21:15
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 测试响应数据返回值为String类型的情况
     *
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString方法执行");

        //模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("哈哈哈");
        user.setPassword("123456");
        user.setAge(26);
        user.setBirthday(new Date());
        //存储数据
        model.addAttribute("user", user);
        return "success";
    }


    /**
     * 测试响应数据返回值为Void类型的情况
     * 请求转发是一次请求，不需要编写项目的名称
     * 重定向是两次请求，需要编写项目的名称
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid方法执行");
        //编写请求转发的程序
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
        //重定向
//        response.sendRedirect(request.getContextPath() + "/index.jsp");

        //设置中文编码格式
        request.setCharacterEncoding("utf-8");
        //设置浏览器解析编码
        response.setContentType("text/html;charset=UTF-8");

        //直接进行响应
        response.getWriter().println("哈哈哈哈哈");
        return;
    }

    /**
     * 测试响应数据返回值为ModelAndView类型的情况
     *
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelAndView方法执行");

        //模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("贱人");
        user.setPassword("123456");
        user.setAge(26);
        user.setBirthday(new Date());
        //把User对象存储到mv对象中，也会把User对象存入到request域对象中
        mv.addObject("user", user);
        //跳转到哪个页面中
        mv.setViewName("success");
        return mv;
    }


    /**
     * 使用关键字的方式进行转发或者重定向
     *
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect() {
        System.out.println("testForwardOrRedirect方法执行");

        //请求的转发
//        return "forward:/WEB-INF/pages/success.jsp";
        //请求的重定向
        return "redirect:/index.jsp";

    }

    /**
     * 模拟ajax的异步请求和响应
     *
     * @param user
     * @return
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user) {
        System.out.println("testAjax方法执行");
        //客户端发送ajax请求，传的是json字符串，后台把json字符串封装到user对象中
        System.out.println(user);
        //做响应，模拟查询数据库
        user.setUsername("嘿嘿嘿");
        user.setAge(30);
        //做响应
        return user;
    }


}
