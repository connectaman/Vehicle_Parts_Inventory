<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*, com.mytoyota.Stock.*" %>
<html>
<head>
<title> Stock</title>
<style>
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>

<link rel="stylesheet" href="libs/css/login.css">

<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="WEB-INF/views/header.jsp"></jsp:include>
<center>
<h1 style="color:blue;">Stock</h1>
</center>
</body>
</html>
<%
List<StockModel> list = (List<StockModel>) request.getAttribute("data");
for(StockModel stock:list){
%>
<div class="container">
  <form action="UpdateStock" method="POST">
  <div class="row">
    <div class="col-25">
      <label for="pid">Part id</label>
    </div>
    <div class="col-75">
      <input type="text" id="pid" name="partid" value="<%= stock.getPid() %>"  required>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="pname">Part Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="pname" name="partname" value="<%= stock.getPnname() %>" required>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="pprice">Part Price</label>
    </div>
    <div class="col-75">
      <input type="text" id="pprice" name="partprice" value="<%= stock.getPrice() %>" required>
    </div>
  </div>
 <div class="row">
    <div class="col-25">
      <label for="sqty">Quantity</label>
    </div>
    <div class="col-75">
      <input type="text" id="sqty" name="stockqty" value="<%= stock.getQuant() %>"  required>
    </div>
  </div>
   <div class="row">
    <div class="col-25">
      <label for="supid">Supplier id</label>
    </div>
    <div class="col-75">
      <input type="text" id="supid" name="supplierid" value="<%= stock.getSid() %>" required>
    </div>
  </div>
 
     <div class="row">
    <input type="submit" value="Update">
  </div>
  </form>
</div>
<%} %>
</body>
<style>
.container{
padding:30px;
}
</style>
</html>