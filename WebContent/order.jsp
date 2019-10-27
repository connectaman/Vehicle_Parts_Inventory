<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title> Order(Billing)</title>
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
<h1 style="color:blue;">Order(Billing)</h1>
</center>

</body>
</html>

<body>
<div class="container">
  <form action="PlaceOrder" method="POST">
  <div class="row">
    <div class="col-25">
      <label for="oid">Order id</label>
    </div>
    <div class="col-75">
      <input type="text" id="oid" name="orderid" placeholder="Order Id is auto generated" disabled>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="cid">Customer id</label>
    </div>
    <div class="col-75">
      <input type="text" id="cid" name="customerid" placeholder="Enter Customer id" required>
    </div>
  </div>
  
 <div class="row">
    <div class="col-25">
      <label for="pqty">Quantity</label>
    </div>
    <div class="col-75">
      <input type="text" id="pqty" name="partqty" placeholder="Enter the Quantity" required>
    </div>
  </div>
     <div class="row">
    <div class="col-25">
      <label for="pid">Part id</label>
    </div>
    <div class="col-75">
      <input type="text" id="pid" name="partid" placeholder="Enter the Part id" required>
    </div>
  </div>
     <div class="row">
    <input type="submit" value="Purchase">
  </div>
  </form>
</div>

</body>
<style>
.container{
padding:30px;
}
</style>
</html>