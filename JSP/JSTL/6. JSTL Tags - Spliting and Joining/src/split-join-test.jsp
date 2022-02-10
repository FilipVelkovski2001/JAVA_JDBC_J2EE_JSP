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
<c:set var ="data" value= "Singapore,Tokyo,Miami,London" />

<h3>Split Demo</h3>
<c:set var="citiesArray" value="${fn:split(data, ',') }" />

<c:forEach var = "tempCity" items = "${citiesArray}">

${tempCity} </br>

</c:forEach>


<h3>Join Demo</h3>

<c:set var = "fun" value = "${fn:join(citiesArray, '*')}"/>

Result of joining: ${fun}
</body>
</html>