<%@page import="java.sql.*"%>
<%
	
	
	String id = request.getParameter("id");
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/employeedatabase";
	con = DriverManager.getConnection(url, "root", "root");

	String qr = "delete from emp_info where id = ?";
	pst = con.prepareStatement(qr);

	pst.setString(1, id);
	pst.executeUpdate();

%>
   <script>
   
   alert("Record Deleted sucessfully")
   </script>
   
   <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
     <div>
				<p>
					<a href="./entrance.jsp">Go Home</a>
				</p>
			</div>
</body>
</html>
   