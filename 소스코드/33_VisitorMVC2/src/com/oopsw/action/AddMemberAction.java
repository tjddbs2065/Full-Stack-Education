package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.oopsw.model.MemberDAO;
import com.oopsw.model.MemberVO;

public class AddMemberAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		// 입력받은 데이터를 DBMS에 등록
		String url = "addMember.html"; // 실패 메세지 페이지
		
		// 등록에서 문제가 발생하면 예외를 발생
		String memberId = request.getParameter("memberId");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		String resultName = new MemberDAO().addMember(new MemberVO(memberId, pw, name));
		
		if(resultName != null){
			request.setAttribute("message", resultName);
			url = "login.jsp";
		}
		
		return url;
	}

}
