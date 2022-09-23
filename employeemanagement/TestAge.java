package employeemanagement;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class TestAge {

			
			
			@Test //+ve test case
			public void testCorrectAge() {
				
				Age age = new Age();
				age.setAge(18);
				assertTrue(age.checkAge());
				
			}
		
			
			@Test //-ve test case
			public void testwrongAge() {
				
				Age age = new Age();
				age.setAge(21);
				assertFalse(age.checkAge());
				
			}

		
	}



