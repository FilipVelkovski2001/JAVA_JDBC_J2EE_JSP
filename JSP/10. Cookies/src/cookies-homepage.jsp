<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>

<body>

<%
// the default if there are no cookies
String favLang = "Java";

// get the cookies from the browser request
Cookie[] theCookies = request.getCookies();

// find our favorite language cookie
if(theCookies != null){
	for(Cookie tempCookie : theCookies){
		
		if("myApp.favoriteLanguage".equals(tempCookie.getName()));{
			favLang = tempCookie.getValue();
		}
	}
}
%>

<h3> <%= favLang %> Training Portal </h3>

<!-- Now show a personalized page ... use the "favLang" variable -->

<h4>New books for <%= favLang %> </h4>

<ul>
<li> blah blah blah </li>
<li> blah blah blah </li>
<li> blah blah blah </li>
</ul>

<h4>Latest News Reports for <%= favLang %> </h4>

<ul>
<li> blah blah blah </li>
<li> blah blah blah </li>
<li> blah blah blah </li>
</ul>

<h4>Hot Jobs for <%= favLang %> </h4>

<ul>
<li> blah blah blah </li>
<li> blah blah blah </li>
<li> blah blah blah </li>
</ul>

<hr>

<a href = "cookies-personalize-form.html">Personalize this page!</a>

</body>

</html>