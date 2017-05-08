<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Movie Details</title>
    <body>
        <h1>Movie Details</h1>
 
        	Title: ${movie.title}<br>
            Genre: ${movie.genre}<br>
            Time: ${movie.time}<br>
            Year: ${movie.year}<br>
            Summary: ${movie.summary}<br>
            Director: ${movie.director.name}  ${movie.director.surname}<br>
            Productor: ${movie.productor.name}  ${movie.director.surname}<br>
          <!--  <ul>
             <c:forEach var="actors" items="${movie.actors}">
                <li>${match.matchSummaryFormatted}</li>
              </c:forEach>
            </ul>-->
        <a href="../cinemas">Back to Movie Listing</a>
    </body>
</html>