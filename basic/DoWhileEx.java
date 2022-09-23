package basic;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	    int a,b,c;
	    char ch;
	  Scanner sc =new Scanner(System.in);
	   do {
	   
	    System.out.println("Enter two number :");
	    a = sc.nextInt();
	    b = sc.nextInt();
	    
	    c=a+b;
	    System.out.println("Addition :" +c);
	    System.out.println("Do you want to continue(y/n) ");
	    ch=sc.next().charAt(0);
	   } 
while(ch=='y' || ch=='Y');
}
	
}

