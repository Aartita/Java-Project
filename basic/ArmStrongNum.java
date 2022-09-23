package basic;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,og,r,count=0,sum=0,p;		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		og=n;
		while(n>0)
		{
			r=n%10;
			p= Math.pow(count, p);
			sum=sum+p;
			n=n/10;
		}
		System.out.println("count");
		if(og==sum)
		{
			System.out.println("The number is Armstrong");
		}
		else
		{
			System.out.println("The number is not Armstrong");
		}
	}

}
