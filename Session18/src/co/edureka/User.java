package co.edureka;

public class User {

	// Attributes
	String email;
	String password;

	// Getters and Setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Business Logic to register a user
	public void registerUser(int type, String city){
		System.out.println("User Registration into table started....");
		
		//... DB Code.. to insert a user in DB
		try {
			Thread.sleep(2000); // Assuming it will take 2 secs to insert the record
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Registered the Email "+email+" with password "+password);
		System.out.println("User Registration into table finished....");
	}
	
}
