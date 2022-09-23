package relationshipex;

public class StaticMethodEx {
	
	public static void add(int a,int b)
	{
		System.out.println("Add : "+(a+b));
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("Add : "+(a+b+c));
	}
	static {
		System.out.println("It will call before main()");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodEx.add(12,23);
		StaticMethodEx.add(12,23,34);
		

	}

}
