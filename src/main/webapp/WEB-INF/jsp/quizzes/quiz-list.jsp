<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:body>
        <div class="create-button">
            <button type="button" class="btn btn-primary col-xs-2" data-toggle="modal" data-target="#myModal">New quiz
            </button>
        </div>
        <p class="text-center text-success col-offset-xs-12 bg-success flash-message">${message}</p>

        <!-- Modal -->
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h1>Quiz creation</h1>
                    </div>
                    <div class="modal-body">
                        <form action="/quizzes/create" method="post">
                            <div class="form-group">
                                <label for="user-name">Username</label>
                                <select class="form-control" name="userId" id="user-name" required>
                                    <option selected disabled>Select user</option>
                                    <c:forEach var="user" items="${users}">
                                        <option value="${user.userId}">${user.userName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="title">Quiz title:</label>
                                <input type="text" class="form-control" name="title" id="title"
                                       placeholder="Quiz title ..."
                                       required>
                            </div>
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
                <th class="col-xs-2 text-center">Quiz title</th>
                <th class="col-xs-3 text-center">Creator</th>
                <th class="col-xs-1 text-center">Questions</th>
                <th class="col-xs-1 text-center">Edit</th>
                <th class="col-xs-1 text-center">Delete</th>
            </tr>
            <c:forEach items="${quizzes}" var="quiz">

                <tr onclick="location.href='/quizzes/${quiz.id}/questions';" class="reference">
                    <td>${quiz.title}</td>
                    <td>${quiz.creator.userName}</td>
                    <td>${quiz.questions.size()}</td>
                    <td><a href="/quizzes/edit/${quiz.id}"><i class="glyphicon glyphicon-pencil"
                                                              style="color: #d9b144;"></i></a></td>
                    <td>
                        <form action="/quizzes/delete" method="post">
                            <input type="hidden" name="quizId" value="${quiz.id}">
                            <button type="submit" style="height: 0; border: 0; padding: 0;"><i
                                    class="glyphicon glyphicon-remove" style="color: #d90000;"></i></button>
                        </form>
                    </td>

                </tr>

            </c:forEach>
        </table>
    </jsp:body>
</t:template>