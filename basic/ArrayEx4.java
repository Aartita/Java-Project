package basic;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int size,i = 0,j = 0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size =sc.nextInt();
		
		System.out.println("Enter" +size+ "array element");
		
		
		int a[][]=new int[i][j];
		for( i=0 ;i<3;i++)
		{
			for(j=0; j<3; j++)
			{
			a[i][j]= sc.nextInt();
		}
		System.out.println("Array");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i][j]);
		}

	}
	}

}
