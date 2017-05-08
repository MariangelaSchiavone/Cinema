<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Director Details</title>
    <body>
        <h1>Director Details</h1>
 
        Director Details<br><br>
            Nome: ${director.name}<br>
            Surname: ${director.surname}<br>
            Nationality: ${director.nationality}<br>
            Matches:<br>
        <a href="../movies">Back to Movie</a>
    </body>
</html>