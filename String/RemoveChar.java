package String;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aArti";

		System.out.println("String after Removing 'a' = "+str.replace("a", ""));
		
		System.out.println("String after Removing First 'a' = "+str.replaceFirst("a", ""));

		System.out.println("String after replacing all small letters = "+str.replaceAll("([a-z])", ""));
	
	}
}
