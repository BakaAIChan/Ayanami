<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<hr>
<table border="1" cellspacing="0" width="800">
    <tr>
        <th>id</th>
        <th>url</th>

    </tr>
    <c:forEach items="${ayanamis}" var="ayanami" >
        <tr align="center">
            <td>${ayanami.id}</td>
            <td>${ayanami.url}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>