<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
</head>
<body>
<p>you have visited localhost:8080 <c:out value="${current}"/>times</p>
<p><a href="/">Take another visit?</a> | <a href="/reset">Reset</a></p>

</body>
</html>