package basic;

public class ArrayHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method 
int a[]={12,4,9,3,16,10,15};
int max =a[0];

for(int i=1; i<a.length;i++)
{
	if(a[i]>max)
		max=a[i];
}

System.out.println("Highest:" +max);

}
}
