package classandobject;

import java.util.Scanner;

public class Area {
	
	double pi=3.14f,c;
	int r,l,w;
	
	 public void circle()
	{
	 Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius:");
	r=sc.nextInt();
	c=pi*r*r;
	System.out.println("Area of circle="+c);
	}
	 
	 public double rectangle()
	 {
	 
	 System.out.println("Enter the length of rectangle:");
	 Scanner sc=new Scanner(System.in);
		double l=sc.nextDouble();
		System.out.println("Enter the width of rectangle:");
		double w=sc.nextDouble();
	    double a=l*w;
	    System.out.println("Area of rectangle:"+a);
	    return a;
	 }
	
	 public double triangle()
	 
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the width of triangle:");
		    double b=sc.nextDouble();
		     System.out.println("Enter the height of triangle");
		     double h=sc.nextDouble();
		     double t=(b*h)/2;
		     System.out.println("Area of triangle="+t);
			return t;
		}
	 
	 public void square()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		  int x=sc.nextInt();
		  int s= (x*x);
		  System.out.println("The square is "+s);
		
			 
	 }
	 
	
         static void main(String[] args) {
		// TODO Auto-generated method stub
	 Area b= new Area();
	 b.circle();
	 b.rectangle();
	 b.triangle();
	 b.square();

	}

}
