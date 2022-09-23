package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeTest {
	
	Employee emp =new Employee();

	@Test
	public void testCalculateSalary() {
       emp.setName("Kiran");
       emp.setAge(35);
       emp.setMonthlySalary(12000);
       
       
       double salary = emp.calcYearlySalary(emp);
       assertEquals(144000,salary,0.0);
	}
	
	

}
