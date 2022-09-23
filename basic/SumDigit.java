package basic;

import java.util.Scanner;

public class SumDigit {

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
    	   sum=sum+r;
    	   n=n/10;
    	   
       }
       System.out.println("The sum of digit is"+sum);
	}

}
