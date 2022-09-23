package exceptionex;

public class CustomExceptionDemo {
	
	public static void validate(int age)throws InvalidAgeException
	{
		if(age>=18)
			System.out.println("Welcome to vote");
		else
			throw new InvalidAgeException("Age is not valid");
	}
	public static void main(String[] args)
	{
		try {
			validate(9);
			
		}catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("rest of code.....");
		
	}
}
