package relationshipex;

public class Student extends Person {
	
	float m1,m2,m3,total,percent;
	
	public Student()
	{
		super();//used to called super class constructor
		m1=45;
		m2=56;
		m3=78;
	}
	
	public Student(int id, String name,MyDate dob,float m1,float m2,float m3)
	{
		super(id,name,dob);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	public void calculate() {
		total=m1+m2+m3;
		percent=total/3;
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("Total : "+total);
		System.out.println("Percent : "+percent);
		
		System.out.println("class name:getClass.getName()");
	}


}
