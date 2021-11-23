
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<%-- <%@page import="java.util.Date"%> --%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	if (request.getParameter("submit") != null) {
    int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	/* Date date =null;
	date = new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("dob")); */
	String role = request.getParameter("role");
	String gender = request.getParameter("gender");
	Long mobo = Long.parseLong(request.getParameter("tel"));
	Double salary = Double.parseDouble(request.getParameter("sal"));
	String email = request.getParameter("mail");
	String bg = request.getParameter("bg");

	Connection con =null;
	PreparedStatement pst=null;

	Class.forName("com.mysql.jdbc.Driver").newInstance();
	String url = "jdbc:mysql://localhost:3306/employeedatabase";
	con = DriverManager.getConnection(url, "root", "root");
   
	
	String qr = "UPDATE emp_info SET name =?, id=?,role=?,gender=?"
	+"mobileNo=?,salary=?,email=?,blood_group=? WHERE id=?";
	pst = con.prepareStatement(qr);
    pst.setString(1, name);
    pst.setInt(2, id);
	pst.setString(3, role);
	pst.setString(4, gender);
	pst.setString(5, "mobo");
	pst.setDouble(6, salary);
	pst.setString(7, email);
	pst.setString(8, bg); 
	pst.setInt(9, id); 
	pst.executeQuery();
	
	
	
	
%>

<script>
	alert("Records updated")
</script>

<%
	}

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update EMP</title>
</head>
<body>
	<h1>Update Employee Records</h1>
	<div>
		<form action="#" method="post">
			<%
			
			Connection con;
			PreparedStatement pst;
			ResultSet rs;

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeedatabase";
			con = DriverManager.getConnection(url, "root", "root");

			String id = request.getParameter("id");

			pst = con.prepareStatement("select * from emp_info where id= ?");
			pst.setString(1, id);
			rs = pst.executeQuery();

			while (rs.next())

			{
			%>

			<div>
				<label for="name">Name : </label> <input type="text" name="name"
					id="name" placeholder="Enter your Name"
					value="<%=rs.getString("name")%>" />
			</div>
			<br>
		     	<div>
				<label for="id">EmpId : </label> <input type="number" name="id"
					id="id" placeholder="Enter your EmpId"
					value="<%=rs.getString("id")%>" />
			</div>
			<br>
			<div>
				<label for="dob">DOB : </label> <input type="date" name="dob"
					required id="dob" placeholder="DOB"
					value="<%=rs.getString("dob")%>" />
			</div>
			<br>
			<div>
				<label for="role">Role : </label> <input type="text" name="role"
					id="role" placeholder="Enter your role"
					value="<%=rs.getString("role")%>" />
			</div>
			<br>
			<div>
				<label for="gender">Gender : </label> <input type="text" name="gen"
					id="gen" placeholder="Enter your gender"
					value="<%=rs.getString("gender")%>" />
			</div>
			<br>

			<div>
				<label for="tel">Mobile</label> <input type="tel" name="tel"
					maxlength="10" id="tel" value="<%=rs.getString("mobileNo")%>" />
			</div>
			<br>
			<div>
				<label for="salary">Salary</label> <input type="number" name="sal"
					id="sal" placeholder="salary" value="<%=rs.getString("salary")%>" />
			</div>
			<br>
			<div>
				<label for="mail">Email</label> <input type="email" name="mail"
					id="mail" placeholder="@exmaple.com"
					value="<%=rs.getString("email")%>" />
			</div>
			<br>
			<div>
				<label for="blood_group">Blood Group: </label> <input type="text"
					name="bg" id="bg" placeholder="Enter your blood group"
					value="<%=rs.getString("blood_group")%>" />
			</div>

			<%
				}
			%>
			<br>


			<div>
				<input type="reset" value="Reset" /> <input type="submit"
					name="submit" value="submit" />
			</div>

			<br>
			<div>
				<p>
					<a href="./entrance.jsp">Go Home</a>
				</p>
			</div>

		</form>
	</div>
</body>
</html>