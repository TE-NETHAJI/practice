<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registering New Record</title>

</head>
<body>
    <h1>Welcome To Employee Database</h1>
	<form action="./register" method="post">
		<fieldset>
			<legend>RegiterForm</legend>
			<br>
			<div>
				<label for="name">Name : </label> <input type="text" name="name" required 
					id="name" placeholder="Enter your Name" />
			</div>
			<br>
			<div>
				<label for="id">EmpId : </label> <input type="number" name="id" required
					id="id" placeholder="Enter your EmpId" />
			</div>
			<br>
			<div>
				<label for="dob">DOB : </label> <input type="date" name="dob" required
					id="dob" placeholder="DOB" />
			</div>
			<br>
			<div>
				<label for="role">Role : </label> <input type="text" name="role" required
					id="role" placeholder="Enter your role" />
			</div>
			<br>
			<div>
				<label for="gender">Gender : </label> <input type="text" name="gen" required
					id="gen" placeholder="Enter your gender" />
			</div>
			<br>

			<div>
				<label for="tel">Mobile</label> <input type="tel" name="tel" required   maxlength ="10" 
					id="tel" placeholder="Enter your Mobile" />
			</div>
			<br>
			<div>
				<label for="salary">Salary</label> <input type="number" name="sal" required 
					id="sal" placeholder ="salary"/>
			</div>
			<br>
			<div>
				<label for="mail">Email</label> <input type="email" name="mail" required
					id="mail" placeholder="@exmaple.com" />
			</div>
			<br>
			<div>
				<label for="blood_group">Blood Group: </label> <input type="text" required
					name="bg" id="bg" placeholder="Enter your blood group" />
			</div>
			<br>
			<div>
				<input type="reset" value="Reset" /> <input type="submit"
					value="Register" />
			</div>
			<br>
		</fieldset>
	</form>
	       <div>
				<p>
					<a href="./entrance.jsp">Go Home</a>
				</p>
			</div>
</body>
</html>