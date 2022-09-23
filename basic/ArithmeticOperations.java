package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticOperations{
	public static void main(String[] args) throws NumberFormatException, IOException, java.io.IOException{
		// TODO Auto-generated method stub
    
    int a,b,c;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter two number :");
    a = Integer.parseInt(br.readLine());
    b = Integer.parseInt(br.readLine());
    //Scanner sc =new Scanner(System.in);
    c=a+b;
    System.out.println("Addition :" +c);
    
    System.out.println("Enter two number :");
    a = Integer.parseInt(br.readLine());
    b = Integer.parseInt(br.readLine());
    //Scanner sc =new Scanner(System.in);
    c=a-b;
    System.out.println("Substraction :" +c);
    
    System.out.println("Enter two number :");
    a = Integer.parseInt(br.readLine());
    b = Integer.parseInt(br.readLine());
    //Scanner sc =new Scanner(System.in);
    c=a*b;
    System.out.println("Multiplication :" +c);
    
    System.out.println("Enter two number :");
    a = Integer.parseInt(br.readLine());
    b = Integer.parseInt(br.readLine());
    //Scanner sc =new Scanner(System.in);
    c=a/b;
    System.out.println("Dicvision :" +c);
    
	}

}
