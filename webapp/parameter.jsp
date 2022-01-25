<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parameters</title>
</head>
<body>
	<!-- header and headervalues are used to get header and head -->
	<%-- ${header.language}
	${headerValues.encoding} --%>

	<!-- getting all the parameters having single values-->
	<h1>name of the user = ${param.name}</h1>
	<h1>city of the user = ${param.city}</h1>
	
	<!-- getting all the parameters having multiple values -->
	<h1>sport1 = ${paramValues.sports[0]}</h1>
	<h1>sport2 = ${paramValues.sports[1]}</h1>
	<h1>sport3 = ${paramValues.sports[2]}</h1>
</body>
</html>