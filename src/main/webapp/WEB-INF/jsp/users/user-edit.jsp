<%--
  Created by IntelliJ IDEA.
  User: natad
  Date: 24.05.2016
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
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

<form action="/users/edit" method="post" class="col-xs-offset-4 col-xs-4">
    <div class="form-group">
        <label for="user-name">Username</label>
        <input type="text" class="form-control" name="userName" value="${user.userName}" id="user-name">
    </div>
    <label for="email">E-mail</label>
    <input type="email" class="form-control" name="email" value="${user.email}" id="email">
    </div>
    <div class="form-group">
        <input type="hidden" class="form-control" name="id" value="${user.id}">
    </div>
    <button type="submit" class="btn btn-primary col-xs-12">Edit</button>
</form>
</body>
</html>
