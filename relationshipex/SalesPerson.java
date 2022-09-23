package relationshipex;

public class SalesPerson extends Employe {
	int sales;
	float commission;
	float totalSalary;
	
	public SalesPerson()
	{
		super();
		sales=95;
	}

	public SalesPerson(int id, String name, MyDate dob, float workingDays, float perDay)
	
	{
		super(id,name,dob,workingDays,perDay);
		
	}
	
public void calculate()
	
	{
		super.calculate();
		
		if(sales>=95) {
			commission =20*salary/100;
		}
		else if(sales>=90)
		{
			commission =15*salary/100;
		}
		else if(sales>=80)
		{
			commission =10*salary/100;
		}
		else if(sales>=75)
		{
			commission =5*salary/100;
		}
		else {
			commission = 0;
		}
		totalSalary=commission+salary;
	}

public void display() {
	super.display();
	System.out.println("TotalSalary : "+totalSalary);
	System.out.println("commission : "+commission);
	
}
}

