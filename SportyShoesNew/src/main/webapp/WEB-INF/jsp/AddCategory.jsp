<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Category</title>
</head>
<h2><a href="home">Home</a></h2>
<body>
	<h1>Add Category</h1>
	<form action="addcategory" method="post">
		<table>
			<tr>
				<td>Category Name</td>
				<td><input type="text" name="catName"></td>
			</tr>
			<tr><td><input type="submit" value="Save"></td></tr>
		</table>
	</form>	
</body>
</html>