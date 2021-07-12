<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="/dojos/new">Add New Dojo!</a>
<a href="/ninjas/new">Add New Ninja!</a>

<h1>Dojos!</h1>

<ul>
<c:forEach items="${dojos}" var="dojo">
<li>
<a href="/dojos/${dojo.id}">
${dojo.name} 
</a>

</li>
</c:forEach>
</ul>


</body>
</html>