<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
	<html>
		<head>
			<link rel="stylesheet" href="css/style.css"/>
			<meta charset="ISO-8859-1">
			<title>Time Template</title>
			<script src="js/main.js"></script>
		</head>
		
		<script>timeAlert()</script>
		
		<p class="time">
		<fmt:formatDate pattern="h:mm a" value="${dateTime}"/>
		</p>
		
			
		</body>
	</html>