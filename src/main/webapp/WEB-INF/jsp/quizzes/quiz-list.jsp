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
</head>
<body>
<table class="table table-striped text-center quizzes">
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
        <td><a href="/user/edit/${quiz.id}"><i class="glyphicon glyphicon-pencil" style="color: #d9b144;"></i></a></td>
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
