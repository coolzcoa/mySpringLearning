<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/> 
</head>
<body>
<H1></H1>
<div id ="wrapper">
<div id="header">
<h2>MY FIRST CRUD APP</h2>
</div>
</div>

<div id="container">
<div id="content">
<input type ="button" value="Add Gym" 
onclick="window.location.href='showFormForAdd';return false;"
class ="add-button"
/>



<table>
<tr>
<th>GYM NAME</th>
<th>ADRESS</th>
<th>Email</th>
</tr>
<c:forEach var ="tempCustomer" items="${gyms}">
<!-- construct an update link with gym id -->
<c:url var="updatelink" value="/gym/showFormForUpdate">
<c:param name="gymid" value="${tempCustomer.id}"/>
</c:url>
<c:url var="deletelink" value="/gym/deleteItem">
<c:param name= "gymid" value="${tempCustomer.id}"/>
</c:url>
  <tr>
  <td>${tempCustomer.gym_name}</td>
  <td>${tempCustomer.address}</td>
  <td>${tempCustomer.email}</td>
  <td><a href="${updatelink}"> Update  </a></td>
  <td><a href ="${deletelink}">delete</a></td>
  </tr>

</c:forEach>


</table>

</div>
</div>

</body>
</html>