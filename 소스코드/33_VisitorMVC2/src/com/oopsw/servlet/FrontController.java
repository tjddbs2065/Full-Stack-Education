package com.oopsw.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oopsw.action.Action;
import com.oopsw.action.ActionFactory;

//@WebServlet("/FrontController")
//@WebServlet("/controller.do")
@WebServlet("/controller")
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			System.out.println("��� ����");
//			Thread.sleep(5000);
//			System.out.println("����");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		request.setCharacterEncoding("utf-8");
		
		// ��� ��û�� ó���Ѵ�. // controller?cmd=addMemberUI
		String cmd = request.getParameter("cmd");
		if(cmd == null || cmd.trim().length() == 0){
			cmd = "mainUI";
		}
		
		// ���� �� Action�� ã�ƿ´�.
		Action action = ActionFactory.getAction(cmd);
		
		// ��� �������� �̵��Ѵ�.
		String url = "\\" + action.execute(request);
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
