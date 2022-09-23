package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountATestTest {

	@Test
	void test() {
		JUnitEx1 testCase = new JUnitEx1();
		int ca = testCase.countA("Arya");
		
		assertEquals(2,ca);
		
		
		
		
	}

	
}
