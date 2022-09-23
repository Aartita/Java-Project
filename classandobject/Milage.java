package classandobject;

import java.util.Scanner;

public class Milage {

	int milage;
	   public int cubicCap(int CC)
	   {
		   if(CC>100&&CC<=125) {
			   milage=75;
		   }
		   else if(CC>125&&CC<=135)
		   {
			   milage=60;
		   }
		   else if(CC>135&&CC<=150)
		   {
			   milage=50;
		   }
		   else 
		   {
			 milage=35;   
		   }
		   return milage;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CC of bike to check milage :");
		int CC=sc.nextInt();


		if(CC>200) {
       	 System.out.println("Number TOO large");
       	 System.exit(0);
        }
		
		if(CC>100) {
       	 System.out.println("Number TOO small");
       	 System.exit(0);
        }
		
		
		Milage cc=new Milage();
		
		System.out.println("Milage =" +cc.cubicCap(CC));
	}
}



