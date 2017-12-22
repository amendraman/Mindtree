package com.gdg.rocky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "a simple servlet", urlPatterns = { "/AdvancedServletPath" })    // urlPatterns tells the servlet how to map
																						// with accessing /SimpleServletpath on server u can run this app
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Hello from doGet() method");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hellos I have shown it in web page</h1>");
	}*/
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		if(userName != "" && userName != null)
		{
			session.setAttribute("saveUserName", userName);
		}
		
		writer.println("request parameter has userName as "+ userName);
		writer.println("session parameter has username as " + (String)session.getAttribute("savedUserName"));
	}

}
