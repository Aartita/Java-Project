package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		JUnitEx1 testCase = new JUnitEx1();
		int sq = testCase.suare(5);
		
		assertEquals(25,sq);//expected,output
	}

}
