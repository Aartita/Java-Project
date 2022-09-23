package junit;

public class Employee {
	private String name;
    private double MonthlySalary;
    private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the monthlySalary
	 */
	public double getMonthlySalary() {
		return MonthlySalary;
	}
	/**
	 * @param monthlySalary the monthlySalary to set
	 */
	public void setMonthlySalary(double monthlySalary) {
		MonthlySalary = monthlySalary;
	}
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
	
	//calculate early salary 
	
	public double calcYearlySalary(Employee emp)
	{
		double yearlySalary = getMonthlySalary()*12;
		return yearlySalary;
	}
    
	
	//calculate appraisal for employee
	
	public double calcAppraisal(Employee emp)
	{
		double appraisal=0;
		
		if(getMonthlySalary()>30000)
		{
			appraisal = 1000;
		}
		else {
			appraisal =500;
		}
		return appraisal;
	}
    
}
