package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogin {

	@Test
	void testValidationCorrect() {
		Login login = new Login();
		login.setUsername("admin");
		login.setPassword("admin123");
		assertTrue(login.checkLogin());
	}
	
	@Test
	void testValidationWrong() {
		Login login = new Login();
		login.setUsername("admin1");
		login.setPassword("admin1234");
		assertFalse(login.checkLogin());
	}
	

}
