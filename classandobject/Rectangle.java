package classandobject;

import java.util.Scanner;

public class Rectangle {
	
	int l,b;
	
	public Rectangle()  //Default constructor
	{
		l=12;
		b=8;
		
	}
	
	//public Rectangle(int length,int breadth)//Parameterized constructor
	{
	//	l=length;
		//b=breadth;
	}//
	
	
	public Rectangle(int l,int b)//Parameterized constructor
		{
		   this.l=l;
			this.b=b;
		}
	
	
	public void area()
	
	{
		//System.out.println("Enter the length:");
		//Scanner sc=new Scanner(System.in);
		//l= sc.nextInt();
		//System.out.println("Enter  the breadth: ");
		//b= sc.nextInt();
		System.out.println("The area of rectangle is: "+(l*b));
		
				
	}
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Rectangle r=new Rectangle();
		r.area();
	}

}
