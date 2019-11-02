<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*, com.mytoyota.analytics.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Analytics</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="WEB-INF/views/header.jsp"></jsp:include>
<%
AnalyticsModel data = (AnalyticsModel) request.getAttribute("data");
if(data!=null){
%>

<div class="container">
<center>
<h2>Analytics</h2>
</center>
<div class="row">
<div style="border:2px solid gold;" class="col-md-3">
<center>
<div class="card" style="width: 18rem;">
  <img style="width:100%;" src="https://www.pngrepo.com/download/283595/profits-analytics.png" class="card-img-top" alt="...">
  <div class="card-body">
    <h3 class="card-title">Customer Count</h3>
    <h1 class="card-text"><%= data.getCustomer() %></h1>
  </div>
</div>
</center>
</div>
<div style="border:2px solid gold;" class="col-md-3">
<center>
<div  class="card" style="width: 18rem;text-align:center;">
  <img style="width:100%;" src="https://www.pngrepo.com/download/283595/profits-analytics.png" class="card-img-top" alt="...">
  <div style="text-align:center;" class="card-body">
    <h3 class="card-title">Sales Count</h3>
    <h1 class="card-text"><%= data.getSales() %></h1>
    
  </div>
</div>
</center>
</div>
<div style="border:2px solid gold;" class="col-md-3">
<center>
<div class="card" style="width: 18rem;">
  <img style="width:100%;" src="https://www.pngrepo.com/download/283595/profits-analytics.png" class="card-img-top" alt="...">
  <div class="card-body">
    <h3 class="card-title">Stock Count</h3>
    <h1 class="card-text"><%= data.getStock() %></h1>
   
  </div>
</div>
</center>
</div>
<div style="border:2px solid gold;" class="col-md-3">
<center>
<div class="card" style="width: 18rem;">
  <img style="width:100%;" src="https://www.pngrepo.com/download/283595/profits-analytics.png" class="card-img-top" alt="...">
  <div class="card-body">
    <h3 class="card-title">Supplier Count</h3>
    <h1 class="card-text"><%= data.getSupplier() %></h1>
   
  </div>
</div>
</center>
</div>
</div>
</div>
<%} %>
</body>
</html>