<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:body>
<form action="/users/edit" method="post" class="col-xs-offset-4 col-xs-4">
    <div class="form-group">
        <label for="user-name">Username</label>
        <input type="text" class="form-control" name="userName" value="${user.userName}" id="user-name">
    </div>
    <label for="email">E-mail</label>
    <input type="email" class="form-control" name="email" value="${user.email}" id="email">
    </div>
    <div class="form-group">
        <input type="hidden" class="form-control" name="userId" value="${user.userId}">
    </div>
    <button type="submit" class="btn btn-primary col-xs-12">Edit</button>
</form>
    </jsp:body>
</t:template>