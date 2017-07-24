package co.edureka;

class Message{
	String msg = "NA";
	
	void writeMessage(){
		msg = "Search the Candle, rather than cursing the darkness!!";
		System.out.println("--Message Written--");
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
}

class ReaderThread extends Thread{
	
	Message m;
	
	public ReaderThread(Message n) {
		m = n;
	}
	
	public void run() {
		synchronized (m) { //-> Locking here
			
			try {
				m.wait(); // Do not execute below instruction until you are notified
				//m.wait(1000); // waiting to be notified in 1000 msecs else i will resume the execution
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}
}

class WriterThread extends Thread{
	
	Message m;
	
	public WriterThread(Message n) {
		m = n;
	}
	
	public void run() {
		synchronized (m) { //-> Locking here
			m.writeMessage();
			//m.notify(); // -> notify the waiting thread for m
			m.notifyAll(); // -> notify all the waiting threads for m
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message m = new Message(); // Single Object of Message Pointed by m in the memory
//		m.readMessage();
//		m.writeMessage();
//		m.readMessage();
		
		ReaderThread rt1 = new ReaderThread(m);
		ReaderThread rt2 = new ReaderThread(m);
		WriterThread wt1 = new WriterThread(m);
		
		rt1.start();
		rt2.start();
		wt1.start();

	}

}
