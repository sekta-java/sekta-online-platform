<%--
  Created by IntelliJ IDEA.
  User: natad
  Date: 30.05.2016
  Time: 20:30
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
<h2>This quiz has no questions yet.</h2>

<form action="/questions/create" method="post" class="col-xs-offset-4 col-xs-4 edit-page">
    <div class="form-group">
        <label for="question">Question:</label>
        <input type="text" class="form-control" name="text" id="question">
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
    <div class="form-group">
        <input type="hidden" class="form-control" name="quizId" value="${quizId}">
    </div>
    <button type="submit" class="btn btn-primary col-xs-12">Add question</button>
</form>

</body>
</html>
