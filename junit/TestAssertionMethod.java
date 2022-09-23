package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertionMethod {

	@Test
	void testAssertions() {
		String str1 = new String("Raj");
		String str2 = new String("Raj");
		String str3 = "Welcome";
		String str4 ="Welcome";
		String str5 = null;
		
		
		int a = 10;
		int b = 10;
		
		//checks that 2 objects are equal
		assertEquals(str1,str2);
		
		//checks that condition is true
		assertTrue(a==b);
		
		//check that condition is true
		assertFalse(a>b);
		
		//check that 2 object references point to the same object
		
		assertSame(str3,str4);
		
		//check that 2 obj refeences not point to the same object
		
		assertNotSame(str1,str3);
		
		//check that obj is null
		assertNull(str5);
		
		//check that obj is not null
		
		assertNotNull(str4);
		
		String a1[] = {"one","two","three"};
		String a2[] = {"one","two","three"};
		
		
		//check that 2 arrays are eual or not 
		
		assertArrayEquals(a1,a2);
	}

}
