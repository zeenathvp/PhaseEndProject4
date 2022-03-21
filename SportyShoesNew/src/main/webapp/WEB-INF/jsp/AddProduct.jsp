<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.simplilearn.phase4.model.Category"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<h2><a href="home">Home</a></h2>
<h2><a href="logout">Logout</a></h2>
<body>
	<h1>Add Product</h1>
	<form action="addproduct" method="post">
		<table>
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="pdtName"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="pdtPrice"></td>
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
					</select>
				</td>
			</tr>
			<tr><td><input type="submit" value="Save"></td></tr>
		</table>
	</form>	
</body>
</html>