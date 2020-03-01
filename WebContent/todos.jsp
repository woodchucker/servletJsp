<%--
	Document:todos
	Author: Fabrizio-W10
	
 --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Hello World!</h1>
<c:forEach var="test" items="a,b,c">
${test}
</c:forEach>
	<c:forEach  var="todo" items="${todoList}">
		<div><b>${todo.title}</b>${todo.details}</div>
	</c:forEach>
</body>
</html>