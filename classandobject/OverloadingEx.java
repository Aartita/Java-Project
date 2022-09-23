package classandobject;

public class OverloadingEx {
	
	public void add(int p,int q,int r)
	{
		System.out.println("Add of numeric values:  " +(p+q+r));
	}
	
	public float add(float x,float y)
	{
	System.out.println("Add of float values: " +(x+y));
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingEx o =new OverloadingEx();
		o.add(3.6f, 4.7f);
		o.add(12,7,25);
		

	}

}
