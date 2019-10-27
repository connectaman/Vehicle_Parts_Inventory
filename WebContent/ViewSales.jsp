<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, com.mytoyota.Order.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Sales</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="WEB-INF/views/header.jsp"></jsp:include>


<div class="container">
<center>
<table class="table table-dark">
 <thead class="thead-dark">
<tr>
<th  scope="col">Order Id</th>
<th  scope="col">Customer ID</th>
<th  scope="col">Customer Name</th>
<th  scope="col">Customer Email</th>
<th  scope="col">Customer Phone</th>
<th  scope="col">Part Id</th>
<th scope="col" >Part Quantity</th>
</tr>
 </thead>
   <tbody>
<% 

List<SalesModel> list = (List<SalesModel>) request.getAttribute("data");
for(SalesModel sale:list){
%>
<tr>
<td scope="row"><%= sale.getOid() %></td>
<td><%= sale.getCid() %></td>
<td><%= sale.getCname() %></td>
<td><%= sale.getCemail() %></td>
<td><%= sale.getCphone() %></td>
<td><%= sale.getPid() %></td>
<td><%= sale.getQuantity() %></td>

</tr>
<%} %>
  </tbody>
</table>
</div>
</center>


</body>
<style>

td{

text-align:center;
padding:20px;
}
th{
color:white;
background-color:#44463C;
text-align:center;
padding:20px;
}
</style>
</html>