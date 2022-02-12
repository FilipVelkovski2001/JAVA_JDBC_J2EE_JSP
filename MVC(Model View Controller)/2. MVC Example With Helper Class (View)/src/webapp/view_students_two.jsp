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
<h2 align="center"> Student Table </h2>
<hr>
<br/>
 <table border = "1" align="center">
 
 <tr>
    <th> First Name </th> 
    <th> Last Name </th> 
    <th> E-mail </th> 
 </tr>
 
   <c:forEach var = "tempStudent" items="${student_list}">
    
    <tr>
      <td> ${tempStudent.firstName} </td>  
       <td> ${tempStudent.lastName} </td> 
        <td> ${tempStudent.email} </td> 
    </tr>
    
  </c:forEach>

 
 </table>
  
</body>
</html>