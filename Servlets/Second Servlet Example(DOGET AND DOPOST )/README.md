# J2EE — doGet vs doPost

Now our web application only says hello world on the page and that’s all it does. Boring. Let’s continue to add more functionality to it. How about let’s create a form that allows users to search for anything and the result will be shown in another page.
Let’s create a search.html inside /src/main/webapp. This html file is just showing a form that allows user to input any string and then click on submit to go to result page.

search.html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "/WebApplication/search">
	Search for anything<input type="text" name="item" />
	<input type="submit" />
	</form>
</body>
</html>

Inside <form> tag, notice we have action attribute. This basically tells the application where should we pass the data to. In this case, the application will pass to /WebApplication/search which then will be handled by a new servlet which we will be creating shortly. In the <input> tag, we declare that whatever the user types, will be stored as attribute “item”.
Let’s create a new servlet call SearchServlet.java to handle our search form. As usual we are going to extend class HttpServlet which has 2 methods we are interested to be implementing, which is doGet and doPost. Both handles http request of GET and POST respectively. Both methods are used to pass data from client back to server. The difference is the way the information is data pass.
GET vs POST
For GET method, data is passed back in the form of url, for example http://www.amazon.com/search?item=earphone. Hence is not a good idea to use GET method to pass login information such as username and password as these will be available in the url. GET request can be bookmarked and the request can be send again without the data being lost as it is stored in the url.
For POST method, data is passed inside the form data. Meaning it will be not be exposed in the url. Instead, if you inspect element > network while submiting a POST request, you should be able to see the data in the form data as shown below. This method is perfect for sending user login information. POST request cannot be bookmarked as the data will be lost from the form data.

![](https://miro.medium.com/max/2400/0*kiDEy9tq0HafF-57.png)

When should I use GET and POST?
GET request is typically used for operation without side effects such as read operation. POST request is used for side effects operation such as write/update.
Let’s update our SearchServlet to implement doGet and doPost method. To retrieve the data being passed from client, simply use request.getParameter(“name”)

SearchServlet.java
package com.davidcheah.webapplication.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("GET request received " + request.getParameter("item"));
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("POST request received " + request.getParameter("item"));
	}
}

Lets run the application. You should be able to see GET request printed with the search item. The html form by default uses GET method. To change it to POST method, add method=”POST” in the <form> tag.


search.html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "/WebApplication/search">
	Search for anything<input type="text" name="item" />
	<input type="submit" />
	</form>
</body>
</html>




