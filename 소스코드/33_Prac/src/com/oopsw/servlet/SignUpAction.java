package com.oopsw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 배성윤
 */
@WebServlet("/SignUpAction")
public class SignUpAction extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pw = request.getParameter("pw");
		String pwCheck = request.getParameter("pwCheck");
		
		request.setCharacterEncoding("utf-8");
		
		String uri = "signupFail.jsp";
		if(pw.equals(pwCheck)){
			request.setAttribute("isPwEqual", "일치");
			uri = "signupOk.jsp";
		}
		
		request.setAttribute("isPwEqual", "불일치");
		request.getRequestDispatcher(uri).forward(request, response);
		
	}

}
