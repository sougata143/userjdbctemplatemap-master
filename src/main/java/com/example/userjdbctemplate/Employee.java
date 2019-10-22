package com.example.userjdbctemplate;

public class Employee {

	private String empId;
	private String empFName;
	private String empMName;
	private String empLName;
	private String empDeptId;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpFName() {
		return empFName;
	}
	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	public String getEmpMName() {
		return empMName;
	}
	public void setEmpMName(String empMName) {
		this.empMName = empMName;
	}
	public String getEmpLName() {
		return empLName;
	}
	public void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	public String getEmpDeptId() {
		return empDeptId;
	}
	public void setEmpDeptId(String empDeptId) {
		this.empDeptId = empDeptId;
	}
	public Employee(String empId, String empFName, String empMName, String empLName, String empDeptId) {
		super();
		this.empId = empId;
		this.empFName = empFName;
		this.empMName = empMName;
		this.empLName = empLName;
		this.empDeptId = empDeptId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFName=" + empFName + ", empMName=" + empMName + ", empLName="
				+ empLName + ", empDeptId=" + empDeptId + "]";
	}
	
	
	
}
