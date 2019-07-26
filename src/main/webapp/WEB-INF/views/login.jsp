<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}

.footer .container {
width: auto;
max-width: 680px;
padding: 0 15px;
}
</style>
</head>
<body>
<nav role="navigation" class="navbar navbar-default">

		<div class="">
			<a href="/" class="navbar-brand">Brand</a>
		</div>

		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/list-todo.do">Todos</a></li>				
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/login.do">Login</a></li>
			</ul>
		</div>

	</nav>
	<div class="container">
<h2>I love Java server pages and servlets</h2>
<h3>${nameforjsp}</h3>
<form action="/login.do" method="post">
Enter your name
<input type="text" name="name"/>
Enter your password
<input type="password" name="password"/>
<input type="submit"/>
<p><font color="red"> ${errorMessage}</font></p>
</form>
</div>
	<footer class="footer">
		<div class="container">
			<p>footer content</p>
		</div>
	</footer>
<script src="webjars/jquery/3.4.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>