<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.util.*, com.mytoyota.Order.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order History</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Toyota Parts</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="CustomerLogout">Logout</a></li>
    </ul>
  
  </div>
</nav>

<div class="container">
<center><h1>Your Order History</h1></center>
<center>


<table>
<tr>
<th>Order Id</th>
<th>Customer ID</th>
<th>Quantity</th>
<th>Product Id</th>
<th>Date</th>
<th>Time</th>
</tr>
<%
List<CustomerOrderModel> data = (List<CustomerOrderModel>) request.getAttribute("data");
if(data!=null){
	for(CustomerOrderModel c:data){
		String d = c.getDate().substring(0,10);
		String t = c.getDate().substring(10,16);
%>

<tr>
<td><%= c.getOid() %></td>
<td><%= c.getCid() %></td>
<td><%= c.getQty() %></td>
<td><%= c.getPid() %></td>
<td><%= d %></td>
<td><%= t %></td>
</tr>

<% } } %>
</table>
</center>

</div>



<style>
table{
padding:10px;
border:1px solid black;
}
th{
background-color:black;
color:white;
}
th,td{
padding:10px;
text-align:center;

}

</style>

</body>
</html>