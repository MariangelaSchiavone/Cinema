<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<title>Cinemas Listing</title>
</head>
<body>
	<h1>Cinemas Listing</h1>
	<ul>
		<c:forEach var="cinema" items="${cinemas}">
			<li><a href="./cinemas/${cinema.code}">${cinema.name}</a></li>
		</c:forEach>
	</ul>
</body>
</html>