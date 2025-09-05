package com.oopsw.studentmange;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class StudentManageDAOImpl implements StudentManageDAO {
	private Connection connection;

	public StudentManageDAOImpl() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String uri = "jdbc:oracle:thin:@localhost:1521:XE";
		this.connection = DriverManager.getConnection(uri, "hr", "hr");
	}

	/** 학생 정보 조회 */
	@Override
	public Collection<StudentVO> getStudents(String courseName) {
		List<StudentVO> list = new ArrayList<>();

		String sql = 
				"select s.student_id, s.student_name, s.gender, s.birth_date, s.address, s.email, s.phone_number, s.major "
				+ "from student s "
				+ "join enrollment e on s.student_id = e.student_id "
				+ "join course c on c.course_id = e.course_id "
				+ "where c.course_name = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "풀스택 과정");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				list.add(
						new StudentVO(
								resultSet.getInt(1),
								resultSet.getString(2), 
								resultSet.getString(3), 
								resultSet.getString(4), 
								resultSet.getString(5), 
								resultSet.getString(6), 
								resultSet.getString(7), 
								resultSet.getString(8)
						)
					);
			}
			
			resultSet.close();
			preparedStatement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/** 학생 정보 추가 */
	@Override
	public boolean addStudent(StudentVO studentVO) {
		boolean result = false;
		String sql = "insert into student "
				+ "(student_id, student_name, gender, birth_date, address, email, phone_number, major) "
				+ "values "
				+ "(student_seq.nextval, ?, ?, to_date(?), ?, ?, ?, ?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, studentVO.getStudentName());
			preparedStatement.setString(2, studentVO.getGender());
			preparedStatement.setString(3, studentVO.getBirthDate());
			preparedStatement.setString(4, studentVO.getAddress());
			preparedStatement.setString(5, studentVO.getEmail());
			preparedStatement.setString(6, studentVO.getPhoneNumber());
			preparedStatement.setString(7, studentVO.getMajor());
			
			result = preparedStatement.executeUpdate() == 1;
			
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean updateStudent(int studentId, StudentVO studentVO) {
		boolean result = false;
		String sql = "update student "
				+ "set address = ?, email = ?, phone_number = ?, major = ?"
				+ "where student_id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, studentVO.getAddress());
			preparedStatement.setString(2, studentVO.getEmail());
			preparedStatement.setString(3, studentVO.getPhoneNumber());
			preparedStatement.setString(4, studentVO.getMajor());
			preparedStatement.setInt(5, studentId);
			
			result = preparedStatement.executeUpdate() == 1;
			
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		boolean result = false;
		String sql = "update student set "
				+ "student_name = '알수없음', gender = '무', birth_date = to_date('1980-01-01'), address = '알수없음', email='알수없음', phone_number = '알수없음', major='알수없음' "
				+ "where student_id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, studentId);
			
			result = preparedStatement.executeUpdate() == 1;
			
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Collection<AttendanceVO> getAttendances(int courseId, String date) {
		return getAttendances(courseId, date, "");
	}

	@Override
	public Collection<AttendanceVO> getAttendances(int courseId, String date, String attendanceStatus) {
		List<AttendanceVO> list = new ArrayList<>();

		String sql = 
				"select s.student_id, s.student_name, a.attendance_date, a.checkin_time, a.leave_time, a.comeback_time, a.checkout_time, a.attendance_status "
				+ "from attendance a "
				+ "join enrollment e on a.enrollment_id = e.enrollment_id "
				+ "join student s on s.student_id = e.student_id "
				+ "where e.course_id = ? and a.attendance_date = ? and a.attendance_status like ?"
				+ "order by s.student_id asc";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, courseId);
			preparedStatement.setString(2, date);
			preparedStatement.setString(3, "%"+attendanceStatus+"%");
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				list.add(
						new AttendanceVO(
								resultSet.getInt(1),
								resultSet.getString(2), 
								resultSet.getString(3), 
								resultSet.getString(4), 
								resultSet.getString(5), 
								resultSet.getString(6), 
								resultSet.getString(7), 
								resultSet.getString(8)
						)
					);
			}
			
			resultSet.close();
			preparedStatement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Collection<ScoreVO> getScores(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
