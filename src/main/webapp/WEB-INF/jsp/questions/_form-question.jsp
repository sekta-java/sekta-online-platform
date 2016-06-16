<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="/quizzes/${quizId}/questions/create" method="post">
    <div class="form-group">
        <label for="text">Question text:</label>
        <input type="text" class="form-control" name="text" id="text" placeholder="Your question..."
               required>
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
    <input type="hidden" class="form-control" name="quizId" value="${quizId}">
    <button type="submit" class="btn btn-primary col-xs-12">
        <c:out value="${param.action}"/>
    </button>
</form>

