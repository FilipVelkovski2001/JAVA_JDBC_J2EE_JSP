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
		
		// When we want to transfer data from one servlet to another we use the concept called Session Managment
		req.setAttribute("k", k);
		
		//We need to use a Req Dispatcher or Redirect to pass SqServlet to AddServlet
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
	}
}
