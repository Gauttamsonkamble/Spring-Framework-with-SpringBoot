<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   Welcome to Spring Boot
 	
 	<form action="addUsers" method="post">
 		Enter User Id : <input type="text" name="uid"><br>
 		Enter User Name : <input type="text" name="uname"><br>
 		<input type="submit">
 	</form>
 	
 	<hr>
 	
 	<form action="getUser" method="get">
 		Enter User Id : <input type="text" name="uid"><br>
 		<input type="submit">
 	</form>
</body>
</html>