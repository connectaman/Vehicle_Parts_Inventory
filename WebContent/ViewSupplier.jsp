<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, com.mytoyota.supplier.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Suppliers</title>
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
<th  scope="col">Supplier Id</th>
<th  scope="col">Supplier Name</th>
<th  scope="col">Supplier Phone</th>
<th scope="col" >Supplier Address </th>
</tr>
 </thead>
   <tbody>
<% 

List<SupplierModel> list = (List<SupplierModel>) request.getAttribute("data");
for(SupplierModel supply:list){
%>
<tr>
<td ><%= supply.getId()    %></td>
<td><%=  supply.getName() %></td>
<td><%=  supply.getPhone() %></td>
<td><%=  supply.getAddress() %></td>
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