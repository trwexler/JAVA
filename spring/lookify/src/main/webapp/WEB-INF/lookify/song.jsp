<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="/lookify/dashboard">Dashboard</a>
<h1><c:out value="${thisSong.title}"/></h1>

<p>By <c:out value="${thisSong.artist}"/></p>
<p>Rating: <c:out value="${thisSong.rating}"/></p>


</body>
</html>