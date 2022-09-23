package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNegative {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        int num;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        num=Integer.parseInt(br.readLine());
        if(num>0)
        {
        	System.out.println("Number is Positive");
        }
        else if(num<0) {
        	System.out.println("Number is Negative");
        }
        else
        {
        	System.out.println("Number is Zero");
        }
	}

}
