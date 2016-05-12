<!doctype html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Main page</title>
</head>
<body>

<h2>
    Hello,
    <c:if test="${name ne null}">
        ${name}
    </c:if>
</h2>

<form action="" method="GET">
    <input type="text" name="name" value="${name}">
    <input type="submit" value="Send">
</form>

</body>
</html>