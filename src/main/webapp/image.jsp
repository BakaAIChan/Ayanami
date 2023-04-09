<%--
  Created by IntelliJ IDEA.
  User: AiChan
  Date: 2023/4/9
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>绫波丽图片</title>
    <link rel="stylesheet" href="styles.css">
    <script>
        window.onload = function() {
            showPopup();
        }
    </script>
    <script>
        function showPopup() {
            var popup = document.getElementById("popup");
            popup.style.display = "block";

            // 添加一个新的定时器
            setTimeout(hidePopup, 1200);
        }

        function hidePopup() {
            var popup = document.getElementById("popup");
            popup.classList.add("hide");
        }

        function toNewRandom(){
            location.reload();
        }

    </script>
</head>
<body>

<div id="container">
    <img id="image" src="${id}" alt="下一张随机图片" onclick="toNewRandom()">
    <div id="popup" class="popup">
        <p>${url}</p>
    </div>
</div>

</body>
</html>

