<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>

<form method="POST" action="/survey">

	<p>
		<label>Your Name: </label>
		<input type="text" name="name" />
	</p>
	
	<p>
		<label>Dojo Location: </label>
		
		<select name="location">
			<c:forEach items="${locations}" var="location">
				<option value="${location }" >${location}</option>
			</c:forEach>
		</select>
	</p>
	
	<p>
		<label>Favorite Language: </label>
		<select name="language">
			<c:forEach items="${languages}" var="language">
				<option value="${language }" >${language}</option>
			</c:forEach>
		</select>
	
	</p>
	
	
	<label>Comment (optional):</label>
	<textarea name="comment"></textarea>
	
	
	<button>Submit</button>

</form>

</body>
</html>