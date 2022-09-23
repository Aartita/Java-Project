package classandobject;

import java.util.Scanner;

public class NumEnd3 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the size of an array: ");
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	
	if(n<0)
	{
		System.out.println("Invalid Input");
		System.exit(0);
	}
	
	
	int a[]=new int[n];
	int count=0;
	System.out.println("Enter the elements of an arrray:");
	
	for(int i=0;i<a.length;i++)
	{
		
		a[i]=sc.nextInt();
		
		if(a[i]<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		
		
	}
	
	
	
	for(int i=0;i<a.length;i++)
	{
		int rem=a[i]%10;
		if(rem==3)
		{
			count++;
	
		}
	}
	System.out.println(count);
	

	}

}
