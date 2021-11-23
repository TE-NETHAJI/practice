<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./login.css">
<script type="text/javascript">
	function validate() {
		
		var username = document.getElementById("uname");
		var password = document.getElementById("psw");

		if ((username.value == "root") &&(password.value == "root")) {
			true;
		} else {
			false;
			alert("Invaid Crendentials");
		}
	}
</script>
</head>
<body>
	<h1>Welcome to EmployeeDatabase</h1>
	<h3>Admin Login</h3>
	<form action="./entrance.jsp" method="post"
		onsubmit="return validate()">
		<div class="imgcontainer"></div>
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
	</form>
</body>
</html>