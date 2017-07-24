class Parent{
	
	// Attributes
	String fname;
	String lname;
	int money;
	
	static int vehicles; // property of class
	
	Parent(){
		fname = "John";
		lname = "Watson";
		money = 10000;
		vehicles = 2;
		System.out.println("Parent Object Constructed");
	}
	
	void showInfo(){
		System.out.println(fname+" "+lname+" has "+money+" money");
	}
	
	static void showVehicles(){ // property of class
		System.out.println("Vehicles are: "+vehicles);
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Object Constructed");
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		//Parent p = new Parent(); // When the object is created in the heap, Parent Constructor shall be executed
		
		// We are requesting to get a Child Object
		// Constructors are NOT INHERITED
		Child chRef = new Child(); // Run time env, shall create the object of Parent first and then inherit the data into child object.
		chRef.fname = "Jennie";
		/*chRef.lname = "Watson";
		chRef.money = 10000;*/
		
		chRef.showInfo();
		
		Child.showVehicles();

	}

}
