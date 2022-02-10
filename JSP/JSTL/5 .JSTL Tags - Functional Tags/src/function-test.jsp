<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="data" value ="luv2Code" />

Lenght of string <b>${data}: </b>${fn:length(data)}
<br/><br/>

Uppercase version of the String <b>${data}:  </b>${fn:toUpperCase(data)}
<br/><br/>

Does the String<b>${data}</b> start with <b>luv</b>?: ${fn:startsWith(data, "luv")}

</body>
</html>