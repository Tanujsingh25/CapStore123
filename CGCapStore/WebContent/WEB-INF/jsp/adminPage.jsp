<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel ="stylesheet" href ="css/style.css" /> 
<title>Admin Page</title>
</head>
<body>
<h3 style="background-color: teal" class="header1" >Customers</h3>
<div align="center" class="personal1" >
	<table class="table" border="2" >
		<thead>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Id</th>
			<th>Contact No</th>
			<th>Address</th>
		</thead>
		<tbody>
			<j:forEach var="customer" items="${allCustomers}">
				<tr>
					<td>${customer.first_name}</td>
					<td>${customer.last_name}</td>
					<td>${customer.email}</td>
					<td>${customer.contact}</td>
					<td><j:forEach var="address" items="${customer.address}" >
					${address.address_line1} , ${address.area}, ${address.city}, ${address.country} <br>
					</j:forEach></td>
				</tr>
			</j:forEach>
		</tbody>
	</table>
	</div><br><br>
<h3 style="background-color: teal"  class="header1" >Third Party Merchant</h3>
<div align="center" class="personal1" >
	<table class="table" border="2" >
		<thead>
			<th>First Name</th>
			<th>Email Id</th>
			<th>Contact No</th>
			<th>Address</th>
		</thead>
		<tbody>
			<j:forEach var="thirdMerchant" items="${ThirdPartyMerchant}">
				<tr>
					<td>${thirdMerchant.merchant_name}</td>
					<td>${thirdMerchant.email}</td>
					<td>${thirdMerchant.contact}</td>
					<td>${thirdMerchant.address}</td> 
				</tr>
			</j:forEach>
		</tbody>
	</table>
	</div><br><br>
<h3 style="background-color: teal" class="header1" >In House Merchant</h3>
<div align="center" class="personal1" >
	<table class="table" border="2">
		<thead>
			<th>First Name</th>
			<th>Email Id</th>
			<th>Contact No</th>
			<th>Address</th>
		</thead>
		<tbody>
			<j:forEach var="inHouseMerchant" items="${inHouseMerchants}">
				<tr>
					<td>${inHouseMerchant.merchant_name}</td>
					<td>${inHouseMerchant.email}</td>
					<td>${inHouseMerchant.contact}</td>
					<td>${inHouseMerchant.address}</td> 
				</tr>
			</j:forEach>
		</tbody>
	</table>
	</div><br><br>
</body>
</html>