package Exe_34;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentBranch;
	
	public Student(int studentId, String studentName, String studentBranch) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
	}
	
	
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentBranch() {
		return this.studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentBranch=" + studentBranch
				+ "]";
	}
	
	
}
