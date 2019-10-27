<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<script src="libs/js/typer.min.js"></script>
</head>
<body>
<jsp:include page="WEB-INF/views/header.jsp"></jsp:include>
<div class="container">
<div class="row">
<center>
<h1 id="example">
</h1>
</center>
<script>
$("#example").typer({
	  strings: [
	    "Welcome to Toyota Parts",
	    "We Serve you with love",
	    "TOYOTA"
	  ]
	});
</script>
<div class="col-md-4">

</div>
<div class="col-md-4">

</div>
<div class="col-md-4">

</div>



</div>

</div>

</body>
<style>
#example{
position:absolute;
top:40%;
left:10%;
font-size:80px;
color:white;
}
body{
background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(82,82,221,1) 34%, rgba(0,212,255,1) 100%);
}
</style>
</html>