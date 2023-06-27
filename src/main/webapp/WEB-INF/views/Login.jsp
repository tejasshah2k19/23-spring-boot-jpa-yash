<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>


	<form action="authenticate" method="post">
		Email: <input type="text" name="email" /><br><br> 
		Password: <input type="password" name="password" /><br><Br>
		<input type="submit" value="Login" />
	</form>
	<br><br>
	${error}
</body>
</html>