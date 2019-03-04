<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
	<table>
		<thead>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Email Id</td>
			<td>Contact No</td>
			<td>Address</td>
		</thead>
		<tbody>
			<j:forEach var="customer" items="${allCustomers}">
				<tr>
					<td>${customer.first_name}</td>
					<td>${customer.last_name}</td>
					<td>${customer.email}</td>
					<td>${customer.contact}</td>
					<td><j:forEach var="address" items="${customer.address}" >
					${address.address_line1} , ${address.area}, ${address.city}, ${address.country}
					</j:forEach></td> 
				</tr>
			</j:forEach>
		</tbody>
	</table><br>
	<table>
		<thead>
			<td>First Name</td>
			<td>Email Id</td>
			<td>Contact No</td>
			<td>Address</td>
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
    
    </div>
    </div>
</body>
</html>