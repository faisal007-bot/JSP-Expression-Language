<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>scope</title>
</head>
<body>
	<!-- pageScope requestScope sessionScope applicationScope param paramValues header headerValues 
	initParam cookie pageContext -->
	<!-- we can use attribute names and EL implicit objects inside the EL syntax
	we cannot use the java variables etc inside the EL syntax -->
	
	<%
		pageContext.setAttribute("country", "india");
	%>
	
	<!-- page has narrower scope than request than session than application -->
	
	<!-- getting attribute inside the application scope -->
	<h1>ID = ${applicationScope.id}</h1>
	
	<!-- getting attribute inside the session scope -->
	<h1>Name = ${sessionScope.name}</h1>
	
	<!-- getting attribute inside the request scope -->
	<h1>City = ${requestScope.city}</h1>
	
	<!-- getting attribute inside the page scope -->
	<h1>Country = ${pageScope.country}</h1>
	
</body>
</html>