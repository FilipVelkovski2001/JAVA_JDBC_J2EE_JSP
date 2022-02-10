<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <c:set var= "stuff" value="<%= new Date() %>" />
Time on the server is: ${stuff}

</body>
</html>