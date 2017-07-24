// Homogeneous in Nature
class Rider{

	// Attributes
	String name;
	String phone;
	String email;
	String source;
	String destinition;
	
	// Constructor, is a special method, no return type, same name as of class
	
	// If we create a constructor compiler will not create it 
	Rider(){
		name = "NA";
		source = "ABC";
		destinition = "XYZ";
	}
	
	Rider(String n, String s, String d){
		name = n;
		source = s;
		destinition = d;
	}
	
	// Created by Compiler if you dont create 
	/*Rider(){
		name = null;
		source = null;
		destinition = null;
	}*/
	
	void showRider(){
		System.out.println("Rider "+name+" wants to go from "+source+" to the "+destinition);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Rider ridRef1 = new Rider();
		Rider ridRef2 = new Rider();
		Rider ridRef3 = new Rider("Jennie","Eastern Shores","Southern Shores");
				
		ridRef1.name = "John";
		ridRef1.source = "Southern Shores";
		ridRef1.destinition = "Eastern Shores";
		
		ridRef1.showRider();
		ridRef2.showRider(); // didnt write the data in object but we are reading the data
		ridRef3.showRider();
		ridRef3.showRider();
		
	}

}
