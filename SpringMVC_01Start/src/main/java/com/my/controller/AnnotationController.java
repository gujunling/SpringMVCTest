package com.my.controller;

import com.my.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * 注解测试的控制器类
 *
 * @author gjq
 * @create 2019-09-10-14:44
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes({"msg"})   //把msg中的信息 msg=哈哈哈  存入到session域对象中
public class AnnotationController {

    /**
     * 测试RequestParam注解
     *
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name") String username) {
        System.out.println("testRequestParam方法执行");
        System.out.println(username);
        return "success";
    }

    /**
     * 测试RequestBody注解
     * <p>
     * 获取到请求体内容
     *
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("testRequestBody方法执行");
        System.out.println(body);
        return "success";
    }


    /**
     * 测试PathVariable注解
     *
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable("sid") String id) {
        System.out.println("testPathVariable方法执行");
        System.out.println(id);
        return "success";
    }

    /**
     * 测试RequestHeader注解
     * <p>
     * 获取请求头信息
     *
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String header) {
        System.out.println("testRequestHeader方法执行");
        System.out.println(header);
        return "success";
    }

    /**
     * 测试CookieValue注解
     * <p>
     * 获取cookie的值
     *
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String cookieValue) {
        System.out.println("testCookieValue方法执行");
        System.out.println(cookieValue);
        return "success";
    }


    /**
     * 测试ModelAttribute注解
     *
     * @return
     */
   /* @RequestMapping("/testModelAttribute")
    public String testModelAttribute( User user) {
        System.out.println("testModelAttribute方法执行");
        System.out.println(user);
        return "success";
    }*/

    /**
     * 该方法会比testModelAttribute方法先执行
     */
    /*@ModelAttribute
    public User showUser(String uname) {
        System.out.println("showUser()方法执行了");
        //模拟通过用户查询数据库
        User user = new User();
        user.setId(20);
        user.setUname(uname);
        user.setAddress("河南");
        user.setAge(26);
        user.setBirthday(new Date());
        return user;
    }*/

    /**
     * 测试ModelAttribute注解
     *
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("haha") User user) {
        System.out.println("testModelAttribute方法执行");
        System.out.println(user);
        return "success";
    }

    /**
     * 该方法会比testModelAttribute方法先执行
     */
    @ModelAttribute
    public void showUser(String uname, Map<String, User> map) {
        System.out.println("showUser()方法执行了");
        //模拟通过用户查询数据库
        User user = new User();
        user.setId(20);
        user.setUname(uname);
        user.setAddress("河南");
        user.setAge(26);
        user.setBirthday(new Date());
        map.put("haha", user);

    }


    /**
     * 测试SessionAttributes注解
     * <p>
     * SessionAttributes 注解只能作用到类上
     *
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("testSessionAttributes方法执行");
        //底层会存储到request域对象中
        model.addAttribute("msg", "哈哈哈");
        return "success";
    }


    /**
     * 从session域中获取值
     *
     * @param modelMap
     * @return
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        System.out.println("getSessionAttributes方法执行");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }


    /**
     * 从session域中删除值
     *
     * @return
     */
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status) {
        System.out.println("delSessionAttributes方法执行");
        status.setComplete();
        return "success";
    }

}
