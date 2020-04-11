
import java.util.Comparator;





public class Employ implements Comparable<Employ>{
    private String name;
    private int age;
    private int salary;
 
    public Employ(String name, int age, int salary) {
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
public int compareTo(Employ employee) {
	// TODO Auto-generated method stub
	return this.salary - employee.salary;
}
public static Employ[] initEmployee() {

Employ[] employee = new Employ[2];

Employ ninjaH2R = new Employ (
        "ninjaH2R" ,23,230909 );
Employ ninjaZx = new Employ (
        "ninjaZx" ,23,20909 );


employee[0] = ninjaH2R;
employee[1] = ninjaZx;
return employee;


}
}






