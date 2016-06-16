<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:attribute name="title">Homepage</jsp:attribute>
    <jsp:body>
        <a href="users">Manage users</a><br>
        <a href="quizzes">Manage quizzes</a><br>
        <a href="grades">Manage grades</a>
    </jsp:body>
</t:template>
