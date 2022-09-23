package classandobject;

import java.util.Scanner;

public class SumofAge {

	static int sum=0;
	
	
	public static int newArraySum( int age[],int size)
	{
		
		for(int i=0;i<=size;i++)
		{
		 
		
		if(age[i]>=18) {
			
			sum=sum+age[i];
			
			System.out.println("Sum of ages is :"+sum);
			
		}
		else {
			
			System.out.println("Invalid age");
			
		
		}
		
		}
		return sum;
	}
		
		
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		System.out.println("Enter the size of an array :");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		
		System.out.println("Enter the array elements :");
		int a[]=new int[n];
		for(int i=0;i<=a.length;i++)
		{
			a[i]=sc.nextInt();
			
		
		
		if(a[i]<0)
		{
			
			System.out.println("Invalid input");
			System.exit(0);
		}
		int sa =SumofAge(a,n);
				
		System.out.println("The sum of age:"+sum);
		
		}

}





	private static int SumofAge(int[] a, int n) {
		// TODO Auto-generated method stub
		return 0;
	}
}
