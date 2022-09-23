package employeemanagement;

public class Age {
	
	public int age;

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	boolean checkAge() {
		 if(getAge()<=18)
		 {
			 
			 return true;
		 }
		 else
		 {
		 return false;
	}
	
	
	
	}
}

	



