<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%
    // just create some sample data ... normally provided by MVC
    String[] cities = {"Mumbai", "Singapore", "Philadelphia"};

    pageContext.setAttribute("myCities", cities);
%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var = "tempCity" items = "${myCities}">
    ${tempCity} </br>
</c:forEach>
</body>
</html>