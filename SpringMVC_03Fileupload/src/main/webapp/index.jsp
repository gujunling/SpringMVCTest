<%--
  User: ling
  Date: 2019/9/13
  Time: 15:16
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>文件上传</title>
    </head>
    <body>

        <h3>传统的文件上传</h3>
        <br>

        <form action="fileupload/fileUpload1" method="post" enctype="multipart/form-data">
            选择文件:<input type="file" name="upload">
            <br>
            <input type="submit" value="上传">
        </form>

        <h3>SpringMVC的文件上传</h3>
        <br>

        <form action="fileupload/fileUpload2" method="post" enctype="multipart/form-data">
            选择文件:<input type="file" name="upload">
            <br>
            <input type="submit" value="上传">
        </form>

        <h3>跨服务器的文件上传</h3>
        <br>

        <form action="fileupload/fileUpload3" method="post" enctype="multipart/form-data">
            选择文件:<input type="file" name="upload">
            <br>
            <input type="submit" value="上传">
        </form>

    </body>
</html>
