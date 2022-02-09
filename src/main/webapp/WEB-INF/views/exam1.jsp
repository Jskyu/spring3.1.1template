<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<c:forEach var="item" items="${data}" varStatus="status">
	<p>${status.count}. id : <c:out value="${item.id}"/>, name : <c:out value="${item.name}"/>, age : <c:out value="${item.age}"/> </p>
</c:forEach>
</body>
</html>