package samplewebapplication;

public class DeadlockDemo extends Thread{
	
	static Thread mainThread;
	
	@Override
	public void run() {
		System.out.println("Child thread waiting for main thread");
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			System.out.println("Child thtread execution completed");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		DeadlockDemo dc = new DeadlockDemo();
		DeadlockDemo.mainThread = Thread.currentThread();
		dc.start();
		System.out.println("Main thread waiting for child thread");
		dc.join();
	}

}
