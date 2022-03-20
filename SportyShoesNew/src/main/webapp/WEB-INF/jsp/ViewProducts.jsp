<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.simplilearn.phase4.model.Product"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Products</title>
</head>
<h2><a href="home">Home</a></h2>
<body>
	<h1>View Products</h1>
	<table>
		<tr>
			<th>Product Name</th>
			<th>Price</th>
			<th>Category</th>
		</tr>
		<%
			ArrayList<Product> pdtList = (ArrayList<Product>)request.getAttribute("productList");
			for(Product product: pdtList){
		%>
			<tr>
				<td><%=product.getProductName() %></td>
                <td><%=product.getPrice() %></td>
                <td><%=product.getCategory().getCategoryName() %></td>
			</tr>
		<%
			}
		%>
	</table>
</body>
</html>