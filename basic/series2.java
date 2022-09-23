package basic;

import java.util.Scanner;

public class series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=1,sum=0;
		System.out.println("Enter the range of number:");
	
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while( i<=n)
        {
			
			
        	System.out.println(+i+"/" +(i*i));
        	if(i<n)
        		System.out.println("+");
        		i++;
        		sum=sum+(i/i*i);
        }
        System.out.println(" = "+sum);

	}

}
