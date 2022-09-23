package relationshipex;

public class StaticStudent {
	
	int id;
	String name;
	static String clgName="D.Y Patil"; 

	StaticStudent(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+clgName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticStudent s1 = new StaticStudent(101,"Raj");
		StaticStudent s2 = new StaticStudent(102,"Riya");
		
		s1.display();
		s2.display();
				
		
	}

}
