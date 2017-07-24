package co.edureka;

class Table{
	//void printTable(int num){
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void fun(){
		
	}
}

class Thread1 extends Thread{
	
	Table t;
	
	public Thread1(Table u) {
		t = u;
	}
	
	public void run() {
		synchronized (t) {
			t.printTable(5);
		}
	}
	
}

class Thread2 extends Thread{
	
	Table t;
	
	public Thread2(Table u) {
		t = u;
	}
	
	public void run() {
		synchronized (t) { // -> Lock Acquired Here for the Entire Object of t
			t.printTable(7);
			//t.fun();
		} // -> Lock Released Here for the Object of t
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		
		Table t = new Table(); // Created the Object of Table
	
		// Thread1 and Thread2 are going to use the same object of Table pointed by t
		Thread1 th1 = new Thread1(t);
		Thread2 th2 = new Thread2(t);
		
		
		// Multiple Threads are running parallely/concurrently. -> Asynchronous Behavior
		
		
		// Multiple Threads are running parallely/concurrently. -> Synchronous Behavior (If printTable is synchornized)
		th1.start();
		th2.start();
		
		
		
		// Once we have marked the method printTable of Table as synchronized
		// Their is always a race between Threads. Who shall be executed First.
		// Who so ever wins, will execute printTable.
		// if prinTable is marked synchronized, then a lock shall be acquired and will be released once execution is finished
	}

}
