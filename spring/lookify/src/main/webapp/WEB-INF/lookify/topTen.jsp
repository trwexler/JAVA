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

	<div class="container">
		<h1>Top Ten Songs</h1>
		<a class="float-right" href="dashboard">Dashboard</a>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Rating</th>
					<th>Title</th>
					<th>Artist</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ songs }" var="song">
				<tr>
					<td>${ song.rating }</td>
					<td><a href="song/${song.id}">${ song.title }</a></td>
					<td>${ song.artist}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>