package designpattern;

import java.util.Scanner;

interface Prototype{
	public Prototype getClone();
}

class Employee implements Prototype{
	
	private int id;
	private String empName,address;
	private double salary;

	public Employee(int id, String empName, String address, double salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}


	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new Employee(id,empName,address,salary);
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", address=" + address + ", salary=" + salary + "]";
	}
	
}
public class PrototypeDesignPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String empName = sc.nextLine();
		System.out.println("Enter address:");
        String address = sc.nextLine();
        System.out.println("Enter salary:");
        int salary= sc.nextInt();
        
	}

	

}
