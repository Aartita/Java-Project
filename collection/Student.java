package collection;

public class Student {
	
	
	
	int id;
	String Name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", age=" + age + "]";
	}
	

}
