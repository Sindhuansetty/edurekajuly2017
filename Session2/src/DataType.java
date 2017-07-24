public class DataType {

	// whatever we write in the main method, it is executed one by one i.e. in a sequence
	public static void main(String[] args) {
		
		// public is an access modifier
		// static is a keyword which makes a guy as a property of class
		// void is a return type
		// main is the name of method and is executed as in main thread
		// input to the main is an array of Strings
		
		// int is a data type
		int i = 10; // i is a variable which is holding a value 10. value 10 is called literal.
		// Storage Container

		int j = 10;
		
		//1. Data: For any App data is the central important part.
		//   eg: Uber App for Cab Reservation
		//	 location : source, destinition
		//   type     : Go, X
		
		//2. Data can be represented in Storage Containers
		//	 Single Value -> Primitive Types 
		//   Multi Value  -> String, Arrays(Homogeneous) , Objects (Hetrogeneous)
		
		//int k = 10,20,2.2; error 
		//int k = 10; // k can store only a Single Value
		
		byte b = (byte)130; // b is a 8 bit container but 20 is a literal stored in 32 bits in Constant Pool
		System.out.println("b is: "+b);
		
		int l = 20;
		byte c = (byte)l; // put a cast 
		
		// Any Integer Literal in the constant pool is stored in 32 bits
		
		long m = 100; // long -> 64 bits | 100 -> 32 bits
		long n = 100l; // long -> 64 bits | 100 -> 64 bits
		
		//float f = 2.2; // f is 32 bits | 2.2 is 64 bits
		float f = 2.2f; // f is 32 bits | 2.2 is 32 bits
		
		double d = 2.2; // both are 64bits
		float g = (float)d; // put a cast
		
		// Uniocde
		char ch = 'A'; // char literals are stored in single quotes
		char rupee = '\u20b9';
		System.out.println("ch is: "+ch);
		System.out.println("rupee is: "+rupee);
		
		boolean bool = true;
		bool = false;
		
		System.out.println("bool is: "+bool);
		
		int num1 = 10;
		int num2 = 3;
		
		int num3 = num1 % num2;
		System.out.println("num3 is: "+num3);
	}

}
