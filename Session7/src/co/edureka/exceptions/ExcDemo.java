package co.edureka.exceptions;

class Point{
	int x;
	int y;
	
	Point(){
		x = 1;
		y = 1;
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+" - "+y);
	}
}

public class ExcDemo {

	public static void main(String[] args) {
		
		System.out.println("==Main Started==");
		
		Point p1 = null; // p1 is null
		//p1 = new Point(); // We created a reference variable but we didnt create an object
		//p1.showPoint(); // access the method of an object to which p1 points
		
		int[] arr = {10,20,30,40,50};
		// Java is Robust. Errors at Runtime shall be handled
		try{
			System.out.println("arr[3] is: "+arr[3]);
			
			try{
				int a = 10;
				int b = 0;
				int c = a/b;
				System.out.println("c is: "+c);
			}catch(Exception e){
				System.out.println("Exception is: "+e);
			}
		}/*catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("Some Exception: "+ai);
		}catch(ArithmeticException ae){
			System.out.println("Some Exception: "+ae);
		}*/catch(Exception e){ // ref variable e can point to any child object of exception (RTP)
			System.out.println("Exception is: "+e);
			//e.printStackTrace(); // Debug Mode
		}finally{
			System.out.println("Must Be Executed");
		}
		
		
		
		System.out.println("==Main Finished==");
		
	}

}
