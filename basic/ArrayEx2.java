package basic;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size,i;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size =sc.nextInt();
		
		System.out.println("Enter" +size+ "array element");
		int a[] =new int[size];
		for( i=0 ;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Array");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
