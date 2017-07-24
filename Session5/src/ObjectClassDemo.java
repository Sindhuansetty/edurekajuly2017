// Create a textual representation of an Object. Do it by writing a class
class User{
	
	// Attributes or State
	String name;
	private String phone;
	private String email;
	int age;
	String address;
	char gender;

	// Method or Behavior
	
	// Setters and Getters
	void setPhone(String p){
		phone = p;
	}
	
	String getPhone(){
		return phone;
	}
	
	void setEmail(String e){
		email = e;
	}
	
	String getEmail(){
		return email;
	}
	
}


public class ObjectClassDemo {

	public static void main(String[] args) {
		
		// Create the Objects
		
		// Object Construction Statement
		User uRef1 = new User();
		// uRef1 is NOT an Object. Its a reference variable
		// new is an operator which reads the class and creates an object dynamically i.e. at run time in the heap
		// address of the object constructed in the heap area shall be returned by new and is stored in reference variable.

		User uRef2 = new User();
		
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		
		// Write the data in Object
		uRef1.name = "John";
		//uRef1.phone = "99999999";
		//uRef1.email = "john@example.com";
		
		uRef1.setPhone("99999999");
		uRef1.setEmail("john@example.com");
		
		uRef1.age = 20;
		uRef1.address = "Redwood Shores";
		uRef1.gender = 'M';
		
		uRef2.name = "Jennie";
		//uRef2.phone = "88888888";
		//uRef2.email = "jennie@example.com";
		
		uRef2.setPhone("88888888");
		uRef2.setEmail("jennie@example.com");
		
		uRef2.age = 22;
		uRef2.address = "Southern Shores";
		uRef2.gender = 'F';
		
		// Read the data from Object
		System.out.println("User1 Details:");
		//System.out.println(uRef1.name+" - "+uRef1.gender+" - "+uRef1.email);
		System.out.println(uRef1.name+" - "+uRef1.gender+" - "+uRef1.getEmail());
		
		System.out.println("---------------------");
		
		System.out.println("User2 Details:");
		//System.out.println(uRef2.name+" - "+uRef2.gender+" - "+uRef2.email);
		System.out.println(uRef2.name+" - "+uRef2.gender+" - "+uRef2.getEmail());
		
		
	}

}
