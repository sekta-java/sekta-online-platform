<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:body>
        <jsp:include page="_form-question.jsp">
            <jsp:param name="action" value="Add quetion"/>
            <jsp:param name="quizId" value="${quizId}"/>
        </jsp:include>
    </jsp:body>
</t:template>