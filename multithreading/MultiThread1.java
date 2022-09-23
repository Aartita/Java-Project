package multithreading;

public class MultiThread1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("exeducting thread : "+getName());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiThread1 thread1 = new MultiThread1();
		thread1.setName("Thread1");
		thread1.start();
		
		
		MultiThread1 thread2 = new MultiThread1();
		thread2.setName("Thread2");
		thread2.start();
		
		
		System.out.println("Hello");
		
		
		
		

	}

}
