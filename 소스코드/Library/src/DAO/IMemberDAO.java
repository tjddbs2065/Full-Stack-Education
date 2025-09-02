package DAO;
import java.sql.Connection;
import java.util.Date;

import VO.Member;

public interface IMemberDAO {	
	/** 회원등록 */
	public boolean addMember(Member memberVo);
	
	/** 회원등록 */
	public boolean addMember(String name, Date birthDate);
	
	/** 회원조회 */
	public Member getMember(int memberId);
	
	/** 회원삭제 */
	public boolean removeMember(int memberId);
}
