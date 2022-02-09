<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Step 1: Create HTML Form -->
    
 <form action ="todo-demo.jsp">
     <p>Add new item</p><input type = "text" name = "theItem" />
     
     <input type = "submit" value = "Submit" /> 	
 </form>
 
 </br>
  <!-- Reading the form field and printing the information with the request.getParameter method -->
 <p>Item entered: <%= request.getParameter("theItem") %> </p>
 
 <! -- Step 2: Add new item to To-Do List -->
 
 <%
 
 // get the to-do items from the session
 List<String> items = (List<String>) session.getAttribute("myToDoList"); // -> Name of session "myToDoList"
 
 // if the to-do items doesn't exist, then create a new one
 if(items == null){
	 items = new ArrayList<String>();
	 session.setAttribute("myToDoList", items);
 }
 
 // see if there is any form data that needs to be added
 String theItem = request.getParameter("theItem"); // We are getting the parameter from the form field "theItem"
 if(theItem != null){
	 items.add(theItem);
 }
 
 %>
  <! --    Step 3: Display all To-Do Items from the Sesion -->
  <hr>
  <b>To Do List Items:</b> <br/>
  
  <!-- First we create a ordered list which is going to display our items in order --> 
  <ol>
  <%
  // Then we are going to loop through the array list so we can pass the items from the to do list to the html doc as a <li> element
   for(String list : items){
	   out.println("<li>" + list + "</li>");
   }
  %>
  </ol>
  
  
</body>
</html>