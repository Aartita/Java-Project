package relationshipex;

public class Discount extends Customer{
	int discount;
	int finalbill;
	int billAmount;
	
     public	Discount()
     {
    	 super();
    	 billAmount=20000;
    	 
     }
     
     public Discount(int id, String Name, MyDate dob, String prodName,int quantity,int price,int billAmount,int discount,int finalbill)
     {
    	 super(id,Name,dob,prodName,quantity,price,billAmount);
    	 this.discount=discount;
    	 this.finalbill=finalbill;
     }
     
     public void calculate(){
    	 
    	 if(billAmount>=20000)
    	 {
    		 discount=15*billAmount/100;
    		 
    	 }
    	 else if (  billAmount>=15000)
    	 {
    		 discount=10*billAmount/100;
    		 
    	 }
    	 else if(billAmount>=10000)
    	 {
    		 discount=7*billAmount/100;
    		 
    	 }
    	 
    	 else if(billAmount<=10000)
    	 {
    		 discount=15*billAmount/100;
    		 
    	 }
    	 
    	 
    	 
     }
     
}
