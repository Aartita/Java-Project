package relationshipex;

public class Person {
    int id;
	String Name;
	MyDate dob;
	
	public Person()
	{
		id=101;
		Name="Raj";
		dob=new MyDate();
		
	}
	
	public Person(int id, String Name, MyDate dob) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.Name=Name;
		this.dob=dob;
		
	}

	public void display() {
		System.out.println("Id :"+id);
		System.out.println("Name : "+Name);
		dob.display();
	}
	
}
