package DAO;

import java.util.Date;

import VO.Member;

public class MemberDAO implements IMemberDAO{

	@Override
	public boolean addMember(Member memberVo) {;
		return false;
	}

	@Override
	public boolean addMember(String name, Date birthDate) {
		String sql = "insert into member (member_id, birth_date, register_date, rank) values (member_id_seq.nextval, to_date(?), sysdate, ?)";
		return false;
	}

	@Override
	public Member getMember(int memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeMember(int memberId) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
