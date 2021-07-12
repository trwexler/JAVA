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


<form:form action="/dojos/new" method="POST" modelAttribute="dojos">

<form:label path="name">Dojo Name: </form:label>
<form:errors path="name"/>
<form:input path="name"/>
<button>Add Dojo</button>

</form:form>



</body>
</html>