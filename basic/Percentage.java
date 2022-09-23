package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percentage {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        int marathi,hindi,english,per,a;
       BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the marks in marathi sub");
       marathi=Integer.parseInt(br.readLine());
       System.out.println("Enter the marks in hindi sub");
       hindi=Integer.parseInt(br.readLine());
       System.out.println("Enter the marks in english sub");
       english=Integer.parseInt(br.readLine());
       a=marathi+hindi+english;
       per=(a*100)/300;
       
       System.out.println("Percentage is" +per+ "%");
       
       }

}
