package com.oopsw.studentmange;

import java.util.Collection;

public interface StudentManageDAO {
	public Collection<StudentVO> getStudents(String courseName);
	public boolean addStudent(StudentVO studentVO);
	public boolean updateStudent(int studentId, StudentVO studentVO);
	public boolean deleteStudent(int studentId);
	
	public Collection<AttendanceVO> getAttendances(int courseId, String date);
	public Collection<AttendanceVO> getAttendances(int courseId, String date, String attendanceStatus);
	
	public Collection<ScoreVO> getScores(int courseId);
}
