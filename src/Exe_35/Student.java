package Exe_35;

public class Student {

	private int studentId;
	private String studentName;
	private String sudentBranch;
	private int studentScore;

	public Student(int studentId, String studentName, String sudentBranch, int studentScore) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.sudentBranch = sudentBranch;
		this.studentScore = studentScore;
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

	public String getSudentBranch() {
		return sudentBranch;
	}

	public void setSudentBranch(String sudentBranch) {
		this.sudentBranch = sudentBranch;
	}

	public int getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}
	
	@Override
	public String toString() {
		return this.studentName + " scored " + this.studentScore;
	}

}
