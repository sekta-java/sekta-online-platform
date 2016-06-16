<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:body>
        <form action="/quizzes/edit" method="post" class="col-xs-offset-4 col-xs-4 edit-page">
            <div class="form-group">
                <label for="creator-name">Creator name</label>
                <select class="form-control" name="userId" id="creator-name">
                    <option selected value="${quiz.creator.id}">${quiz.creator.userName}</option>
                    <c:forEach var="user" items="${users}">
                        <option value="${user.id}">${user.userName}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label for="quiz-title">Quiz title</label>
                <input type="text" class="form-control" name="title" value="${quiz.title}" id="quiz-title">
            </div>
            <div class="form-group">
                <input type="hidden" class="form-control" name="quizId" value="${quiz.id}">
            </div>
            <button type="submit" class="btn btn-primary col-xs-12">Edit</button>
        </form>
    </jsp:body>
</t:template>