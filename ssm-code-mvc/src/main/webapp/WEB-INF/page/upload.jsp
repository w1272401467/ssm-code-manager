<%--
  Created by IntelliJ IDEA.
  User: wujiajia
  Date: 2020/4/23
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>
<form method="post" action="/test/upload" enctype="multipart/form-data">
    <input type="text" name="id">
    <input type="file" name="file">
    <input type="submit" value="提交">
</form>
简单的上传文件下载文件页面

<a href="/test/download">下载</a>
</body>
</html>
