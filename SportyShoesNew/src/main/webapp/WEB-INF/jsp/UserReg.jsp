<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h1>User Registration</h1>
	<form action="addUser" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="userName"></td>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr><td><input type="submit" value="Save"></td></tr>
		</table>
	</form>	
</body>
</html>