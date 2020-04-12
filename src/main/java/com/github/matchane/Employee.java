package com.github.matchane;

import java.util.Comparator;





public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int salary;
 
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
 public String getname() {
	 return name;
 }
 public void setname(String name) {
	 this.name  = name;
 }
 public int getage() {
	 return age;
 }
 public void setage(int age) {
	 this.age  = age;
 }
 public int getsalary() {
	 return salary;
 }
 public void setsalary(int salary) {
	 this.salary  = salary;
	
 }
@Override
public int compareTo(Employee employee) {
	// TODO Auto-generated method stub
	return this.salary - employee.salary;
}
public static Employee[] initEmployee() {

Employee[] employee = new Employee[2];

Employee ninjaH2R = new Employee (
        "ninjaH2R" ,23,230909 );
Employee ninjaZx = new Employee (
        "ninjaZx" ,23,20909 );


employee[0] = ninjaH2R;
employee[1] = ninjaZx;
return employee;


}
}






