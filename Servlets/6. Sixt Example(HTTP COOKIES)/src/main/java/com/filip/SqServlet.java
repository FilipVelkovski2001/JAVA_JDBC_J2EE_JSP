package com.filip;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	   
		int k = 0;
		javax.servlet.http.Cookie[] cookies = req.getCookies();
		
		for(javax.servlet.http.Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		
	    k = k * k;
	   
		// session.removeAttribute("k"); - Used to get rid of the session
	    
	    PrintWriter out = res.getWriter();
	    out.println("Result of square root is: "+ k);
		
		
		}
}
