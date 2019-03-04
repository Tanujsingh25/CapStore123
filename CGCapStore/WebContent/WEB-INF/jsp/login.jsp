<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<f:form action="displayAdmin.obj" method="post" modelAttribute="user" >
		<f:input path="email" placeholder="email" />
		<f:input path="password" placeholder="password"/>
		<input type="submit" value="login" >
	</f:form>
	<!-- <a href="displayLoginPage.obj" >Admin</a>	 -->
</body>
</html>