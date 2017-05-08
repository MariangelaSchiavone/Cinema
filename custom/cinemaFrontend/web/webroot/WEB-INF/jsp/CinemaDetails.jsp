<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<title>Cinema Details</title>
</head>
<body>
	<h1>Cinema Details</h1>

	Cinema Details for ${cinema.name}
	<br>
	<br> City: ${cinema.city}
	<br> Showtime:
	<br>
	<ul>
		<c:forEach var="showtime" items="${cinema.showtimes}">
			<li><a href="./movies/${showtime.movie.code}">${showtime.movie.title}</a> Data: ${showtime.date}</li>
		</c:forEach>
	</ul>
	<a href="../cinemas">Back to Cinemas Listing</a>
</body>
</html>