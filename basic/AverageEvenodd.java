package basic;

public class AverageEvenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={14,43,59,68,71,86};            
		int oddSum=0,evenSum=0,evenCount=0,oddCount=0;  
		 
		for(int i=0; i<6; i++){    
		if(a[i]%2==0){            
		evenSum=evenSum+a[i];
		evenCount++;
		}
		else{                    
		oddSum=oddSum+a[i];
		oddCount++;
		}
		}
		double avgOdd=oddSum/oddCount; 
		double avgEven=evenSum/evenCount;
		System.out.println("\nAverage of even numbers are: "+avgEven);   
		System.out.println("\nAverage of odd numbers are: "+avgOdd);

	}

}
