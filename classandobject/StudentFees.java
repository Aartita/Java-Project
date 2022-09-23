package classandobject;

import java.util.Scanner;

public class StudentFees {
	
	
      int fee;
     public int calculateFee(int mark,int fees)
     {
    	 if(mark>=90) {
           fee = fees -(fees*50);
    	 }
    	 
          else if(mark>80 && mark<=90)
          {
        	  fee = fees -(fees*25);
          }
          else if(mark>=70 && mark<=80)
          {
        	  fee = fees -(fees*10);
          }
          else
          {
        	  fee = fees;
          }
          return fee;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fee;
		System.out.println("Enter the fees of student: ");
		Scanner sc = new Scanner(System.in);
		int fees=sc.nextInt();
		if(fees>32767 || fees<0)
		{
			
		 System.out.println("Invalid fee");
		 System.exit(0);
		}
		
		
		System.out.println("Enter the mark of student: ");
		//Scanner sc = new Scanner(System.in);
		int mark=sc.nextInt();
		if(mark>100 || mark<0)
		{
			System.out.println("Invalid mark");
			System.exit(0);
		}		
		
	

	if(mark<0 ||  fees<0)
	{
		System.out.println("Invalid input");
		System.exit(0);
	}

	StudentFees sf=new StudentFees();
	sf.calculateFee(mark, fees);

}
	
}