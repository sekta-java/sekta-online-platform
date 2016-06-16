<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:body>
        <div class="create-button">
            <button type="button" class="btn btn-primary col-xs-2" data-toggle="modal" data-target="#myModal">New
                question
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
                        <jsp:include page="_form-question.jsp">
                            <jsp:param name="action" value="Add quetion"/>
                        </jsp:include>
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
                    <td><a href="/quizzes/${question.quiz.id}/questions/${question.id}/edit"><i
                            class="glyphicon glyphicon-pencil"
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
    </jsp:body>
</t:template>