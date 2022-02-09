<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<% // Read From Data
String favLang = request.getParameter("favoriteLanguage");

// Create the cookie
Cookie theCookie = new Cookie("MyApp.favoriteLanguage", favLang);

// Set the life span ... total number of seconds (yuk!)
theCookie.setMaxAge(60 * 60 * 24 * 365); // <- for one year!

// Send cookie to browser
response.addCookie(theCookie);
		
%>

<meta charset="ISO-8859-1">
<title>Cookies Response</title>
</head>

<body>

<h4 align = "center">Personalization confirmation</h4>

<p>Thanks! We set your favorite Language to: ${param.favoriteLanguage}</p>

<br/> <br/>

<a href = "cookies-homepage.jsp"> Return to homepage </a> 

</body>
</html>