package relationshipex;

public class Employee {
	int id;
	String Name;
	MyDate dob;
	Address add;
	public Employee()
	{
		id=101;
		Name="Raj";
		dob=new MyDate();
		add=new Address();
		
	}
	
	public Employee(int id, String Name, MyDate dob,Address add) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.Name=Name;
		this.dob=dob;
		this.add=add;
		
	}

	public void display() {
		System.out.println("Id :"+id);
		System.out.println("Name : "+Name);
		dob.display();
		add.display();

}
}
