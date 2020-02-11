package com.app.model;

import java.util.List;

public class Employee {

	private Integer empId;
	private String empName;
	private String empGen;
	private String empProj;
	private String empAddr;
	private List<String> empLangs;
	
	public Employee() {
		super();
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpGen() {
		return empGen;
	}
	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}
	public String getEmpProj() {
		return empProj;
	}
	public void setEmpProj(String empProj) {
		this.empProj = empProj;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public List<String> getEmpLangs() {
		return empLangs;
	}
	public void setEmpLangs(List<String> empLangs) {
		this.empLangs = empLangs;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empGen=" + empGen + ", empProj=" + empProj
				+ ", empAddr=" + empAddr + ", empLangs=" + empLangs + "]";
	}
		
}