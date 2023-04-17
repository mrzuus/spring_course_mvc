<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.04.2023
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="showdetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>

    <br><br>
    Department
    <form:select path="department">
    <form:options items = "${employee.departments}"/>
    </form:select>
    <br><br>
    Which car do u want?
  <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Languages:
    <form:checkboxes path="language" items="${employee.languages}"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
