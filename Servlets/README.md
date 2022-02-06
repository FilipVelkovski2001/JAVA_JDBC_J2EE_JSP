# Introduction to Java Servlets

Today we all are aware of the need of creating dynamic web pages i.e the ones which have the capability to change the site contents according to the time or are able to generate the contents according to the request received by the client. If you like coding in Java, then you will be happy to know that using Java there also exists a way to generate dynamic web pages and that way is Java Servlet. But before we move forward with our topic let’s first understand the need for server-side extensions. 

Servlets are the Java programs that run on the Java-enabled web server or application server. They are used to handle the request obtained from the webserver, process the request, produce the response, then send a response back to the webserver. 

Properties of Servlets are as follows:

Servlets work on the server-side.
Servlets are capable of handling complex requests obtained from the webserver.
Servlet Architecture is can be depicted from the image itself as provided below as follows:  

![](https://media.geeksforgeeks.org/wp-content/uploads/Untitled-Diagram-14-300x225.png)

Execution of Servlets basically involves six basic steps: 

The clients send the request to the webserver.
The web server receives the request.
The web server passes the request to the corresponding servlet.
The servlet processes the request and generates the response in the form of output.
The servlet sends the response back to the webserver.
The web server sends the response back to the client and the client browser displays it on the screen.
Now let us do discuss eccentric point that why do we need For Server-Side extensions?

The server-side extensions are nothing but the technologies that are used to create dynamic Web pages. Actually, to provide the facility of dynamic Web pages, Web pages need a container or Web server. To meet this requirement, independent Web server providers offer some proprietary solutions in the form of APIs(Application Programming Interface). 
These APIs allow us to build programs that can run with a Web server. In this case, Java Servlet is also one of the component APIs of Java Platform Enterprise Edition which sets standards for creating dynamic Web applications in Java. 

Before learning about something, it’s important to know the need for that something, it’s not like that this is the only technology available for creating dynamic Web pages. The Servlet technology is similar to other Web server extensions such as Common Gateway Interface(CGI) scripts and Hypertext Preprocessor (PHP). However, Java Servlets are more acceptable since they solve the limitations of CGI such as low performance and low degree scalability.  

What is CGI?

CGI is actually an external application that is written by using any of the programming languages like C or C++ and this is responsible for processing client requests and generating dynamic content. 
In CGI application, when a client makes a request to access dynamic Web pages, the Web server performs the following operations :  

It first locates the requested web page i.e the required CGI application using URL.
It then creates a new process to service the client’s request.
Invokes the CGI application within the process and passes the request information to the application.
Collects the response from the CGI application.
Destroys the process, prepares the HTTP response, and sends it to the client.

![](https://media.geeksforgeeks.org/wp-content/uploads/Common-Gateway-Interface--300x225.jpg)

So, in CGI server has to create and destroy the process for every request. It’s easy to understand that this approach is applicable for handling few clients but as the number of clients increases, the workload on the server increases and so the time is taken to process requests increases.  

Difference between Servlet and CGI

Servlet	CGI(Common Gateway Interface)
Servlets are portable and efficient.	CGI is not portable
In Servlets, sharing data is possible.	In CGI, sharing data is not possible.
Servlets can directly communicate with the webserver.	CGI cannot directly communicate with the webserver.
Servlets are less expensive than CGI.	CGI is more expensive than Servlets.
Servlets can handle the cookies.	CGI cannot handle the cookies.
Servlets API’s: 
Servlets are build from two packages: 

javax.servlet(Basic)
javax.servlet.http(Advance)
Various classes and interfaces present in these packages are: 

Component	        Type	        Package
Servlet	Interface	                javax.servlet.*
ServletRequest	        Interface	javax.servlet.*
ServletResponse	        Interface	javax.servlet.*
GenericServlet	        Class	        javax.servlet.*
HttpServlet	        Class	        javax.servlet.http.*
HttpServletRequest	Interface	javax.servlet.http.*
HttpServletResponse	Interface	javax.servlet.http.*
Filter	                Interface	javax.servlet.*
ServletConfig	        Interface	javax.servlet.*

Advantages of a Java Servlet 

Servlet is faster than CGI as it doesn’t involve the creation of a new process for every new request received.
Servlets, as written in Java, are platform-independent.
Removes the overhead of creating a new process for each request as Servlet doesn’t run in a separate process. There is only a single instance that handles all requests concurrently. This also saves the memory and allows a Servlet to easily manage the client state.
It is a server-side component, so Servlet inherits the security provided by the Web server.
The API designed for Java Servlet automatically acquires the advantages of the Java platforms such as platform-independent and portability. In addition, it obviously can use the wide range of APIs created on Java platforms such as JDBC to access the database.
The Servlet Container

Servlet container, also known as Servlet engine is an integrated set of objects that provide a run time environment for Java Servlet components. 

In simple words, it is a system that manages Java Servlet components on top of the Web server to handle the Web client requests. 

Services provided by the Servlet container : 

Network Services: Loads a Servlet class. The loading may be from a local file system, a remote file system or other network services. The Servlet container provides the network services over which the request and response are sent.
Decode and Encode MIME-based messages: Provides the service of decoding and encoding MIME-based messages.
Manage Servlet container: Manages the lifecycle of a Servlet.
Resource management Manages the static and dynamic resources, such as HTML files, Servlets, and JSP pages.
Security Service: Handles authorization and authentication of resource access.
Session Management: Maintains a session by appending a session ID to the URL path.