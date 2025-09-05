package test.com.oopsw.studentmanage;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.oopsw.studentmange.AttendanceVO;
import com.oopsw.studentmange.StudentManageDAO;
import com.oopsw.studentmange.StudentManageDAOImpl;
import com.oopsw.studentmange.StudentVO;

public class StudentTest {
	static StudentManageDAO dao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new StudentManageDAOImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getStudent() {
		Collection<StudentVO> list = dao.getStudents("Ǯ���� ����");
		for(StudentVO sVo : list){System.out.println(sVo);}
	}
	
	@Test
	public void addStudent() {
		assertTrue(dao.addStudent(new StudentVO("ȫ�浿", "��", "1700-01-01", "������ �Ѿ�", "mrhong@chosun.go.kr", "010-8282-8282", "������")));
	}
	
	@Test
	public void updateStudent() {
		assertTrue(dao.updateStudent(1, new StudentVO("������ ���", "mrhong@korea.go.kr", "010-8282-8282", "������")));
	}
	@Test
	public void deleteStudent() {
		assertTrue(dao.deleteStudent(4));
	}
	@Test
	public void getAttendance() {
		Collection<AttendanceVO> list = dao.getAttendances(3, "2025-09-04", "�⼮");
		for(AttendanceVO aVo: list) System.out.println(aVo); 
	}
	
}
