<%--
  Created by IntelliJ IDEA.
  User: usr
  Date: 19.03.2018
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<h:head><title>Welcome</title></h:head>
<h:body>
    <h1>Welcome to our site</h1>
<h:form>
    <h2>Click to see a <h:commandLink value="list of users" action="#{listUsersAction.execute}"/>.</h2>
</h:form>
</h:body>
</html>
