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
    <link rel="stylesheet" href="/static/grade-list.css">
    <link rel="stylesheet" href="/static/general.css">
</head>
<body class="container">

<!-- Trigger the modal with a button -->
<div class="create-button">
<button type="button" class="btn btn-primary col-xs-2" data-toggle="modal" data-target="#addGradeModal">Add grade</button>
</div>
<p class="text-center text-success col-offset-xs-12 bg-success flash-message">${message}</p>
<!-- addGradeModal -->
<div id="addGradeModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h1>Add grade</h1>
            </div>
            <div class="modal-body">
                <form action="/grade/create" method="post" class="">
                    <div class="form-group">
                        <label for="user-name">Username</label>
                        <%--<input type="text" class="form-control" name="userName" id="user-name" placeholder="Peter">--%>
                        <select class="form-control" name="userId" id="user-name" required>
                            <option selected disabled>Select user</option>
                            <c:forEach var="user" items="${users}">
                            <option value="${user.id}">${user.userName}</option>
                            </c:forEach>
                        </select>

                        <%--TODO: Select!!!--%>
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
            </div>
            <div class="modal-footer">
            </div>
        </div>
    </div>
</div>

<%--editModal--%>
<div id="editModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h1>Edit grade</h1>
            </div>
            <div class="modal-body">
                <form action="/users/create" method="post" class="">
                    <div class="form-group">
                        <label for="user-name">Username</label>
                        <input type="text" class="form-control" name="userName" id="user-name" placeholder="Peter">
                        <%--TODO: Select!!!--%>
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
            </div>
            <div class="modal-footer">
            </div>
        </div>
    </div>
</div>

<table class="table table-striped text-center all-items">
    <tr>
        <th class="col-xs-2 text-center">Username:</th>
        <th class="col-xs-1 text-center">Grade:</th>
        <th class="col-xs-4 text-center">Comments:</th>
        <th class="col-xs-1 text-center">Edit</th>
        <th class="col-xs-1 text-center">Delete</th>
    </tr>

    <c:forEach items="${grades}" var="grade">
    <tr>
        <td>${grade.user.userName}</td>
        <td>${grade.grade}</td>
        <td>${grade.comment}</td>
        <td><a href="" data-toggle="modal" data-target="#editModal"><i class="glyphicon glyphicon-pencil" data-toggle="modal" style="color: #d9b144;"></i></a></td>
        <td>
            <form action="/users/delete" method="post">
                <input type="hidden" name="id" value="${user.id}">
            <button type="submit" style="height: 0; border: 0; padding: 0;"><i class="glyphicon glyphicon-remove" style="color: #d90000;"></i></button>
            </form>
        </td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
