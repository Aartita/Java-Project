package relationshipex;

public class Test {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

	/* Person p1 =new Person();
		p1.display();
		
		System.out.println();
		
		Person p2 =new Person(102,"Riya",new MyDate(22,11,1998));
		 p2.display();*/
		
		Student s1=new Student();
		s1.calculate();
		s1.display();
		
		Student s2= new Student(102,"Manas",new MyDate(12,3,1998),67,78,83);
		s2.calculate();
		s2.display();
		
		Grrade g1= new Grrade();
		g1.calculate();
		g1.display();
		
		Grrade g2= new Grrade(1,"aarti",new MyDate(13,4,1999),67,78,57);
		g2.calculate();
		g2.display();
		
	}

}
