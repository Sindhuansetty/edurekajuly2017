interface Inf1{
	void show();
	void fun();
	
	static void go(){
		System.out.println("This is go");
	}
}

interface Inf2{
	
	// For Interfaces static methods can have definition
	static void go(){
		System.out.println("This is go");
	}
	
	void hello(); // public abstract void hello();
}

// Error
/*interface Inf implements Inf1{
	
}*/

interface Inf3 extends Inf1,Inf2{ // Multiple Inheritance | Not Object to Object, this is Inf to Inf
	int i=10; // public static final int i = 10;
}

class InfImpl implements Inf3 { // Inf1,Inf2 { // Multiple Implementation
	
	public void show(){
		System.out.println("-=This is Show=-");
	}
	
	public void fun(){
		System.out.println("-=This is Fun=-");
	}
	
	public void hello(){
		System.out.println("-=This is Hello=-");
	}
	
	void bye(){
		System.out.println("-=This is Hello=-");
	}
}

public class InfDemo {

	public static void main(String[] args) {
		
		//Inf1 i1 = new Inf(); error
		
		//Inf1 iRef1 = new InfImpl(); // Reference Variable of Inf1 is pointing to the object of InfImpl which implements it
		//iRef1.show();
		//iRef1.fun();
		
		// iRef1.hello();  // Error
		
		Inf3 iRef3 = new InfImpl();
		//iRef3.show();
		//iRef3.fun();
		//iRef3.hello();
		
		// iRef3.bye(); Error
		
		// DownCasting
		InfImpl inRef = (InfImpl)iRef3;
		inRef.show();
		inRef.hello();
		inRef.fun();
		inRef.bye();
		
		Inf2.go(); // Interface is kind of Class Only Concept
		System.out.println(Inf3.i);
		
		//Errors
		//InfImpl.go();
		//inRef.go(); 

	}

}
