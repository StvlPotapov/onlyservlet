<%--
  Created by IntelliJ IDEA.
  User: usr
  Date: 19.03.2018
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list of users</title>
</head>
<body>
<h1> Our users are:</h1>
<c:forEach items=" ${requestScope.listusers} " var="listusers">
    <br> ${listusers}
</c:forEach>
</body>
</html>
