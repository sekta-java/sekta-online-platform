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
    <link rel="stylesheet" href="/static/grade-list.css">
    <h1 align="center">Edit grade</h1>
</head>
<body class="container">

<form action="/grades/edit" method="post" class="col-xs-offset-4 col-xs-4">
    <div class="form-group">
        <label>User: ${grade.user.userName}</label>
    </div>

    <div class="form-group">
        <label for="grade">Grade</label>
        <input type="number" class="form-control" name="grade" value="${grade.grade}" id="grade"  min="0" max="100" required>
    </div>

    <div class="form-group">
        <label for="comment">Comment</label>
        <input type="text" class="form-control" name="comment" value="${grade.comment}" id="comment">
    </div>
    <div class="form-group">
        <input type="hidden" class="form-control" name="id" value="${grade.id}">
    </div>

    <button type="submit" class="btn btn-primary col-xs-12">Edit</button>
</form>
</body>
</html>
