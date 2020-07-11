package Exe_33;

public class Student {
	
	private int studentId;
	private String studentName;
	private float marks;
	private boolean secondChance;
	
	public Student(int studentId, String studentName, boolean secondChance) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.secondChance = secondChance;
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public boolean isSecondChance() {
		return secondChance;
	}

	public void setSecondChance(boolean secondChance) {
		this.secondChance = secondChance;
	}
	
	public void identifyMarks(float marks1) {
		if(!this.secondChance)
			this.marks = marks1;
		System.out.println(this.marks);
	}
	
	public void identifyMarks(float marks1, float marks2) {
		if(this.secondChance) 
			this.marks = Math.max(marks1, marks2);
		
		System.out.println(this.marks);
	}
	

}
