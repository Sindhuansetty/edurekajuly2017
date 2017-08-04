package co.edureka;

import java.util.Date;

// WebService
public class Conversion {

	// WebMethods
	public int mtrToCm(int mtr){
		int cm = mtr*100;
		return cm;
	}
	
	public int feetToInches(int feet){
		int in = feet*12;
		return in;
	}
	
	public String sayHello(String name){
		String hello = "Hello Dear, "+name+" Its "+new Date();
		return hello;
	}
	
	public String registerUser(String name, String email, String password, int age){
		// JDBC Code...
		// Insert the user in DB
		return name+" registered successfully...";
	}
	
}
