package basic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        Scanner sc=new Scanner(System.in);
        //BufferedReader br=new BufferedReeader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        num=sc.nextInt();
       // num=Integer.parseInt(br.readLine());
        if(num % 2 ==0)
        	System.out.println("The number is even");
        else
        	System.out.println("The number is odd");
	}

}
