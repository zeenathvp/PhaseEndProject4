<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.simplilearn.phase4.model.User"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Users</title>
</head>
<h2><a href="home">Home</a></h2>
<h2><a href="logout">Logout</a></h2>
<body>
	<form action="searchUserbyName" method="post">
		<div>
			<input type="text" name="userName">
			<input type="submit" value="Search">
		</div>
	</form>
	<table>
		<tr>
			<th>User Name</th>
			<th>Role</th>
		</tr>
		<%
			ArrayList<User> userList = (ArrayList<User>)request.getAttribute("userList");
			for(User user: userList){
		%>
			<tr>
				<td><%=user.getUsername() %></td>
                <td><%=user.getRole() %></td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>