package abstractionex;

abstract class Bank1
 {
	 public abstract void getBalance();
 }
 
 
   class BankA extends Bank1{
	   public void getBalance()
	   {
		   int b1 =100;
		   System.out.println("Balance are deposited in bankA is: "+b1);
	   }
	 
 }
   class BankB extends Bank1{
	   public void getBalance()
	   {
		   int b2 =150;
		   System.out.println("Balance are deposited in bankA is: "+b2);
	   }
	 
 }
   
   
   class BankC extends Bank1{
	   public void getBalance()
	   {
		   int b3 =200;
		   System.out.println("Balance are deposited in bankA is: "+b3);
	   }
	 
 }
   
   
public class CheckBalance {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		 Bank1 a,b,c;
		 a=new BankA();
		b=new BankB();
         c=new BankC();


              a.getBalance();
              b.getBalance();
              c.getBalance();
                    
	}	

	}


