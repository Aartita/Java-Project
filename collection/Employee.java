package collection;

public class Employee {

	
	int id;
	String Name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", age=" + age + "]";
	}
	
	
}
