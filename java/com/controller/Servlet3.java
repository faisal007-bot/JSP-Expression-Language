package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.*;


@SuppressWarnings("serial")
@WebServlet("/s3")
public class Servlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		City city = new City();
		city.setCity("mumbai");
		
		Country country = new Country();
		country.setCountry("india");
		
		Address address = new Address();
		address.setCity(city);
		address.setCountry(country);
		
		Student student = new Student();
		student.setId(12);
		student.setName("faisal khan");
		student.setAddress(address);
		
		request.setAttribute("user", student);
		request.getRequestDispatcher("beanget.jsp").forward(request, response);
	}

}
