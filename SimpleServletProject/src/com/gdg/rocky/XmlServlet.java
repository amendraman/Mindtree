package com.gdg.rocky;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet
{
	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//System.out.println("Xml servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// out.println("Hello text");
		String userName = request.getParameter("userName");
		//String userId = request.getParameter("userId");
		out.println("Hello=" + userName);
		out.println("Hello from GET");
	}*/
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//System.out.println("Xml servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// out.println("Hello text");
		String userName = request.getParameter("userName");
		//String userId = request.getParameter("userId");
		out.println("Hello=" + userName);
		out.println("Hello from GET");
	}
	
/*	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//System.out.println("Xml servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// out.println("Hello text");
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		//String userId = request.getParameter("userId");
		out.println("Hello=" + userName + " your full name is " + fullName);
		out.println("Hello from POST");
	}*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");	
		String fullName = request.getParameter("fullName");	
		out.println("Hello from POST method " + userName + " ! your fullname is " + fullName);
		String prof = request.getParameter("prof");
		out.println("You are a " + prof);
		/*String location = request.getParameter("location");
		out.println("You are a " + location);*/
		String[] location = request.getParameterValues("location");
		out.println("you are at " + location.length + " places");
		for(int i=0; i<location.length; i++)
		{
			out.println(location[i]);
		}
	}
	
}
