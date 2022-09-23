package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesttApple {

	@Test //+ve test case
	public void testCorrectColor() {
		
		Apple apple = new Apple();
		apple.setColor("Green");
		assertTrue(apple.checkColor());
		
	}
	
	@Test //-ve test case
	public void testwrongColor() {
		
		Apple apple = new Apple();
		apple.setColor("bliue");
		assertFalse(apple.checkColor());
		
	}
	
	

}
