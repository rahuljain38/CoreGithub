package com.csi.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
@Id
@GeneratedValue
private int  empId;
private String empName;
private double empSalary;
@ManyToMany
private List<Address>addressses;
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
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public List<Address> getAddressses() {
	return addressses;
}
public void setAddressses(List<Address> addressses) {
	this.addressses = addressses;
}

}
