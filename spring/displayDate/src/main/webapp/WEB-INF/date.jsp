<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
	<html>
		<head>
			<link rel="stylesheet" href="css/style.css"/>
			<meta charset="ISO-8859-1">
			<title>Date Template</title>
		</head>
		
		<body onload="dateAlert()">
		
		<p class="date">
		<fmt:formatDate pattern="EEEE, 'the' dd 'of' MMMM, YYYY" value="${dateTime}"/>
		</p>
		
			
			
		<script src="js/main.js"></script>
		</body>
	</html>