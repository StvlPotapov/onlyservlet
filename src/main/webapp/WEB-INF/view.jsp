<%--
  Created by IntelliJ IDEA.
  User: usr
  Date: 19.03.2018
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of users</title>
</head>
<body>
    <h1>Our users are:</h1>
<ui:repeat value="#{ListUsersAction.userList}" var="listusers">
    <h: outputText value="#{listusers}" />
    <br/>
</ui:repeat>
</body>
</html>
