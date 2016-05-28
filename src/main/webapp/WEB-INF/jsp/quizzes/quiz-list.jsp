<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: natad
  Date: 25.05.2016
  Time: 13:30
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
    <link rel="stylesheet" href="/static/quiz-list.css">
    <link rel="stylesheet" href="/static/general.css">
</head>
<body class="container">
<div class="create-button">
    <button type="button" class="btn btn-primary col-xs-2" data-toggle="modal" data-target="#myModal">New quiz</button>
</div>
<p class="text-center text-success col-offset-xs-12 bg-success flash-message">${message}</p>

<table class="table table-striped text-center all-items">
    <tr>
        <th class="col-xs-2 text-center">Quiz title</th>
        <th class="col-xs-3 text-center">Creator</th>
        <th class="col-xs-1 text-center">Questions</th>
        <th class="col-xs-1 text-center">Edit</th>
        <th class="col-xs-1 text-center">Delete</th>
    </tr>
<c:forEach items="${quizzes}" var="quiz">
    <tr>
        <td>${quiz.title}</td>
        <td>${quiz.creator.userName}</td>
        <td>${quiz.questions.size()}</td>
        <td><a href="/quizzes/edit/${quiz.id}"><i class="glyphicon glyphicon-pencil" style="color: #d9b144;"></i></a></td>
        <td>
            <form action="/quizzes/delete" method="post">
                <input type="hidden" name="id" value="${quiz.id}">
                <button type="submit" style="height: 0; border: 0; padding: 0;"><i class="glyphicon glyphicon-remove" style="color: #d90000;"></i></button>
            </form>
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
