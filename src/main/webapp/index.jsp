<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>主页</title>
    <link rel="stylesheet" href="stylef1.css">
    <script>
        function redirectToServlet() {
            window.location.href = window.location.origin + "/Ayanami/selectByIdServlet";
        }
    </script>
</head>
<body>
<div id="container">
    <button id="randomButton" onclick="redirectToServlet()">随机图片！</button>
</div>
<div id="footer">
    <p>共有${count}张图</p>
</div>
</body>
</html>
