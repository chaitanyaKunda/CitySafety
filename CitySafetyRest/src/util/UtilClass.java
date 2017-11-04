package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import model.Dept;
import model.Employee;

public class UtilClass {
	
	
	
	public static void main(String[] args) {
		
		Set<Dept> deptSet = new HashSet<Dept>();
		List<Dept> deptList = new ArrayList<Dept>();
		Set<Employee> empSet = new HashSet<Employee>();
		List<Employee> empList = new ArrayList<Employee>();
		
		Dept dept1 = new Dept();
		dept1.setID(1);
		dept1.setName("CSE");
		dept1.setHOD("Kiran Sree");
		Set<Employee> firstDeptSet = new HashSet<Employee>();
		deptSet.add(dept1);
		
		
		Dept dept2 = new Dept();
		dept2.setID(2);
		dept2.setName("ECE");
		dept2.setHOD("Babu");
		deptSet.add(dept2);
		Set<Employee> secondDeptSet = new HashSet<Employee>();
		
		Dept dept3 = new Dept();
		dept3.setID(3);
		dept3.setName("EEE");
		dept3.setHOD("Suresh");
		deptSet.add(dept3);
		Set<Employee> thirdDeptSet = new HashSet<Employee>();
		
		
		Employee emp1 = new Employee();
		emp1.setID(1);
		emp1.setName("first name");
		emp1.setSalary(1000);
		emp1.setDept(dept1);
		empSet.add(emp1);
		empList.add(emp1);
		
		Employee duplicateemp = new Employee();
		duplicateemp.setID(1);
		duplicateemp.setName("first name");
		duplicateemp.setSalary(1000);
		duplicateemp.setDept(dept1);
		
		empSet.add(duplicateemp);
		empList.add(duplicateemp);
		firstDeptSet.add(emp1);
		dept1.setEmployees(firstDeptSet);
		
		
		Employee emp2 = new Employee();
		emp2.setID(2);
		emp2.setName("Second name");
		emp2.setSalary(1500);
		empSet.add(emp2);
		emp2.setDept(dept2);
		empList.add(emp2);
		secondDeptSet.add(emp2);
		dept2.setEmployees(secondDeptSet);
		
		Employee emp3 = new Employee();
		emp3.setID(3);
		emp3.setName("Third name");
		emp3.setSalary(800);
		empSet.add(emp3);
		empList.add(emp3);
		emp3.setDept(dept3);
		thirdDeptSet.add(emp3);
		dept3.setEmployees(thirdDeptSet);
		
		Employee emp4 = new Employee();
		emp4.setID(4);
		emp4.setName("Four name");
		emp4.setSalary(1100);
		empSet.add(emp4);
		empList.add(emp4);
		emp4.setDept(dept2);
		secondDeptSet.add(emp4);
		dept2.setEmployees(secondDeptSet);
		
//		List<Employee> employeeList = new ArrayList<Employee>();
//		employeeList.addAll(empSet);
		
		Iterator<Employee> empIterator= empSet.iterator();
		System.out.println("Employees---------------------in Set");
		while(empIterator.hasNext())
			System.out.println(empIterator.next());
		System.out.println("Employees---------------------in List");
		for(Employee employee: empList)
			System.out.println(employee);
		Iterator<Dept> deptIterator = deptSet.iterator();
		System.out.println("Dept---------------------");
		while(deptIterator.hasNext()){
			
		
		Iterator<Employee> deptEmpIterator = null;
		System.out.println("---------------------");
			Dept dptname = deptIterator.next();
			System.out.println("Employes  in "+dptname.getName());
			deptEmpIterator = dptname.getEmployees().iterator();
			while(deptEmpIterator.hasNext())
			{
				System.out.println("Employee"+deptEmpIterator.next().getName());
			}
			System.out.println("---------------------");
			
		}

		
		
	}
}
