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
		<div>
			<a href="newsong">Add New</a>
			<a href="/lookify/topTen">Top Songs</a>
			
			<form action="/lookify/searched">
				<input name="artist"/>
				<button>Search Artists</button>
			</form>		
		</div>
		
		<table>
			<thead>
				<tr>
					<td>Song</td>
					<td>Artist</td>
					<td>Ratings</td>
					<td>Actions</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allSongs}" var="song">
					<tr>
						<td><a href="song/${song.id}">${song.title}</a></td>
						<td>${song.artist}</td>
						<td>${song.rating}</td>
						<td>
							<form method="POST" action="/lookify/delete/${song.id}">
								<input type="hidden" name="_method" value="delete"/>
								<button>Delete</button>
							</form>
						</td>
						
						
					</tr>
				
				</c:forEach>
			
			</tbody>
			
		</table>

	</body>
	
</html>