package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet5
 */
@SuppressWarnings("serial")
@WebServlet("/s5")
public class Servlet5 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Cookie cookie = new Cookie("name", "faisal");
		response.addCookie(cookie);
		
		request.getRequestDispatcher("cookie.jsp").forward(request, response);
	}
}
