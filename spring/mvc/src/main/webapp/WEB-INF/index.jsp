<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1>All Books</h1>
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach items="${books}" var="book" varStatus="loop">
		<tr>    
		    <td><c:out value="${book.title}"/></td>
		    <td><c:out value="${book.description}"/></td>
		    <td><c:out value="${book.language}"/></td>
		    <td><c:out value="${book.numberOfPages}"/></td>
		    <td><a href="/books/delete/${book.id}">Delete</a></td>
		  <%--  <td><a href="/books/delete/${loop.index}">Delete</a></td> --%>
		</tr>
		</c:forEach>
    </tbody>
</table>
<a href="/books/new">New Book</a>
