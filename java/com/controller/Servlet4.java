package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/s4")
public class Servlet4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("name_of_user", "faisal");
		
		Integer[] arr = {11,3,22,434,5};
		
		Integer[][] arr2 = {{11,22},{33,44}};
		
		request.setAttribute("array", arr);
		request.setAttribute("array2", arr2);
		request.setAttribute("map", m1);
		
		request.getRequestDispatcher("array.jsp").forward(request, response);
	}
}
