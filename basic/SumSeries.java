package basic;

import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of terms in series:");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+"/"+i);
			if(i<n)
				System.out.println(" + ");
			sum=sum+(i/i);
		}
         System.out.println("sum of series = "+sum);
         
	}

}
