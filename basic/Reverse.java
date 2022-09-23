package basic;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,r;
       int sum=0;
       System.out.println("Enter the number:");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       while(n>0)
       {
    	   r=n%10;
    	   sum=(sum*10)+r;
    	   n=n/10;   
       }
       System.out.println("The reverse number is" +sum);
	}

}
