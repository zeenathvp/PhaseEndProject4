<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.simplilearn.phase4.model.Category"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Purchase Reports</title>
</head>
<h2><a href="home">Home</a></h2>
<body>
	<form action="findPurchaseReports" method="post">
		<table>
			<tr>
				<td>Order Date (MM/DD/YYYY)</td>
				<td><input type="text" name="orderDate"></td>
			</tr>
			<tr>
				<td>Category</td>
				<td>
					<select name="category">
						<option value="0">Select One</option>
					<%
						ArrayList<Category> categoryList = (ArrayList<Category>)request.getAttribute("categoryList");
						for(Category category: categoryList){
					%>
						<option value=<%=category.getCategoryId() %>><%=category.getCategoryName() %></option>
					<%
						}
					%>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Search"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>