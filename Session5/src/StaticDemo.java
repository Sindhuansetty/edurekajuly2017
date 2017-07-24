// Non Static is the property of Object
// Static is the property of Class

// Object's Property can access the property of Class. But Vice Versa is not True

class Counter{
	
	// Attribute
	int count; 		   // Non static
	static int scount; // Static -> Property of Class
	
	// Methods
	Counter(){ // -> Property of Object
		count = 1;
		scount = 1; // -> Property of class can be accessed by property of object
	}
	
	void incrementCount(){
		count++;
		scount++; // -> Property of class can be accessed by property of object
	}
	
	// Non Static
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("scount is: "+scount); // -> Property of class can be accessed by property of object
	}
	
	// Static
	static void showSCount(){ //-> Property of class
		System.out.println("scount is: "+scount);
		//System.out.println("count is: "+count); // error | Property of object cannot be accessed by property of clas
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Counter c1 = new Counter(); // 1  1
		Counter c2 = new Counter(); // 1  1
		
		c1.incrementCount(); // 2   2
		c1.incrementCount(); // 3   3
		
		c2.incrementCount(); // 2   4
		c1.incrementCount(); // 4   5
		c2.incrementCount(); // 3   6
		c1.incrementCount(); // 5	7
		
		c1.showCount(); // 5   7
		c2.showCount(); // 3   7

	}

}
