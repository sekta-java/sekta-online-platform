<%--
  Created by IntelliJ IDEA.
  User: natad
  Date: 18.05.2016
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>New user</title>
    <script src="https://code.jquery.com/jquery-2.2.4.js"
            integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous">
    </script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
            integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous">
    </script>
</head>
<body>
<h1>User's creation</h1>

<form action="/user/create" method="post" class="col-xs-offset-4 col-xs-4">
    <div class="form-group">
        <label for="user-name">Username</label>
        <input type="text" class="form-control" name="userName" id="user-name" placeholder="Peter">
    </div>
    <div class="form-group">
        <label for="email">E-mail</label>
        <input type="email" class="form-control" name="email" id="email" placeholder="peter.ivanov@gmail.com">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="text" class="form-control" name="password" id="password" placeholder="Ivanov">
    </div>
    <button type="submit" class="btn btn-primary col-xs-12">Add</button>
</form>
</body>
</html>
