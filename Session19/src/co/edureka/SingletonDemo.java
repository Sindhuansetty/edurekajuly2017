package co.edureka;

// SingleTon
class Connection{
	
	static private Connection c = new Connection();
	
	// No one outside this class can create the object of this class
	private Connection() {
		System.out.println("--Connection Created--");
	}
	
	static Connection getConnetion(){
		return c;
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		
		//Connection c1 = new Connection();
		//Connection c2 = new Connection();
		
		//System.out.println("c1 is "+c1);
		//System.out.println("c2 is "+c2);
		
		Connection c1 = Connection.getConnetion();
		Connection c2 = Connection.getConnetion();
		
		System.out.println("c1 is "+c1);
		System.out.println("c2 is "+c2);
		
	}

}
