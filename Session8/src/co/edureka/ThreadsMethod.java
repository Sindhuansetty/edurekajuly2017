package co.edureka;

class MyThread extends Thread{
	
	public void run() {
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000); // pause the execution of thread for 1 sec and thereafter resume back
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("==MyThread== "+i);
		}
	}
}

class YourThread implements Runnable{
	
	public void run() {
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000); // pause the execution of thread for 1 sec and thereafter resume back
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("**YourThread** "+i);
		}
	}
}

public class ThreadsMethod {

	public static void main(String[] args) {
		System.out.println("--Main Started--");
		
		
		MyThread mRef = new MyThread();
		
		Runnable r = new YourThread();
		Thread yRef = new Thread(r);
		
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		yRef.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		mRef.start();
		// Immediately after the start put the join 
		// join is a method which tells RTE to execute me first and let others wait
		try {
			mRef.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		yRef.start();
		
		yRef.setDaemon(true); // runs until JVM will not finish its execution
		
		yRef.yield(); // Dont Execute my jobs and execute jobs of others (Kind of a request)
		
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000); // pause the execution of thread for 1 sec and thereafter resume back
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("@@Main Thread@@ "+i);
		}
		
		mRef.setName("MyThread");
		yRef.setName("YourThread");
		Thread.currentThread().setName("Charlie");
		
		// Names of Thread
		System.out.println("mRef Name is: "+mRef.getName());
		System.out.println("yRef Name is: "+yRef.getName());
		System.out.println("Main Name is: "+Thread.currentThread().getName());
		
		// Priorty of Threads
		System.out.println("mRef Priority is: "+mRef.getPriority());
		System.out.println("yRef Priority is: "+yRef.getPriority());
		System.out.println("Main Priority is: "+Thread.currentThread().getPriority());
		
		//Thread.State.NEW // Access them in case of any requirement
		
		System.out.println("--Main Finished--");

	}

}
