<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Movie Details</title>
<body>
	<h1>Movie Details</h1>

	Title: ${movie.title}
	<br> Genre: ${movie.genre}
	<br> Time: ${movie.time}
	<br> Year: ${movie.year}
	<br> Summary: ${movie.summary}
	<br> Director:
	<a href="./directors/${movie.director.code}">
		${movie.director.name} ${movie.director.surname}</a>
	<br> Productor:
	<a href="./productors/${movie.productor.code}">
		${movie.productor.name} ${movie.productor.surname}</a>
	<br>
	<ul>
		<c:forEach var="actor" items="${movie.actors}">
			<li><a href="./actors/${actor.code}">${actor.name}
					${actor.surname}</a></li>
		</c:forEach>
	</ul>
	<a href="../../cinemas">Back to Cinemas Listing</a>
</body>
</html>