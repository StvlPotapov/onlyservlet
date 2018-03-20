<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: usr
  Date: 20.03.2018
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<c:forEach items=" ${requestScope.testHashMap} " var="test">
    <c:out value="${test}"/>
    <%--<br> ${listusers}--%>
</c:forEach>

</body>
</html>
