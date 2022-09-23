package basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,rem,rev=0,temp;
	       
	       System.out.println("Enter the number:");
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	       temp=n;
	       while(n!=0)
	       {
	    	   rem=n%10;
	    	   rev=(rev*10)+rem;
	    	   n=n/10;   
	       }
	       if(temp==rev)
	       {
	       System.out.println(temp+ "is palindrome");
	       }
	       else
	       {
	    	   System.out.println(temp+ "is not palindrome");
	       }
	}

}
