package com.cpl.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet(description = "for testing", urlPatterns = { "/MyServlet1" })
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

}
