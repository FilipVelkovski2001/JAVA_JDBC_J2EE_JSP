package com.filip;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// When we pass k from AddServlet we need to cast the object to int
		int k = (int) req.getAttribute("k");
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Result of square root is: "+ k);
		
		
		}//To connect the sq servlet with the add servlet we need to RequestDispatcher or Redirect
		//Then we have to modify the web.xml file to use that servlet:
		
		/*
		 * <servlet>
      <servlet-name>square</servlet-name>
      <servlet-class>com.filip.SqServlet</servlet-class>
  </servlet>
  
  
  <servlet-mapping>
      <servlet-name>square</servlet-name>
      <url-pattern>/sq</url-pattern>
  </servlet-mapping>
		 */
}
