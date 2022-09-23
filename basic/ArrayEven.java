package basic;

import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
	        
	        int n;    //Declare size of an array
	        System.out.println("Enter the size of the array: ");
	        n=sc.nextInt();    //Intialize the array size
	        
	        int a[]=new int[n];   //Declare an array
	        System.out.println("Enter the array elements: ");
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();    //Initialize the array elements
	        }
	        //Print the even elements
	        System.out.println("The Even Elements are...");
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]%2==0)   //Check whether even or not
	            {
	                System.out.print(a[i]+" ");
	            }
	        
            
        }
        


	}

}
