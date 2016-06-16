<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:body>
        <form action="/quizzes/${question.quiz.id}/questions/edit" method="post"
              class="col-xs-offset-4 col-xs-4 edit-page">
            <div class="form-group">
                <label for="question-text">Question:</label>
                <input type="text" class="form-control" name="questionText" value="${question.text}" id="question-text">
            </div>
            <c:forEach items="${question.answers}" var="answer" varStatus="i">
                <div class="form-group">
                    <label for="answer">Answer :</label>
                    <input type="text" class="form-control" name="answers" value="${answer.text}" id="answer">
                </div>
            </c:forEach>

            <c:if test="${question.answers.size() < 5}">
                <div class="form-group">
                    <a href="/quizzes/${question.quiz.id}/questions/${question.id}/answers/create">
                        <button type="button" class="btn btn-primary">
                            Add answer
                        </button>
                    </a>
                </div>
            </c:if>

            <input type="hidden" class="form-control" name="questionId" value="${question.id}">
            <input type="hidden" class="form-control" name="quizId" value="${question.quiz.id}">
            <button type="submit" class="btn btn-primary col-xs-12">Edit</button>
        </form>
    </jsp:body>
</t:template>