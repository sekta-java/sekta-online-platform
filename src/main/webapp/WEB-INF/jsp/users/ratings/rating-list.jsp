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
    <link rel="stylesheet" href="/static/rating-list.css">
    <link rel="stylesheet" href="/static/general.css">
    <h1 align="center">Rating</h1>
</head>
<body class="container">

<table class="table table-striped text-center all-items">
    <tr>
        <th class="col-xs-3 text-center"></th>
        <th class="col-xs-2 text-center">Raiting:</th>
        <th class="col-xs-4 text-center">Username:</th>
        <th class="col-xs-3 text-center"></th>
    </tr>

    <c:forEach items="${usersWithRating}" var="user">
    <tr>
        <td></td>
        <td>${user.rating}</td>
        <td>${user.userName}</td>
        <td></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
