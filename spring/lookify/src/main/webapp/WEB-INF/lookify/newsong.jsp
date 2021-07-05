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
		<h1> newSong page</h1>
		
		<form:form method="POST" action="/lookify/newsong"  modelAttribute="song">
			<div class="form-group">
		        <form:label path="title">Song Title</form:label>
		        <form:errors path="title"/>
		        <form:input class="form-control" path="title"/>
		    </div>
		    <div class="form-group">
		        <form:label path="artist">Artist</form:label>
		        <form:errors path="artist"/>
		        <form:input class="form-control" path="artist"/>
		    </div>
		    <div class="form-group">
		        <form:label path="rating">Rating</form:label>
		        <form:errors path="rating"/>
		        <form:input type="number" class="form-control" path="rating"/>
		    </div>
		    <button>Add Song</button>
		</form:form>
	
	</body>
</html>