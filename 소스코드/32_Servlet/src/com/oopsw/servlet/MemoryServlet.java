package com.oopsw.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MemoryServlet
 */
@WebServlet("/memory")
public class MemoryServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		
		request.setAttribute("r1", cmd);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("s1", "hello"+cmd);
		
		ServletContext application = request.getServletContext();
		if(application.getAttribute("info") == null){
			application.setAttribute("info", "공유 데이터");
		}
		
		request.getRequestDispatcher("memory.jsp").forward(request, response);		
	}

}
