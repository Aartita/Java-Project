package basic;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n,sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of  n");
		n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			
			sum = i*i*i;
			
			System.out.println(sum);
			
			
		}

	      }
	}


