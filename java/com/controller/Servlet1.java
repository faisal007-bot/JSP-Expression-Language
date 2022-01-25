package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/s1")
@SuppressWarnings("serial")
public class Servlet1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		context.setAttribute("id", 20);
		HttpSession session = req.getSession();
		session.setAttribute("name", "faisal");
		req.setAttribute("city", "mumbai");
		RequestDispatcher rd = req.getRequestDispatcher("scope.jsp");
		rd.forward(req, resp);
	}
}
