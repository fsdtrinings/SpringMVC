<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form  method="post" action="readAccounts">
		Account Name <input type="text" name="name"><br/>
		Account Balance <input type="text" name="balance"><br/>
		Registered Email ID <input type="text" name="email"><br/>
		<input type="submit">
	</form>
	<hr/>
	
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
	<spring:form action="processAccountsInfo" method="post" modelAttribute="accountsAttribute">
		Enter Account's Holder Name <spring:input path="name"/>
		<spring:errors path="name" cssClass="color:red"/> <br/>
		
		Enter Account's Balance <spring:input path="balance"/>
		<spring:errors path="balance" cssClass="color:red"/><br/>
		
		Enter Account's Holder Email Address <spring:input path="email"/>
		<spring:errors path="email" cssClass="color:red"/><br/>
		
		<input type="submit">
	</spring:form>
	
</body>
</html>