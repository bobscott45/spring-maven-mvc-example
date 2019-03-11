<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: robert
  Date: 11/03/19
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <form:form action="processform" modelAttribute="student">
        First name: <form:input path="firstName"/> <br>
        Last name: <form:input path="lastName"/> <br>
        <form:button type="submit">Submit</form:button>
    </form:form>

</body>
</html>

