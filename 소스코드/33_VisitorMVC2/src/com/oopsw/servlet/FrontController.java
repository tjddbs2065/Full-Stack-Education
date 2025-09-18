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
//			System.out.println("대기 시작");
//			Thread.sleep(5000);
//			System.out.println("종료");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		request.setCharacterEncoding("utf-8");
		
		// 모든 요청을 처리한다. // controller?cmd=addMemberUI
		String cmd = request.getParameter("cmd");
		if(cmd == null || cmd.trim().length() == 0){
			cmd = "mainUI";
		}
		
		// 일을 할 Action을 찾아온다.
		Action action = ActionFactory.getAction(cmd);
		
		// 결과 페이지로 이동한다.
		String url = "\\" + action.execute(request);
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
