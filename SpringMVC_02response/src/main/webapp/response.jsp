<%--
  User: ling
  Date: 2019/9/10
  Time: 21:12
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <script src="js/jquery.min.js"></script>
        <script>
            // 页面加载，绑定单击事件
            $(function(){
                $("#btn").click(function(){
                     alert("哈哈哈");
                    // 发送ajax请求
                    $.ajax({
                        //编写json格式，设置属性和值
                        url:"user/testAjax",
                        contentType:"application/json;charset=UTF-8",
                        data:'{"username":"haha","password":"123456","age":26,"birthday":"2018-05-06"}',
                        dataType:"json",
                        type:"post",
                        success:function (data) {
                            //data指服务器端响应的json的数据，进行解析
                            alert(data);
                            alert(data.username);
                            alert(data.password);
                            alert(data.age);
                            alert(data.birthday);
                        }
                    });

                });
            });

        </script>
    </head>
    <body>


        <a href="user/testString">响应数据返回值为String类型</a>

        <br>
        <br>
        <a href="user/testVoid">响应数据返回值为Void类型</a>

        <br>
        <br>
        <a href="user/testModelAndView">响应数据返回值为ModelAndView类型</a>

        <br>
        <br>
        <a href="user/testForwardOrRedirect">ForwardOrRedirect</a>

        <br>
        <br>
        <button id="btn">发送ajax请求</button>

    </body>
</html>
