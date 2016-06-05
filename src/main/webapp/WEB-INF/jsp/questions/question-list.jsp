<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: natad
  Date: 30.05.2016
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questions</title>
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
<div class="create-button">
    <button type="button" class="btn btn-primary col-xs-2" data-toggle="modal" data-target="#myModal">New question
    </button>
</div>
<p class="text-center text-muted col-offset-xs-12 bg-info flash-message">${message}</p>

<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h1>Question creation</h1>
            </div>
            <div class="modal-body">
                <form action="/quizzes/${quizId}/questions/create" method="post">
                    <div class="form-group">
                        <label for="text">Question text:</label>
                        <input type="text" class="form-control" name="text" id="text" placeholder="Your question..."
                               required>
                    </div>
                    <div class="form-group">
                        <label for="answer1">Answer 1:</label>
                        <input type="text" class="form-control" name="answers" id="answer1">
                    </div>
                    <div class="form-group">
                        <label for="answer2">Answer 2:</label>
                        <input type="text" class="form-control" name="answers" id="answer2">
                    </div>
                    <div class="form-group">
                        <label for="answer3">Answer 3:</label>
                        <input type="text" class="form-control" name="answers" id="answer3">
                    </div>
                    <div class="form-group">
                        <label for="answer4">Answer 4:</label>
                        <input type="text" class="form-control" name="answers" id="answer4">
                    </div>
                    <input type="hidden" class="form-control" name="quizId" value="${quizId}">
                    <button type="submit" class="btn btn-primary col-xs-12">Add</button>
                </form>
            </div>
            <div class="modal-footer">
            </div>
        </div>
    </div>
</div>
<table class="table text-center list-items table-hover table-striped">
    <tr>
        <th class="col-xs-2 text-center">Question</th>
        <th class="col-xs-1 text-center">Edit</th>
        <th class="col-xs-1 text-center">Delete</th>
    </tr>
    <c:forEach items="${questions}" var="question">
        <tr>
            <td>${question.text}</td>
            <td><a href="/quizzes/${question.quiz.id}/questions/${question.id}/edit"><i class="glyphicon glyphicon-pencil"
                                                      style="color: #d9b144;"></i></a></td>
            <td>
                <form action="/quizzes/${question.quiz.id}/questions/delete" method="post">
                    <input type="hidden" name="questionId" value="${question.id}">
                    <button type="submit" style="height: 0; border: 0; padding: 0;">
                        <i class="glyphicon glyphicon-remove" style="color: #d90000;"></i>
                    </button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
