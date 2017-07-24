package co.edureka;

class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Inner Class or Nested Class
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
}


class DBOperations{
	
	// DB I/U/R/D
	void insertRecord(){
		
	}
	
	void deleteRecord(){
		
	}
	
	// To Create Tables in DB or Update Tables in DB
	class DBHelper{
		void createTable(){
			
		}
		//...
	}
}


public class NestedClass {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();

	}

}
