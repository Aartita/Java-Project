package abstractionex;

public class Honda extends Bike {
	
	public void run()
	{
		System.out.println("Running safely");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda h=new Honda();
		h.run();
		h.display();

	}

}
