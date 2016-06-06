<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: natad
  Date: 05.06.2016
  Time: 14:14
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
    <link rel="stylesheet" href="/static/general.css">
</head>
<body class="container">
<form action="/quizzes/${question.quiz.id}/questions/edit" method="post" class="col-xs-offset-4 col-xs-4 edit-page">
    <div class="form-group">
        <label for="question-text">Question:</label>
        <input type="text" class="form-control" name="questionText" value="${question.text}" id="question-text">
    </div>
    <c:forEach items="${question.answers}" var="answer" varStatus="i">
        <div class="form-group">
            <label for="answer">Answer ${i.index+1}:</label>
            <input type="text" class="form-control" name="answers" value="${answer.text}" id="answer">
        </div>
    </c:forEach>
    <c:if test="${question.answers.size() < 5}">
        <div class="form-group">
            <a href="/quizzes/${question.quiz.id}/questions/${question.id}/answers/create">
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                    Add answer
                </button>
            </a>
        </div>
    </c:if>
    <input type="hidden" class="form-control" name="questionId" value="${question.id}">
    <input type="hidden" class="form-control" name="quizId" value="${question.quiz.id}">
    <button type="submit" class="btn btn-primary col-xs-12">Edit</button>
</form>
</body>
</html>
