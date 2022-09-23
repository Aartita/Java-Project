package classandobject;

import java.util.Scanner;

public class AvgMark {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the size of an array: ");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		
		int a[] =new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
			if(a[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
		}
	}
		
		clearedStage(a,n);
	}
	
	static int cleared[]= new int[10];
	static int j;
	public static void clearedStage(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			if(i==0||i==3)		}
	}
	
}
