package abstractionex;

 abstract class Parent{
	
	 public abstract void message();

}
 
 
  class child1 extends Parent{
	 public void message()
	 {
		 System.out.println("This is a First subclass");
	 }

	 
 }
 
 class child2 extends Parent{
	 public void message()
	 {
		 System.out.println("This is a Second subclass");
	 }

	 
 }
 

public class Parentabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Parent p,p1;
		  p=new child1();
		p1=new child2();

p.message();
p1.message();
		
		

	}

}
