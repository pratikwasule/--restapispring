<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3" bgcolor="orange">
<tr><td colspan="4" bgcolor="yellow"><marquee><h1>Registration Details</h1></marquee></td></tr>
<tr><td>State Name</td><td>District Name</td><td>Name</td><td>Phone</td></tr>
<c:forEach items="${lst}" var="b">
<tr>
<td><c:out value="${b.stCode}"></c:out></td>
<td><c:out value="${b.dtCode}"></c:out></td>
<td><c:out value="${b.name}"></c:out></td>
<td><c:out value="${b.mob}"></c:out></td>
</tr>



</c:forEach>

</table>
</body>
</html>