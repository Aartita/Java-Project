package relationshipex;

public class Address {
   String addrLine;
   String street,city,state;
   int pincode;

   
   
	   public Address()
		{
			addrLine="hadapsar";
			street="Solapur Pune Highway";
			city="Hadapsar Pune";
			state="Maharashtra";
			pincode=412305;
		}
		public Address(String addrLine,String street,String city,String state, int pincode)
		{
			this.addrLine=addrLine;
			this.street=street;
			this.city=city;
			this.state=state;
			this.pincode=pincode;
		}
		
		
		
	
		
		public void display()
		{
			System.out.println("AddrLine :"+addrLine);
			System.out.println("Street :"+street);
			System.out.println("City :"+city);
			System.out.println("State :"+state);
			System.out.println("Pincode :"+pincode);
			
		}
   }

