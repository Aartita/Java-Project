package trickeyProgram;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int n;
System.out.println("Enter the case:" );
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
switch(n) {
     
case 1:System.out.println("KFC");
break;

case 2:System.out.println("MAC-D");
break;

default:System.out.println("no any restaurant");
}

	}

}
