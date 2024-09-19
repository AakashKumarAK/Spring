<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form:form modalAttribute="user" achtion="register" method="post">
    <form:lable path="name">Name</form:lable>
    <form:input path="name"/>
    <br>
    <form:lable path="email">Email</form:lable>
    <form:input path="email"/>
    <br>
    <form:lable path="password">Password</form:lable>
    <form:input path="password"/>
    <br>
    <form:lable path="phone">Phone Number</form:lable>
    <form:input path="phone"/>
    <br>
    <form:button>Register</form:button>
   </form:form>
</body>
</html>