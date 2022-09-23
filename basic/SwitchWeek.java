package basic;

import java.util.Scanner;

public class SwitchWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day :");
		int ch=sc.nextInt();
		
		
		switch(ch) {
		case 1:System.out.println("It's Monday ");
		break;
		
		case 2:System.out.println("It's Tuesday ");
		break;
		case 3:System.out.println("It's Wednesday ");
		break;
		case 4:System.out.println("It's Thirsday ");
		break;
		case 5:System.out.println("It's Friday");
		break;
		case 6:System.out.println("It's Saturday");
		break;
		case 7:System.out.println("It's Sunday ");
		break;
		default:System.out.println("Invalid");
		
		
		}

	}

}
