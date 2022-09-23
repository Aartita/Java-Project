package classandobject;

import java.util.Scanner;

public class SimpleInterest {
	
	
	double amount;

	double intrest;

	int year;

	SimpleInterest()

	{

	double a = amount;

	double s_in = intrest;

	int y=year=5;

	double s_in1;

	}

	

	


	public  void inter()

	{

	double a,i,s_in;

	int y=5;

	Scanner sc=new Scanner(System.in);

	a=sc.nextDouble();

	i=sc.nextDouble();

	

	s_in=(a*i*y)/100;
	

	System.out.println("The simple interest is:"+s_in);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterest s=new SimpleInterest();
s.inter();
	}

}
