package relationshipex;

public class Customer extends Person{
	
	String prodName;
	int quantity;
	int price,billAmount;
	
	public Customer()
	{
		super();
		prodName ="Telivision";
		quantity =24;
		price=3000;
		billAmount=3469;
		
	}
	
	public Customer(int id, String Name, MyDate dob, String prodName,int quantity,int price,int billAmount) {
		
		super(id,Name,dob);
		this.prodName=prodName;
		this.quantity=quantity;
		this.price=price;
		this.billAmount=billAmount;
		
		
	}
	
	public void calculate() {
		
		billAmount = price*quantity;
	}

	public void display() {
		super.display();
		System.out.println("ProductName : "+prodName);
		System.out.println("Quantity : "+quantity);
		System.out.println("Price : "+price);
		System.out.println("billAmount : "+billAmount);
			
		
		
	}

		
	}
