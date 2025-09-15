package com.oopsw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �輺��
 */
@WebServlet("/SignUpAction")
public class SignUpAction extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pw = request.getParameter("pw");
		String pwCheck = request.getParameter("pwCheck");
		
		request.setCharacterEncoding("utf-8");
		
		String uri = "signupFail.jsp";
		if(pw.equals(pwCheck)){
			request.setAttribute("isPwEqual", "��ġ");
			uri = "signupOk.jsp";
		}
		
		request.setAttribute("isPwEqual", "����ġ");
		request.getRequestDispatcher(uri).forward(request, response);
		
	}

}
