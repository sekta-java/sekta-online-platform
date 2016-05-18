<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: natad
  Date: 18.05.2016
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table>
    <c:forEach items="${users}" var="user">
        <tr>
            <th>Username: </th>
            <td>${user.userName}</td>
        </tr>
        <tr>
            <th>Email: </th>
            <td>${user.email}</td>
        </tr>
        <tr>
            <th>Password: </th>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
