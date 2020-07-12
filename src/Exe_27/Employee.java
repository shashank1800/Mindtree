package Exe_27;

public class Employee {

	private int empId;
	private String empName;
	private String empDesig;
	private String empDept;

	public Employee() {
	}

	public Employee(int empId, String empName, String empDesig,
			String empDept) {

		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empDept = empDept;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		if (empName != null)
			this.empName = empName;
		else
			System.out.println("Employee name should not be empty");
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		if (Utils.designationSet.contains(empDesig))
			this.empDesig = empDesig;
		else
			System.out.println("Invalid Designation");

	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {

		if (Utils.deptSet.contains(empDept))
			this.empDept = empDept;
		else
			System.out.println("Invalid Department");
	}

}
