package com.filip;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Whenever anyone sends a request for add just call this servlet
// We specify the URL path
//@WebServlet("/add")
public class AddServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		PrintWriter out = res.getWriter();
		// In this way we can put html tags on our servlet and make some css styles
		// But it's not flexible
		// The better way to do it is withb JSP(Java Server Pages)
		//out.println("<html><body bgcolor ='cyan'>");
		//out.println("res is: "+ k);
		//out.println("</body></html>");
		
		
	}
}
