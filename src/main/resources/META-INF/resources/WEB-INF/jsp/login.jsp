<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
Welcome to the Login page!!!
<pre>${errormsg}</pre>
<form method="post">
	Name:<input type="text" name="username">
	Password:<input type="password" name="userpassword">
		<input type="submit">
		
</form>
</body>
</html>