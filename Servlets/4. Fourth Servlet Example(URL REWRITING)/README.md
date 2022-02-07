# URL Rewriting using Java Servlet

Url rewriting is a process of appending or modifying any url structure while loading a page.

The request made by client is always a new request and the server can not identify whether the current request is send by a new client or the previous same client. Due to This property of HTTP protocol and Web Servers are called stateless. But many times we should know who is client in the processing request.
For example:
In any social networking site during login to till logout the server should know who is client so that server can manage all the request according to the user need.
This problem is solved by Session in Servlet.

Session : Session is a state between client and server and it contain multiple request and response between client and server. As we know that HTTP and Web Server both are stateless, the only way to maintain a session is when some unique information about the session (session id) is passed between server and client in every request and response.

Following are some ways by which we can provide unique id in request and response :

Session Interface in Servlet
Cookies Management
URL Rewriting
URL Rewriting

If your browser does not support cookies, URL rewriting provides you with another session tracking alternative. URL rewriting is a method in which the requested URL is modified to include a session ID. There are several ways to perform URL rewriting.

![](https://media.geeksforgeeks.org/wp-content/uploads/Screen-Shot-2018-08-10-at-11.30.32-AM.png)

Explanation(Follow the diagram)
When you deploy your project in eclipse the first page which is loaded in the HTML form whose form action is first servlet so the control will go to servlet1. In this case, we name servlet1 as FirstServlet where the username is printed. In FirstServlet we provide url where we transfer the control to servlet2 using url rewriting. In our case we name servlet2 as SecondServlet.
Advantage of URL Rewriting :

It doesn’t depend upon cookies and will work whether cookies are enabled or disabled
Extra form submission is not required on all pages
Disadvantage of URL Rewriting
It will work only with links ad can send only text