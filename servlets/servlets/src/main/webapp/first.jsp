<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%!String name = "TechnoElevate";
	Long number = 987987l;%>
	<% String data =(String) request.getAttribute("myData"); %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>
		 <%= data %>
		<br>
	 	<%= request.getMethod() %>
	 	<br>
	 	<%= request.getRequestURL() %>
	 </h1>
	
	<% for(int i =0 ; i< 5;i++){ %>
		<h1>
		<%= i %>
	</h1>
		
	<% }%> 
	
	<%= name +" TE" %>
	<%= number %>
	
</body>
</html>