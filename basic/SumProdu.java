package basic;

public class SumProdu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 1,4,6,9,3,2};
	        int even = 0, odd=1 ;
	 
	        // Loop to find even, odd sum
	        for (int i = 0; i < a.length; i++) {
	            if (i % 2 == 0)
	                even += a[i];
	            else
	                odd *= a[i];
	        }
	 
	        System.out.println("Even index positions sum: " + even);
	        System.out.println("Odd index positions product: " + odd);
	    }
	
	}

