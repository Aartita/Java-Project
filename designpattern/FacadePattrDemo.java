package designpattern;



interface MobileShop{
	public void modeleNo();
	public void price();
	
}

class IPhone implements MobileShop{

	@Override
	public void modeleNo() {
		// TODO Auto-generated method stub
		System.out.println("IPhone");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.65000");
	}
	
}

class Samsung implements MobileShop
{

	@Override
	public void modeleNo() {
		// TODO Auto-generated method stub
		System.out.println("Samsung Galaxy");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs.40000");
		
	}
	class Blackberry implements MobileShop
	{

		@Override
		public void modeleNo() {
			// TODO Auto-generated method stub
			System.out.println("Blackberry z10");
			
		}

		@Override
		public void price() {
			// TODO Auto-generated method stub
			System.out.println("Rs.450000");
			
		}
		
	}
	
	class ShopKeepper{
		private MobileShop iphone;
		private MobileShop samsung;
		private MobileShop blackberry;
		
		public ShopKeepper() {
			iphone  = new IPhone();
			samsung = new Samsung();
			blackberry =new Blackberry();
		}
		
		public void iphoneSale() {
			iphone.modeleNo();
			iphone.price();
			
		}
	}
	
	
}
public class FacadePattrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
