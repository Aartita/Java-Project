package basic;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		 double sum = 0;
	        int n;
	        System.out.println("1/1! + 2/2! + 3/3! + ..N/N!");
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the no. of terms in series:");
	        n = sc.nextInt();
	        Question8 obj = new Question8();
	        for(int i = 1; i <= n; i++)
	        {
	            sum = sum + (double)i / (obj.fact(i));
	        }
	        System.out.println("Sum of series:"+sum);
	    }
	    int fact(int x)
	    {
	        int mul = 1;
	        while(x > 0)
	        {
	            mul = mul * x;
	            x--;
	        }
	        return mul;
	    }
		
		

	}


