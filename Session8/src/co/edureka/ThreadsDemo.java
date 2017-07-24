package co.edureka;

class DownloadTask{
	
	int size;
	
	DownloadTask(int s){
		size = s;
	}
	
	void downloadFile(){
		for(int i=1;i<=size;i++){
			System.out.println("Downloading by Task.. "+i);
		}
	}
}

class DownloadThread extends Thread{
	
	int size;
	
	DownloadThread(int s){
		size = s;
	}
	
	void doSomething(){
		
	}
	
	public void run(){ // Overrided Method
		for(int i=1;i<=size;i++){
			System.out.println("==Downloading by Thread== "+i);
		}
		
		//doSomething();
	}
}

/*class DownloadThread implements Runnable{
	
	int size;
	
	DownloadThread(int s){
		size = s;
	}
	
	void doSomething(){
		
	}
	
	public void run(){ // Overrided Method
		for(int i=1;i<=size;i++){
			System.out.println("==Downloading by Thread== "+i);
		}
		
		//doSomething();
	}
}*/

class A{
	
}

// If we wish to make use of B as a Thread and it is already inheriting some class. Usee Runnable.
class B extends A implements Runnable{ //,Thread{ // Multiple extension is not allowed
	public void run(){
		
	}
}


public class ThreadsDemo {

	// Writing Instructions in Main Method, are the Jobs which shall be executed in a sequence(one after another)
	// Main Thread
	public static void main(String[] args) {
		System.out.println("--Main Started--"); // J1
		
		
		//DownloadTask dtRef = new DownloadTask(10);
		//dtRef.downloadFile(); // -> Job which can take time
		// Instructions below shall not be executed until execute method has finished its execution
		// And in case file size is large, main thread shall be blocked
		
		// Replace DownloadTask with DownloadThread
		DownloadThread dtRef = new DownloadThread(10);
		dtRef.start(); // Execute start Method, which internally shall call the run method. (State management)
		
		
		//Runnable r = new DownloadThread(10); // RTP
		//Thread th = new Thread(r);
		//th.start();
		
		int a = 10;
		int b = 3;
		int c = a/b;
		System.out.println("c is: "+c);
		
		
		for(int i=1;i<=10;i++){
			System.out.println("**Downloading by Main** "+i);
		}
		
		System.out.println("--Main Finished--"); // Jn

	}

}
