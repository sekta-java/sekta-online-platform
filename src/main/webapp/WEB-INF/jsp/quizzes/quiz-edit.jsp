<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: natad
  Date: 30.05.2016
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-2.2.4.js"
            integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous">
    </script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
            integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous">
    </script>
    <link rel="stylesheet" href="/static/user-list.css">
    <link rel="stylesheet" href="/static/general.css">
</head>
<body class="container">

<form action="/quizzes/edit" method="post" class="col-xs-offset-4 col-xs-4 edit-page">
    <div class="form-group">
        <label for="creator-name">Creator name</label>
        <select class="form-control" name="userId" id="creator-name">
            <option selected value="${quiz.creator.id}">${quiz.creator.userName}</option>
            <c:forEach var="user" items="${users}">
                <option value="${user.id}">${user.userName}</option>
            </c:forEach>
        </select>
    </div>
    <div class="form-group">
        <label for="quiz-title">Quiz title</label>
        <input type="text" class="form-control" name="title" value="${quiz.title}" id="quiz-title">
    </div>
    <div class="form-group">
        <a href="/questions/create/${quiz.id}">
            <button class="btn btn-primary">Add question</button>
        </a>
    </div>
    <div class="form-group">
        <input type="hidden" class="form-control" name="quizId" value="${quiz.id}">
    </div>
    <button type="submit" class="btn btn-primary col-xs-12">Edit</button>
</form>

</body>
</html>
