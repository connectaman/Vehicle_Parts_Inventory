<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, com.mytoyota.Stock.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Stock list</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body>
<jsp:include page="WEB-INF/views/header.jsp"></jsp:include>

<%
String status = (String) request.getAttribute("status");
if(status!=null){
%>
	<script>swal("Sorry :(","<%= status %>", "warning");</script>
<% } %>


<div class="container">
<center>
<table class="table table-dark">
 <thead class="thead-dark">
<tr>
<th  scope="col">Part Id</th>
<th  scope="col">Part Name</th>
<th  scope="col">Price</th>
<th scope="col" >Part Quantity</th>
<th scope="col" >Supplier Id</th>
<th scope="col"></th>
<th scope="col"></th>
</tr>
 </thead>
 <tbody>
  
<% 
List<StockModel> list = (List<StockModel>) request.getAttribute("data");
for(StockModel stock:list){
%>
<tr>
<td ><%= stock.getPid()   %></td>
<td><%=  stock.getPnname() %></td>
<td><%=  stock.getPrice() %></td>
<td><%= stock.getQuant()  %></td>
<td><%= stock.getSid()  %></td>
<td><a href="UpdateStock?id=<%= stock.getPid() %>"><button class="btn btn-success">  <i class="fa fa-pencil" style="font-size:14px"></i>Update</button></a></td>
<td><a href="DeleteStock?id=<%= stock.getPid() %>"><button class="btn btn-danger"> <i class="fa fa-scissors" style="font-size:14px"></i>Delete</button></a></td>
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