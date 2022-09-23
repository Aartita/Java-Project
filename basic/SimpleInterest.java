package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
       int p,n,r,a;
       //Scanner sc=new Scanner(System.in);
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the principle");
       p=Integer.parseInt(br.readLine());
       System.out.println("Enter the rate");
       r=Integer.parseInt(br.readLine());
       System.out.println("Enter the duration");
       n=Integer.parseInt(br.readLine());
       
       a=p*n*r/100;
       System.out.println("Simple interest :" +a);
	}

}
