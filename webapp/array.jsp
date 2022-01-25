<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Array</title>
</head>
<body>

	<%
		Integer[] arr = (Integer[])request.getAttribute("array");
	%>
	<% for(int i=0;i<arr.length;i++){ %>
	<h1><%= arr[i] %></h1><br/>
	<% } %>
	
	
	
	<!-- getting array elements using EL syntax -->
	<h1>${array[0]}</h1>
	<h1>${array[1]}</h1>
	<h1>${array[2]}</h1>
	
	
	
	
	<% 
		Integer[][] arr2 = (Integer[][])request.getAttribute("array2");
	%>
	<% for(int i=0;i<arr2.length;i++){ %>
	<% for(int j=0;j<arr2[i].length;j++){ %>
	<h1><%= arr2[i][j] %></h1><br/>
	<%  } %>
	<% } %>
	
	
	
	<!-- getting multidimensional array using EL -->
	<h1>${arr2[0][0]}</h1>
	<h1>${arr2[0][1]}</h1>
	<h1>${arr2[1][0]}</h1>
	<h1>${arr2[1][1]}</h1>
	
	<!-- getting attributes using square brackets with single or double quote -->
	<h1>${map['name_of_user']}</h1>
	<h1>${map["name_of_user"]}</h1>
</body>
</html>