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
	<h1>Ninja page!</h1>
	
	<form:form action="/ninjas/new" method="POST" modelAttribute="ninjas">
		
		<form:label path="firstName">First Name: </form:label>
		<form:errors path="firstName"/>
		<form:input path="firstName"/>
		
		<form:label path="lastName">Last Name: </form:label>
		<form:errors path="lastName"/>
		<form:input path="lastName"/>
		
		<form:label path="age">Age: </form:label>
		<form:errors path="age"/>
		<form:input path="age"/>
		
		<form:label path="dojo">Dojo: </form:label>
		<form:errors path="dojo"/>
		<form:select path="dojo">
			<c:forEach items="${dojos}" var="dojo">
				<form:option value="${dojo.id}">
				${dojo.name}
				</form:option>
			</c:forEach>
		</form:select>
	
	
	
		<button>Add Dojo</button>
	
	</form:form>


</body>
</html>