package com.oopsw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/loginAction")
public class LoginActionServlet extends HttpServlet {


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
//		PrintWriter pWriter = response.getWriter();
//		pWriter.append("loginAction: ").append(id).append(pw);
		
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		
	}

}
