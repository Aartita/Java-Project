package classandobject;
//uestion filehandling theory
import java.util.Scanner;

public class GradeUniversity {
	static int avg=0;
	static int sum=0;
	static int g;
	 public static int calculateGrade(int a[],int size)
	 {
		 for(int i=0;i<size;i++)
		 {
			 sum=sum+a[i];
		 }
		 avg=sum/size;
		 if(avg>99)
		 {
			 g=-1;
		 }
		 else if(avg>80 && avg<=99)
		 {
			 g=1;
		 }
		 else if(avg>60 && avg<=99)
		 
			 g=2;
		 else
			 g=3;
		 
			 return g;
		 
	 }

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
		
		int gu=calculateGrade(a,n);
		if(gu==-1)
		{
			System.out.println("Invalid input");
			System.exit(0);	
			
		}
		else if(gu==1)
		{
			System.out.println("First Grade university");
		}
		else if(gu==2)
		{
			System.out.println("Second Grade univesity");
		}
		else 
		{
			System.out.println("Third grade university");
		}
	}

}
