<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logging</title>
<link rel="stylesheet" href="/carazoo/src/main/webapp/WEB-INF/Zviews/logininfo/adminLogin.css">
</head>
<body>
	<h1>Welcome to Carazoo Web App</h1>
	<h3>Admin Login</h3>
	<form action="./adminlogin" method="post">
		<div class="imgcontainer">
			<div class="container">
				<label for="uname"><b>Username</b></label> <input type="text"
					placeholder="Enter Username" id="uname" name="uname" required>

				<label for="psw"><b>Password</b></label> <input type="password"
					placeholder="Enter Password" id="psw" name="psw" required>

				<button type="submit">Login</button>

			</div>
			<div class="container" style="background-color: #f1f1f1">
				<button type="reset" class="reset">reset</button>
			</div>
		</div>
	</form>
</body>
</html>