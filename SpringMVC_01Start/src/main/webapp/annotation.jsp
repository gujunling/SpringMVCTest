<%--
  User: ling
  Date: 2019/9/10
  Time: 14:42
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>注解的测试</title>
    </head>
    <body>

        <a href="anno/testRequestParam?name=哈哈哈">RequestParam的测试</a>

        <br>
        <br>

        <form action="anno/testRequestBody" method="post">
            用户id：<input type="text" name="id"><br>
            用户名：<input type="text" name="username"><br>
            地址：<input type="text" name="address"><br>
            年龄：<input type="text" name="age"><br>
            生日：<input type="text" name="birthday"><br>
            <input type="submit" value="提交">
        </form>

        <br>

        <a href="anno/testPathVariable/10">PathVariable的测试</a>

        <br>
        <br>

        <a href="anno/testRequestHeader">RequestHeader的测试</a>


        <br>
        <br>

        <a href="anno/testCookieValue">CookieValue的测试</a>

        <br>
        <br>

        <form action="anno/testModelAttribute" method="post">
            用户id：<input type="text" name="id"><br>
            用户名：<input type="text" name="username"><br>
            地址：<input type="text" name="address"><br>
            年龄：<input type="text" name="age"><br>
            生日：<input type="text" name="birthday"><br>
            <input type="submit" value="提交">
        </form>

        <br>
        <br>

        <a href="anno/testSessionAttributes">SessionAttributes的测试</a>

        <br>
        <br>

        <a href="anno/getSessionAttributes">getSessionAttributes的测试</a>

        <br>
        <br>

        <a href="anno/delSessionAttributes">delSessionAttributes的测试</a>


    </body>
</html>
