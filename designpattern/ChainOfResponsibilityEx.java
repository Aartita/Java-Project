package designpattern;

abstract class Logger
{
	public static int OUTPUTINFO=1;
	public static int ERRORINFO=2;
	public static int DEBUGINFO=3;
	int levels;
	Logger nextLevelLogger;
	public Logger getNextLevelLogger() {
		return nextLevelLogger;
		
	}
	
	
	
}
public class ChainOfResponsibilityEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

