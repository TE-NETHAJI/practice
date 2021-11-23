<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updating Records</title>

</head>
<body>
    <h1>Updating</h1>
	<form action="./update" method="post">
		<fieldset>
			<legend>update</legend>
			<div>
			<label>Enter Employee ID <br>Details to be Updated :</label>
			<input type ="number" id="enterid" required> 
			</div>
			<br>
			<div>
				<label for="name">Name : </label> <input type="text" name="name" 
					id="name"  />
			</div>
			<br>
			<div>
				<label for="id">EmpId : </label> <input type="number" name="id"
					id="id"  />
			</div>
			<br>
			<div>
				<label for="dob">DOB : </label> <input type="date" name="dob" 
					id="dob" />
			</div>
			<br>
			<div>
				<label for="role">Role : </label> <input type="text" name="role" 
					id="role"  />
			</div>
			<br>
			<div>
				<label for="gender">Gender : </label> <input type="text" name="gen" 
					id="gen"  />
			</div>
			<br>

			<div>
				<label for="tel">Mobile</label> <input type="tel" name="tel"  maxlength ="10" 
					id="tel" />
			</div>
			<br>
			<div>
				<label for="salary">Salary</label> <input type="number" name="sal"  
					id="sal" />
			</div>
			<br>
			<div>
				<label for="mail">Email</label> <input type="email" name="mail"
					id="mail"  />
			</div>
			<br>
			<div>
				<label for="blood_group">Blood Group: </label> <input type="text" 
					name="bg" id="bg"  />
			</div>
			<br>
			<div>
				<input type="reset" value="Reset" /> <input type="submit"
					value="Register" />
			</div>
			<br>
		</fieldset>
	</form>
</body>
</html>