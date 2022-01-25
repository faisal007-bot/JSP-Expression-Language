<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index page</title>
</head>
<body>
	<form action="s2" method="POST">
		Name = <input type="text" name="name"/><br/>
		city = <input type="text" name="city"/><br/>
		fifa = <input type="checkbox" name="sports" value="fifa"/>
		uefa = <input type="checkbox" name="sports" value="uefa"/>
		liga = <input type="checkbox" name="sports" value="liga"/>
		<input type="submit" value="GO"/>
	</form>
</body>
</html>