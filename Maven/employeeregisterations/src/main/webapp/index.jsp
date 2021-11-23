
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="com.te.employeeregisterations.model.EmployeeBean"%>
<%@page import="javax.persistence.Query"%>
<%@page import="com.te.employeeregisterations.dao.EntityClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying EMP</title>
<link rel="stylesheet"
	href="/employeeregisterations/src/main/webapp/bootstrap-5.1.3-dist/css/bootstrap.css">
<link rel="stylesheet"
	href="/employeeregisterations/src/main/webapp/bootstrap-5.1.3-dist/css/bootstrap.min.css">
</head>
<body>
	<div class="col-sm-8">
		<div class="panel-body">
			<form action="#" method="get">
				<table id="emptable" class="table table-responsive table-bordered "
					border="1">
					<thead>
						<tr>
							<th>Name</th>
							<th>ID</th>
							<th>DOB</th>
							<th>Role</th>
							<th>Gender</th>
							<th>Mobile</th>
							<th>Salary</th>
							<th>Email</th>
							<th>Blood-Group</th>
							<th>Edit</th>
							<th>Delete</th>

						</tr>
					</thead>
					<%
					Connection con;
					PreparedStatement pst;
					ResultSet rs;

					Class.forName("com.mysql.jdbc.Driver");
					String url ="jdbc:mysql://localhost:3306/employeedatabase";
					con = DriverManager.getConnection(url, "root", "root");

					String qr = "select * from emp_info";
					Statement st = con.createStatement();
					rs = st.executeQuery(qr);

					while (rs.next()) {

						String id = rs.getString("id");
					%>
					<tbody>
						<tr>
							<td><%=rs.getString("name")%></td>
							<td><%=rs.getString("id")%></td>
							<td><%=rs.getString("dob")%></td>
							<td><%=rs.getString("role")%></td>
							<td><%=rs.getString("gender")%></td>
							<td><%=rs.getString("mobileNo")%></td>
							<td><%=rs.getString("salary")%></td>
							<td><%=rs.getString("email")%></td>
							<td><%=rs.getString("blood_group")%></td>
							<td><a href="updateindex.jsp?id=<%= id %>">Edit</a></td>
							<td><a href="deleteindex.jsp?id=<%= id %>">Delete</a></td>
							
						</tr>
					</tbody>
					<%
						}
					%>

				</table>
			</form>
			<div>
				<p>
					<a href="./entrance.jsp">Go Home</a>
				</p>
			</div>

		</div>
	</div>
</body>
</html>