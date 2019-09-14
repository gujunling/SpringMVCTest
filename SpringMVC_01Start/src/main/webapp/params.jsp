<%--
  User: ling
  Date: 2019/9/9
  Time: 22:36
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>请求参数的绑定测试</title>
    </head>
    <body>

        <%--   <a href="params/testParams?username=hehe&password=123456">请求参数绑定</a>--%>
        <%--把数据封装到Javabean类Account中--%>
        <%--<form action="params/saveAccount" method="post">
            姓名：<input type="text" name="username"><br>
            密码：<input type="password" name="password"><br>
            金额：<input type="text" name="money"><br>
            用户id：<input type="text" name="user.id"><br>
            用户名：<input type="text" name="user.uname"><br>
            地址：<input type="text" name="user.address"><br>
            年龄：<input type="text" name="user.age"><br>
            <input type="submit" value="提交">
        </form>--%>

        <%--把数据封装到Javabean类Account中，类中存在list和map集合元素--%>
        <%--<form action="params/saveAccount" method="post">
            姓名：<input type="text" name="username"><br>
            密码：<input type="password" name="password"><br>
            金额：<input type="text" name="money"><br>

            用户id：<input type="text" name="list[0].id"><br>
            用户名：<input type="text" name="list[0].uname"><br>
            地址：<input type="text" name="list[0].address"><br>
            年龄：<input type="text" name="list[0].age"><br>

            用户id：<input type="text" name="map['one'].id"><br>
            用户名：<input type="text" name="map['one'].uname"><br>
            地址：<input type="text" name="map['one'].address"><br>
            年龄：<input type="text" name="map['one'].age"><br>
            <input type="submit" value="提交">
        </form>--%>

        <%--自定义类型转换器表单--%>
        <%--<form action="params/saveUser" method="post">
            用户id：<input type="text" name="id"><br>
            用户名：<input type="text" name="uname"><br>
            地址：<input type="text" name="address"><br>
            年龄：<input type="text" name="age"><br>
            生日：<input type="text" name="birthday"><br>
            <input type="submit" value="提交">
        </form>--%>


            <a href="params/testServlet">测试Servlet原生的API</a>
    </body>
</html>
