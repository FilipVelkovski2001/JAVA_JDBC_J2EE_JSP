package com.filip;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		PrintWriter out = res.getWriter();
		out.println("res is: "+ k);
		k = k * k;
		
		// Redirection method for passing a servlet inside a servlet
		// When we do this we are telling the client hey go to add and then add tells the client hey go to sq
		res.sendRedirect("sq?k="+k);
		
		// You can transfer data from one servlet to another servlet with the help of three concepts
		// Session, Cookies and the one we used right now URL Rewriting
		
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
		
	}
}
