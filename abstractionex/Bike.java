package abstractionex;

public abstract class Bike {
	
	Bike()
	{
		System.out.println("constructor in abstract class");
	}
  public abstract void run();
  
  public void display()
  {
	  System.out.println("Inside non-abstract method");

}
}
