<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
</head>
<body>
<H1>LIST  OF  CHUTIYAS</H1>
<div id ="wrapper">
<div id="header">
<h2>CRM-MMANAGER</h2>
</div>
</div>

<div id="container">
<div id="content">

<table>
<tr>
<th>First name</th>
<th>Last name</th>
<th>Email</th>
</tr>
<c:forEach var ="tempCustomer" items="${gyms}">
  <tr>
  <td>${tempCustomer.gym_name}</td>
  <td>${tempCustomer.address}</td>
  <td>${tempCustomer.email}</td>
  </tr>

</c:forEach>


</table>

</div>
</div>

</body>
</html>