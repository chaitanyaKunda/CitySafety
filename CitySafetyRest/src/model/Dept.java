package model;

import java.util.Set;

public class Dept {
	
	private int ID;
	private String name;
	private String HOD;
	
	private Set<Employee> employees;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHOD() {
		return HOD;
	}
	public void setHOD(String hOD) {
		HOD = hOD;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Dept [ID=" + ID + ", name=" + name + ", HOD=" + HOD + "]";
	}
		
}
