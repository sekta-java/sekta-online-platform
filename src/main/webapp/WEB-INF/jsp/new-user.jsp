<%--
  Created by IntelliJ IDEA.
  User: natad
  Date: 18.05.2016
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New user</title>
</head>
<body>
<h1>User's creation</h1>

<form action="create" method="post">
    <input type="text" name="userName" placeholder="your name">
    <input type="email" name="email" placeholder="your email">
    <input type="password" name="password" placeholder="your password">
    <input type="submit" value="Create">
</form>
</body>
</html>
