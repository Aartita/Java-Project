package abstractionex;

/*import java.util.Scanner;*/

abstract class Marks{
	


	public abstract void getPercentage();

        }



class A extends Marks{
	
	A(int m1,int m2,int m3)
	{
		m1=m1;
		m2=m2;
		m3=m3;
	}
	
	public void getPercentage()
	{
		int m1,m2,m3;
	float per;
	int total;
		
	/*	System.out.println("Enter the marks of student:");
		Scanner sc=new Scanner(System.in);
		int m1=sc.nextInt();

		int m2=sc.nextInt();
		int m3=sc.nextInt();*/
	    
		total=m1+m2+m3;
		per=total/3;
		System.out.println("The Total is:"+total);
	
		System.out.println("The percentage is:"+per);
	}
		
	
}



class B extends Marks{
	
	B(int m1,int m2,int m3,int m4)
	{
		m1=m1;
		m2=m2;
		m3=m3;
		m4=m4;
	}
	
	public void getPercentage()
	{
		int m1,m2 ,m3,m4;
		float per;
		int total;
		/*System.out.println("Enter the marks of student:");
		Scanner sc=new Scanner(System.in);
		int m1=sc.nextInt();

		int m2=sc.nextInt
		
		int m3=sc.nextInt();
	    int m4=sc.nextInt();*/
		total=m1+m2+m3+m4;
		per=total/4;
		
		System.out.println("The Total is:"+total);
	
		System.out.println("The percentage is:"+per);
	}
}
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	    
		
		
		Marks s,s1;
		A a=new A(67,98,78);
		B b=new B(47,89,78,69);
		
		a.getPercentage();
		b.getPercentage();
		
		
	}

}
