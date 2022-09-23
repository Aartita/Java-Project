package classandobject;

import java.util.Scanner;

public class FirstandThirdLargestNo {
	
	public static int FirstLargest(int a[],int n)

	{
		int x;
		
		for(int p=1;q<a.length;q++)
			
		{
			for (int )
			if(a[q]>=a[(p)])
			{
				x=a[p];
				a[p]=a[q];
				a[q]=x;
			}
		}
		
	}
	
	int l =a[a.length-3]*(a[a.length-1]);
		return l;
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size :");
      a=sc.nextInt();
      if(a<0)
      {
    	  System.out.println("Invalid size");
      }
      
      int array[]=new int[a];
      System.out.println(" Enter the array elemnt :");
      for(int i=0;i<array.length;i++)
      {
    	  array[i]=sc.nextInt();
    	  if(array[i]<0)
    	  {
    		  System.out.println("Invalid input");
    		  System.exit(0);
    		  
    		  
    	  }
    	  
      }
      
      System.out.println("Product of first and third largest no is : "+FirstLargest(array,a));
	}
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    	  }
      }
	}

}
