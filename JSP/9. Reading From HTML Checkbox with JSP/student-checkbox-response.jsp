<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>

<h2 align = "center">Student Confirmation Page</h2>

 The Student is confirmed: ${param.firstname} ${param.lastname}
 
<br/><br/>

The student's country: ${param.country} 

<br/><br/>

<!--  Deisplay list of "favoritelanguage"  -->


The student's favorite programming language:  
<ul>

<%

String[] langs = request.getParameterValues("favoritelanguage");

for(String lang : langs){
	out.println("<li>"+ lang +"</li>" );
}

%>

</ul>

</body>
</html>