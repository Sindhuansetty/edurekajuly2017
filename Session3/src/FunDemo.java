import java.util.Scanner; // Scanner is a Class which we are importing

public class FunDemo {

	/*ReturnType FunName(Arguments with primitives or non primitives(reference types) as inputs){
		Definition
	}*/
	
	// No Ack, No Input
	
	// NON STATIC
	void sayHello1(){
		System.out.println("Be Exceptional !!");
	}
	
	// STATIC
	static void sayHello2(){
		System.out.println("Being Exceptional is Rule to Success...");
	}
	
	// Methods are typically a logical block which shall perform a meaningful task
	
	void addNums1(int a, int b){
		int c = a+b;
		System.out.println("c is: "+c);
	}
	
	static void addNums2(int a, int b){
		int c = a+b;
		System.out.println("c is: "+c);
	}
	
	int calculateArea(int l, int b){
		int a = l*b;
		return a; // sending an ack. should be the last statement
	}
	
	//1. Having Values as Inputs
	void printNum(int num){ // Primitive Type
		System.out.println("num is: "+num);
	}
	
	//2. Having Reference as Inputs
	void printArray(int[] arr){ // Reference Type
		System.out.println("arr is: "+arr);
		for(int elem : arr){
			System.out.println(elem);
		}
	}
	
	static void calculateSquare(){
		
		// Utility to take input from user
		Scanner scan = new Scanner(System.in);// To read from the Console
		System.out.println("Enter a Number");
		int num = scan.nextInt(); // nextInt is a pre defined function in the scanner class
		int result = num*num;
		System.out.println("Square of "+num+" is: "+result);
		
	}
	
	
	public static void main(String[] args) {
		
		//sayHello1(); // error
		
		// For Static Methods call them directly
		sayHello2(); // Execution of static sayHello
		sayHello2(); // Call or Invocation
		
		// For Non Static methods, create an Object
		FunDemo fRef = new FunDemo(); // Object for FunDemo
		fRef.sayHello1();
		
		addNums2(10, 20);
		addNums2(100, 200);
		fRef.addNums1(30, 40);
		
		int result = fRef.calculateArea(10, 20);
		System.out.println("result is: "+result);
		
		int n = 100;
		int[] a = {10,20,30,40,50};
		
		System.out.println("n is: "+n);
		System.out.println("a is: "+a); // address
		
		fRef.printNum(n); // While Calling we are passing value
		fRef.printArray(a); // While Calling we are passing reference
		
		calculateSquare();
	}

}
