# The HttpSession Interface in Servlet

What is a session?

In web terminology, a session is simply the limited interval of time in which two systems communicate with each other. The two systems can share a client-server or a peer-to-peer relationship. However, in Http protocol, the state of the communication is not maintained. Hence, the web applications that work on http protocol use several different technologies that comprise Session Tracking, which means maintaining the state (data) of the user, in order to recognize him/her.

In order to achieve session tracking in servlets, cookies have been one of the most commonly used tech. However, they have the following disadvantages:

They can only keep textual information.
They’re browser dependent. Hence, if the client disables them, your web application can’t make use of them
Individual cookie can contain not more than 4kb of information
How to create sessions with a unique session id for each user in java servlet

For this, servlets provide an interface called ‘HttpSessionInterface’. The following diagram explains how Http Sessions work in servlets:

![](https://media.geeksforgeeks.org/wp-content/uploads/session.png)

          Method	                                        Description
public HttpSession getSession()	                Gets the HttpSession object. If the request doesn’t have a session associated with it, a new session is created
public HttpSession getSession(boolean create)	Gets the session associated with the request. If not already present, then a new one is created based on the value of the boolean argument passed into it
public String getId()	                        Returns the unique session id
public long getCreationTime()	                It returns the time when this session was created, measured in milliseconds since midnight January 1, 1970 GMT.
public long getLastAccessedTime()	        It returns the time when this session was last accessed, measured in milliseconds since midnight January 1, 1970 GMT.
public long getLastAccessedTime()	        It returns the time when this session was last accessed, measured in milliseconds since midnight January 1, 1970 GMT.
public void invalidate()	                Invalidates the session

Advantages of Http Sessions in Servlet

Any kind of object can be stored into a session, be it a text, database, dataset etc.
Usage of sessions is not dependent on the client’s browser.
Sessions are secure and transparent
Disadvantages of Http session

Performance overhead due to session object being stored on server
Overhead due to serialization and de-serialization of data