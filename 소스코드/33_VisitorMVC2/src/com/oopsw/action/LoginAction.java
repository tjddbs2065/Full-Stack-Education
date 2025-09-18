package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.startup.HomesUserDatabase;

import com.oopsw.model.MemberDAO;
import com.oopsw.model.MemberVO;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		String url = "login.jsp";
		
		String memberId = request.getParameter("memberId");
		String pw = request.getParameter("pw");
		
		String resultName = new MemberDAO().login(new MemberVO(memberId, pw));
		
		if(resultName != null){
			HttpSession session = request.getSession(true);

			session.setAttribute("loginOk", memberId);
			session.setAttribute("loginName", resultName);
			
			url = "getVisitors.jsp";
		}
		
		return url;
	}

}
