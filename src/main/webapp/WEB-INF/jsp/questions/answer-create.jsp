<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:attribute name="title">Homepage</jsp:attribute>
    <jsp:body>
        <form action="/quizzes/${question.quiz.id}/questions/${question.id}/answers/create"
              method="post" class="col-xs-offset-4 col-xs-4 edit-page">
            <div class="form-group">
                <label for="answerText">Answer :</label>${question.id}
                <input type="text" class="form-control" name="answerText" id="answerText">
            </div>
            <input type="hidden" name="questionId" value="${question.id}">
            <input type="hidden" class="form-control" name="quizId" value="${quizId}">
            <button type="submit" class="btn btn-primary col-xs-12">Add</button>
        </form>
    </jsp:body>
</t:template>
