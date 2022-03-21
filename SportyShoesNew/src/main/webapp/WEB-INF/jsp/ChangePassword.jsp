<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<h2><a href="home">Home</a></h2>
<h2><a href="logout">Logout</a></h2>
<body>
	<H1>Change Password</H1>
	<form action="changePassword" method="post">
		<table>
			<tr>
				<td>New Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr><td><input type="submit" value="Change"></td></tr>
		</table>
	</form>	
</body>
</html>