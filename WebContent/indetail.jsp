<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.ArrayList"%>

<%@page import="bean.EmployeeBean"%>
<%@page import="java.util.Iterator"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function setvalue() {
	det.gross.value= parseInt(det.basic.value)+parseInt(det.hra.value)+parseInt(det.da.value);
	det.deduc.value= parseInt(det.gross.value)/10;
	det.np.value=parseInt(det.gross.value)-parseInt(det.deduc.value);
}
</script>
</head>
<body onload="setvalue()">
<%ArrayList<EmployeeBean> newal = (ArrayList<EmployeeBean>)request.getAttribute("ale");
System.out.println(newal.size());
	Iterator<EmployeeBean> itr= newal.iterator();
	while(itr.hasNext()) {
		EmployeeBean eb = itr.next();
%>
<form name="det" action="UpdateAll">
<table>

<tr>
  <th>ID</th>
  <th><input type="text" name="id1" value=<%=eb.getId() %>></th>
</tr>
<tr>
  <th>Name</th>
  <th><input type="text" value=<%=eb.getName() %>></th>
</tr>
<tr>
  <th>Dept</th>
  <th><input type="text" value=<%=eb.getDept() %>></th>
</tr>
<tr>
  <th>Basic</th>
  <th><input type="text" name ="basic" value=<%=eb.getBasic() %>></th>
</tr>
<tr>
  <th>Hra</th>
  <th><input type="text" name="hra" value=<%=eb.getHra() %>></th>
</tr>
<tr>
  <th>DA</th>
  <th><input type="text"  name="da" value=<%=eb.getDa() %>></th>
</tr>
<tr>
  <th>Gross</th>
  <th><input type="text" name="gross" ></th>
</tr>
<tr>
  <th>Deduction</th>
  <th><input type="text" name="deduc"></th>
</tr>
<tr>
  <th>NetPay</th>
  <th><input type="text" name="np"></th>
</tr>
<tr><th><input type="submit" value="update"></th></tr>
<%break;} %>
</table>

</form>
</body>
</html>