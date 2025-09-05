package com.oopsw.studentmange;

public class AttendanceVO {
	private int studentId;
	private String studentName;
	private String attendanceDate;
	private String checkinTime;
	private String checkoutTime;
	private String leaveTime;
	private String comebackTime;
	private String attendanceStatus;
	
	
	public AttendanceVO(int studentId, String studentName, String attendanceDate, String checkinTime, String checkoutTime,
			String leaveTime, String comebackTime, String attendanceStatus) {
		setStudentId(studentId);
		setStudentName(studentName);
		setAttendanceDate(attendanceDate);
		setCheckinTime(checkinTime);
		setCheckoutTime(checkoutTime);
		setLeaveTime(leaveTime);
		setComebackTime(comebackTime);
		setAttendanceStatus(attendanceStatus);
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}
	public String getCheckinTime() {
		return checkinTime;
	}
	public void setCheckinTime(String checkinTime) {
		this.checkinTime = checkinTime;
	}
	public String getCheckoutTime() {
		return checkoutTime;
	}
	public void setCheckoutTime(String checkoutTime) {
		this.checkoutTime = checkoutTime;
	}
	public String getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}
	public String getComebackTime() {
		return comebackTime;
	}
	public void setComebackTime(String comebackTime) {
		this.comebackTime = comebackTime;
	}
	public String getAttendanceStatus() {
		return attendanceStatus;
	}
	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}

	@Override
	public String toString() {
		return "AttendanceVO [studentId=" + studentId + ", studentName=" + studentName + ", attendanceDate="
				+ attendanceDate + ", checkinTime=" + checkinTime + ", checkoutTime=" + checkoutTime + ", leaveTime="
				+ leaveTime + ", comebackTime=" + comebackTime + ", attendanceStatus=" + attendanceStatus + "]";
	}
	
	
}
