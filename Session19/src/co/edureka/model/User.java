package co.edureka.model;

// Model or Bean or POJO
public class User {
	
	// Attributes
	String email;
	String password;
	String city;
	
	// Constructor
	public User(){
		
	}
	
	public User(String email, String password, String city) {
		this.email = email;
		this.password = password;
		this.city = city;
	}
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
