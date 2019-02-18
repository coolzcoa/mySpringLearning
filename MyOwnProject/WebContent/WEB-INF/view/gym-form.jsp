<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GYM FORM</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>
<body>
<h1>Customer added</h1>
<div id="wrapper">
<div id="header">
<h2>GOLDS GYM</h2>
</div>
</div>
<div id="container">
 <form:form action="saveGym" modelAttribute="gym" method="POST">
<form:hidden path="id"/>
<TABLE>
 <tbody>
 <tr>
 <td><label>Gym Name:</label></td>
 <td><form:input path="gym_name"/></td>
 </tr>
 <tr>
 <td><label>Address:</label></td>
 <td><form:input path="address"/></td>
 </tr>
 <tr>
 <td><label>Email:</label></td>
 <td><form:input path="email"/></td>
 </tr>
 <tr><td><label></label></td>
 <td><input type="submit" value="save" class="save"></td>
 </tr>
 </tbody>
 </TABLE>
 <div style="clear;both;"></div>
 <p>
 <a href="${pageContext.request.contextPath}/gym/list">GO BACKK</a> 
 </p>
 
 </form:form>
</div>
</body>
</html>