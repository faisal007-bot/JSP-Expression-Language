package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/s2")
public class Servlet2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		/*
		 * String name = request.getParameter("name"); String city =
		 * request.getParameter("city"); String[] sport =
		 * request.getParameterValues("sports");
		 */
		
		request.getRequestDispatcher("parameter.jsp").forward(request, response);
	}

}
