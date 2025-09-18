package com.oopsw.model;

public class MemberDAO {
	public void MemberDAO(){}

	public String addMember(MemberVO memberVO) {
		String name = null;
		
		if(memberVO != null && memberVO.getMemberId().equals("admin")){
			name = memberVO.getName();
		}
		
		return name;
	}

	public String login(MemberVO memberVO) {
		String result = null;
		
		if(memberVO.getMemberId().equals("admin") && memberVO.getPw().equals("adminpw")){
			result = "adminName";
		}
		
		return result;
	}

}
