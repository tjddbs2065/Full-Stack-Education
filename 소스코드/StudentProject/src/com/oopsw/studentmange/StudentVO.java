package com.oopsw.studentmange;

public class StudentVO {
	private int studentId;
	private String studentName;
	private String gender;
	private String birthDate;
	private String address;
	private String email;
	private String phoneNumber;
	private String major;

	public StudentVO(String studentName, String gender, String birthDate, String address, String email, String phoneNumber, String major){
		this(0, studentName, gender, birthDate, address, email, phoneNumber, major);
	}
	
	public StudentVO(String address, String email, String phoneNumber, String major){
		this(0, null, null, null, address, email, phoneNumber, major);
	}
	
	public StudentVO(int studentId, String studentName, String gender, String birthDate, String address, String email,
			String phoneNumber, String major) {
		setStudentId(studentId);
		setStudentName(studentName);
		setGender(gender);
		setBirthDate(birthDate);
		setAddress(address);
		setEmail(email);
		setPhoneNumber(phoneNumber);
		setMajor(major);
	}
	
	private void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "StudentVO [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", address=" + address + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", major=" + major + "]";
	}
}
