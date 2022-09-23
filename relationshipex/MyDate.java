package relationshipex;

public class MyDate {

	int dd,mm,yy;
	
	public MyDate()
	{
		dd=12;
		mm=4;
		yy=1992;
	}
	public MyDate(int dd,int mm,int yy)
	{
		this.dd=dd;//dd=22
		this.mm=mm;//mm=11
		this.yy=yy;//yy=199
	}
	
	public void display()
	{
		System.out.println("Date :"+dd+"/"+mm+"/"+yy); 
	}
}
