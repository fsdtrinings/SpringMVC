<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	
 	Index Page
 	
 	<form method="get" action="userform">
 		Enter Username <input type="text" name="username"><br/>
 		<input type="submit">
 	</form>
 	
 	<a href="accounts/showAccountsForm">Accounts Submission Form</a>
 	
</body>
</html>