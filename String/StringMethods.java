package String;

public class StringMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Welcome",s2="Hello",s3="welcome",s4="  Welcome to Edubridge  ";
		System.out.println(s1.charAt(3));
		System.out.println(s2.length());
		System.out.println(s1.substring(3));
		System.out.println(s1.contains("e"));
		System.out.println(s1.contains("x"));
		System.out.println(s3.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('e',2));
		System.out.println(s2.concat("Aarti"));
		System.out.println(s1.replace('e', 'a'));
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s4.length());
		System.out.println(s4=s4.trim());
		System.out.println(s4.length());
		
		String s5="This is example of split.";
		String splitedStrings[]=s5.split("");
		
	for(int i=0;i<splitedStrings.length;i++)
		{
			System.out.println(splitedStrings[i]);
		}
		}

}
