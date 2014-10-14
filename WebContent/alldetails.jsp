<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="bean.GetAll"%>
<%@page import="java.sql.ResultSet"%><html>
<head>
<%@page import="java.util.ArrayList"%>

<%@page import="bean.EmployeeBean"%>
<%@page import="java.util.Iterator"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">

<tr>
  <th>ID</th> <th>Name</th> <th>Dept</th><th>Basic</th><th>HRA</th> <th>DA</th><th>PF</th></tr>
<%ResultSet rs= GetAll.getEmp();
if(rs==null)
	response.sendRedirect("empty.jsp");


	while(rs.next()) {

%>

<tr>
  <th><%=rs.getString(1) %></th><th><%=rs.getString(2)%></th><th><%=rs.getString(3) %></th>
<th><%=rs.getString(5) %></th><th><%=rs.getString(4) %></th>
<th><%=rs.getString(6) %></th><th><%=rs.getString(7)%></th></tr>

<%} %>
</table>
</body>
</html>