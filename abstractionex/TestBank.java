package abstractionex;

import java.util.Scanner;

abstract class Bank
{
	public abstract float getRateofInterest();
}
    class SBI extends Bank{
    	
	public  float getRateofInterest()
	{
		return 6.4f;
		
	}
}

    class ICICI extends Bank{
    	
    	public  float getRateofInterest()
    	{
    		return 7.4f;
    		
    	}
    }
public class TestBank {
public void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter principle amount and no .of years: ");
  float Amount =sc.nextFloat();
  float n=sc.nextFloat();
  
  
  Bank b,b1;
  b=new SBI();
b1=new ICICI();

float rsbi =b.getRateofInterest();
float rIcici= b1.getRateofInterest();



}









System.out.println("Simple Interest for SBI: "+(Amount*n*rsbi/100));

System.out.println("Simple Interest for ICICI: "+(Amount*n*rIcici)/100));

  
}
	
}

