class Father{
	
	Father(){
		System.out.println("Father is Constructed");
	}
	
	public void purchaseBike(){
		System.out.println("Lets Purchase Bajaj Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets Purchase Maruti");
	}
	
	void purchaseHome(){
		
	}
}

class Son extends Father{
	
	Son(){
		System.out.println("Son is Constructed");
	}
	
	// Access should be same or higher than the Parent
	// Re-Defining the same method of object
	public void purchaseBike(){ // Overriding | Signature should be same
		System.out.println("Lets Purchase Royal Enfield");
	}
	
	// Re-Defining the same method of class
	static void purchaseCar(){ // Hiding | Signature should be same
		System.out.println("Lets Purchase Honda");
	}
	
	void purchaseHome(){
		
	}
}


class AndroidOS{
	void placeCall(){
		System.out.println("Place Call through Dial Button on Screen");
	}
}

class SamsungOS extends AndroidOS{
	/*void placeCall(){
		System.out.println("Place Call through Speech in Phone");
	}*/
	void placeCall(int i){
		System.out.println("Place Call through Speech in Phone");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Son sRef = new Son();
		sRef.purchaseBike();

		Son.purchaseCar();
		
	}

}
//4 Access Modifiers
//1. private | Least Access
//2. default
//3. protected
//4. public  | Most Access

