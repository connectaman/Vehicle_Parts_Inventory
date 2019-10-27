<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title> Login and Registration Page</title>
<link rel="stylesheet" href="libs/css/login.css">
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="UserRegister.jsp">Toyota Parts</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="UserRegister.jsp">Home</a></li>
      <li><a href="admin.jsp">Admin Login</a></li>
      <li><a href="#">Link</a></li>
    </ul>
    
  </div>
</nav>


</body>
</html>

<body>
	
<div class="login-page">
<div class="form">
	<form action="UserRegister" method="POST" class="register-form" required>
	<input type="text" name="name" placeholder="Name" required/>
 	<input type="email" name="username" placeholder="Email" required/>
 	<input type="password" name="password" placeholder="Password" required/>
 	<input type="password" name="cpassword" placeholder="Confirm Password" required/>
 	<input type="tel" name="phonenumber" placeholder="Phone Number" required/>
 	<input type="text" name="city" placeholder="City" required/>
	<input class="btn btn-primary" type="submit" value="Create"> 
<p class="message">Already Registered? <a href="#">Login</a></p>
</form>
 
 <form class="login-form">
 	<input type="email" name="email" placeholder="Email"/>
 		<input type="password" name="password" placeholder="Password"/>
 		<BUTTON>Login</BUTTON>
<p class="message">Not Registered? <a href="#">Register</a></p>
</form>
</div>
</div>
<script src='https://code.jquery.com/jquery-3.4.1.min.js'></script>

<script>
	$('.message a').click(function(){
	$('form').animate({height: "toggle", opacity: "toggle"}, "slow");
	});
</script>
<style>

body{
background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(13,13,47,1) 34%, rgba(0,212,255,1) 100%);
}

</style>
</body>
</html>