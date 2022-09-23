package collection;

import java.util.Objects;

public class Employee2 {

	
	int id;
	String Name;
	int age;
	
	public Employee2(int id, String name, int age) {
		super();
		this.id = id;
		this.Name = Name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", age=" + age + "]";
	}
	
	public int compareTo(Employee2 e)
	{
		if(age==e.age)
			return 0;
		else if(age>e.age)
			return 1;
		else 
			return -1;
	}
	}
	
	

