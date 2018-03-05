package samplewebapplication;

public class StarvationThreadDemo extends Thread {
	static int threadCount =1;
	
	@Override
	public void run() {
		
		System.out.println(threadCount +" has started execution");
		
		System.out.println("Child thread execution completed");
		// TODO Auto-generated method stub
		threadCount ++;
	}

	public static void main(String [] args) {
		
		StarvationThreadDemo sc = new StarvationThreadDemo();
		sc.setPriority(10);
		StarvationThreadDemo sc1 = new StarvationThreadDemo();
		sc1.setPriority(9);
		StarvationThreadDemo sc2 = new StarvationThreadDemo();
		sc2.setPriority(8);
		StarvationThreadDemo sc3 = new StarvationThreadDemo();
		sc3.setPriority(7);
		StarvationThreadDemo sc4 = new StarvationThreadDemo();
		sc4.setPriority(6);
		StarvationThreadDemo sc5 = new StarvationThreadDemo();
		sc5.setPriority(5);
		
		sc.start();
		sc1.start();
		sc2.start();
		sc3.start();
		sc4.start();
		sc5.start();
		
		 System.out.println("Main thread execution completes");
		
		
	}
}
