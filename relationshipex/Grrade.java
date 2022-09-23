package relationshipex;

public class Grrade extends Student {
	
	String grade;
	
	public Grrade()	
	{
		super();
		
	}
	public Grrade(int id,String name,MyDate dob,float m1,float m2,float m3) {
		super(id,name,dob,m1,m2,m3);	
		}
	public void calculate()
	
	{
		super.calculate();
		
		if(percent>=75)
		     grade = "A+";
		else if(percent>=60)
			grade = "A";
		else if(percent>=45)
			grade ="B+";
		else if(percent>=35)
			grade = "B";
		else
			grade = "Fail";
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Grade : "+grade);
	
		
	}
}
