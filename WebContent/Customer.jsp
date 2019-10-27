<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*, com.mytoyota.Register.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customers</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<jsp:include page="WEB-INF/views/header.jsp"></jsp:include>


<div class="container">


<%

List<CustomerModel> list = (List<CustomerModel>) request.getAttribute("data");
for(CustomerModel user:list){
%>
<div class="row">
<div class="col-md-6">
<img style="width:35%;" src="https://www.winhelponline.com/blog/wp-content/uploads/2017/12/user.png" alt="avatar">
</div>
<div style="float:left;" class="col-md-6">
<br><br>
 <strong><p class="">Id :</strong><%=user.getId() %> </p>
 <strong><p class="">Name :</strong> <%=user.getName() %> </p>
 <strong><p class="">Email :</strong> <%=user.getEmail() %> </p>
 <strong><p class="">Phone :</strong> <%= user.getPhone() %></p>
 <strong><p class="">City :</strong> <%=user.getCity() %> </p>
</div>
</div>
<%} %>





</div>

</body>
<style>
.row{
border:1px solid black;
box-shadow: 3px 7px 13px 0px rgba(0,0,0,0.75);
margin:5px;
}
.col-md-6{
padding:10px;
text-align:center;
}
</style>
</html>