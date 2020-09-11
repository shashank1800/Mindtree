package Exe_27;

public class Employee {

	private int empId;
	private String empName;
	private String empDesig;
	private String empDept;

	public Employee() {
	}

	public Employee(int empId, String empName, String empDesig, String empDept) {

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

	public boolean setEmpName(String empName) {
	    boolean isNull = true;
		if (empName != null || !empName.isEmpty()) {
			this.empName = empName;
			isNull = false;
		}
		else
			System.out.println("Employee name should not be empty");
		
		return isNull;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public boolean setEmpDesig(String empDesig) {
		if (Utils.designationSet.contains(empDesig))
			this.empDesig = empDesig;
		else {
			System.out.println("Invalid Designation");
			return false;
		}
		return true;

	}

	public String getEmpDept() {
		return empDept;
	}

	public boolean setEmpDept(String empDept) {

		if (Utils.deptSet.contains(empDept))
			this.empDept = empDept;
		else {
			System.out.println("Invalid Department");
			return false;
		}
		return true;
	}

}
