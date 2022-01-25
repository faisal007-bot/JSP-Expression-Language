<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bean</title>
</head>
<body>

	<!-- bean can be used with properties only -->
	<h1>${user.id}</h1>
	<h1>${user.name}</h1>
	<h1>${user.address.city.city}</h1>
	<h1>${user.address.country.country}</h1>
</body>
</html>