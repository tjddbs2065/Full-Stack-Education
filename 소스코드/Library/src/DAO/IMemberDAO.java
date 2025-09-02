package DAO;
import java.sql.Connection;
import java.util.Date;

import VO.Member;

public interface IMemberDAO {	
	/** ȸ����� */
	public boolean addMember(Member memberVo);
	
	/** ȸ����� */
	public boolean addMember(String name, Date birthDate);
	
	/** ȸ����ȸ */
	public Member getMember(int memberId);
	
	/** ȸ������ */
	public boolean removeMember(int memberId);
}
