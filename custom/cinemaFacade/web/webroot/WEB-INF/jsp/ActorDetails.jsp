<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
	<title>Actor Details</title>
	<body>
		<h1>Actor Details</h1>
		
		Actor Details for ${actor.name} ${actor.surname}<br><br> 
		Nationality: ${actor.nationality}<br>
		
		<a href="../MovieDetails">Back to the movie</a>
	</body>
</html>