<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Dear employee, you are welcome</h2>
<br>

<br>
<%--Your name : ${param.employeeName}--%>

Your name : ${employee.name}
<br>
<br>
Your surname : ${employee.surname}
<br>
<br>
Your salary: ${employee.salary}
<br>
<br>
Your department : ${employee.department}
<br><br>
Your car : ${employee.carBrand}
<br><br>
Your languages:
<ul>
    <c:forEach var = "lang" items="${employee.language}">
        <li>${lang}</li>
    </c:forEach>
</ul>
</body>
</html>
