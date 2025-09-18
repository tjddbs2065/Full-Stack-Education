package com.oopsw.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.oopsw.model.MemberDAO;
import com.oopsw.model.MemberVO;

public class AddMemberAction implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		// �Է¹��� �����͸� DBMS�� ���
		String url = "addMember.html"; // ���� �޼��� ������
		
		// ��Ͽ��� ������ �߻��ϸ� ���ܸ� �߻�
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
