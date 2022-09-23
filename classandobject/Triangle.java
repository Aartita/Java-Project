package classandobject;

import java.util.Scanner;

public class Triangle {
	long ar;
	long b;
	long h;
	public Triangle(long b,long h)
	{

		    	 this.b=b;
		    	 this.h=h;
		     
		    }
	
public void area()
{

	Scanner sc= new Scanner(System.in);
    
    System.out.println("Enter the width of the Triangle:");
    long b= sc.nextLong();
    System.out.println("Enter the height of the Triangle:");
    long h= sc.nextLong();
   long ar =(int) ((b*h)/2);
   System.out.println("Area of Triangle is: " +ar);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	      Triangle t=new Triangle(4,7);
	          
	t.area();

	}

}
