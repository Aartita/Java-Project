package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		stack.add("Jasmine");
		stack.add("Rose");
		stack.add("Lotus");
		stack.add("Lilly");
		stack.add("Lotus");
		stack.add(null);
		
		
		System.out.println(stack);
		
		System.out.println("removing element :" +stack.pop());
		
		System.out.println(stack);
		
		System.out.println("searching element :" +stack.search("Rose"));
		
		System.out.println("searching element :" +stack.search("Mogra"));
	}

}
