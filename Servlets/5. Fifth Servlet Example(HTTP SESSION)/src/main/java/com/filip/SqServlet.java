package com.filip;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	    	
		HttpSession session = req.getSession();
		
		
		
	    int k = (int) session.getAttribute("k");
		
	    k = k * k;
	   
		// session.removeAttribute("k"); - Used to get rid of the session
	    
	    PrintWriter out = res.getWriter();
	    out.println("Result of square root is: "+ k);
		System.out.println("sq called");
		
		}
}
