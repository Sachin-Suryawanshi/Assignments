package com.springassign;

public class Employee {
	int empid;
	String ename;
	double basicSalary,pf,pt,hra,medical,grossSalary,netSalary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String ename, double basicSalary, double pf, double pt, double hra, double medical,
			double grossSalary, double netSalary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.basicSalary = basicSalary;
		this.pf = 0.12*this.basicSalary;
		this.pt = 200;
		this.hra = 0.5*this.basicSalary;
		this.medical = medical;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getPt() {
		return pt;
	}
	public void setPt(double pt) {
		this.pt = pt;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	public double getGrossSalary() {
		return (this.basicSalary+this.hra+this.medical);
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getNetSalary() {
		return (this.getGrossSalary()-this.pf-this.pt);
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", basicSalary=" + basicSalary + ", pf=" + pf + ", pt="
				+ pt + ", hra=" + hra + ", medical=" + medical + ", grossSalary=" + grossSalary + ", netSalary="
				+ netSalary + "]";
	}
	
	

}
