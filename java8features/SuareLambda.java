package java8features;

@FunctionalInterface
interface Square
{
	int sq(int a);
	
}

@FunctionalInterface
interface Circle
{
	float circle(int r);
	
}
@FunctionalInterface
interface SimpleInterest
{
	float simpleInterest(float p,float n,float r);
	
}
@FunctionalInterface
interface Percentage
{
 double percentage(double m1,double m2,double m3);
	
}

public class SuareLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Square s1 = a-> (a*a); 
		Circle c =r->{
			return 3.14f*r*r;
		};
			
		System.out.println("square: "+s1.sq(7));
		System.out.println("circle: "+c.circle(5));
		
		SimpleInterest s2 = (float p,float n,float r) -> {
			
			return p*n*r/10;
		};
		
		System.out.println("Simple Interest is:"+s2.simpleInterest(3,4,8));
		
		Percentage p1 = (double m1,double m2,double m3) -> {
		
		double a=m1+m2+m3;
		return a*100/300;
		

	};
	
	System.out.println("Percentage is : "+p1.percentage(76,49,98));

}
}
