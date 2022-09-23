package classandobject;

import java.util.Scanner;

public class ClassEx {
	 
	int a,b;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc. nextInt();
		b = sc.nextInt();
	}

	public void add()
	{
	     int c=a+b;
	     System.out.println("Add : "+c);
		
	}
	
	public int sub()
	{
	     int c=a-b;
	     System.out.println("Sub : "+c);
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ClassEx c =  new ClassEx();
		c.accept();
		c.add();
		c.sub();
	}

}

