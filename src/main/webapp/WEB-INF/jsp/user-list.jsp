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
    <script src="https://code.jquery.com/jquery-2.2.4.js"
            integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous">
    </script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
            integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous">
    </script>
    <link rel="stylesheet" href="/static/user-list.css">
</head>
<body class="container">
<a href="/user/create" class="new-user">
    <button class="col-xs-2 btn btn-primary">New user</button>
</a>

<p class="text-center text-success col-offset-xs-12 message">${message}</p>

<table class="table table-striped text-center users">
    <tr>
        <th class="col-xs-2 text-center">Username:</th>
        <th class="col-xs-3 text-center">E-mail address:</th>
        <th class="col-xs-1 text-center">Edit</th>
        <th class="col-xs-1 text-center">Delete</th>
    </tr>

    <c:forEach items="${users}" var="user">
    <tr>
            <td>${user.userName}</td>
            <td>${user.email}</td>
        <td><i class="glyphicon glyphicon-pencil" style="color: #d9b144;"></i></td>
        <td><a href="/user/delete/${user.id}"><i class="glyphicon glyphicon-remove" style="color: #d90000;"></i></a></td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
