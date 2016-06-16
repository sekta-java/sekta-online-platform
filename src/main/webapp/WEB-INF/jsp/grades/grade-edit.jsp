<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:body>
        <form action="/grades/edit" method="post" class="col-xs-offset-4 col-xs-4">
            <div class="form-group">
                <label>User: ${grade.user.userName}</label>
            </div>

            <div class="form-group">
                <label for="grade">Grade</label>
                <input type="number" class="form-control" name="grade" value="${grade.grade}" id="grade" min="0"
                       max="100" required>
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
    </jsp:body>
</t:template>