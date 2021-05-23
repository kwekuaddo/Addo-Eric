package Q2;

public class Member {
	String name;
	int age;
	String number;
	String address;
	int salary;
	
	public void printSalary(){
		System.out.println(salary);
	}
}
    class Employee extends Member {
    String specialization;
    }
    class Manager extends Member{
    String department;
    }
    class Ans{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Eric";
		e.age = 33;
		e.number = "0244651690";
		e.address = "xyxyxyxy";
		e.salary = 1231;
		e.specialization = "programmer";
		
		Manager m = new Manager();
		e.name = "Amalitech";
		e.age = 45;
		e.number = "9898989898";
		e.address = "zyzyzyzyzy";
		e.salary = 999999;
		e.specialization = "zzzzzzzzzz";
	   }
    }	
		

	


