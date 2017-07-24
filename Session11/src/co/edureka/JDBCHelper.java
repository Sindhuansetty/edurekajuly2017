package co.edureka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// JDBC Procedure goes here

public class JDBCHelper {
	
	Connection con;
	Statement stmt;
	
	// 1. Load the Driver
	public JDBCHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.err.println("Some Error: "+e);
		}
	}
	
	//2. Create a Connection
	public void openConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Created--");
			
		} catch (Exception e) {
			System.err.println("Some Error: "+e);
		}
	}
	
	//3. 4. Create the Statement and Execute it
	public void insertUser(User user){ // Reference as Input
		try {
			
			//3. Write SQL Statement
			String sql = "insert into tblUser values("+user.getUid()+",'"+user.getEmail()+"','"+user.getPassword()+"')";
			
			//4. Execute SQL Statement
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql); // Execute the SQL Statement
			System.out.println(user.getEmail()+ " inserted: "+i);
			
		} catch (Exception e) {
			System.err.println("Some Error: "+e);
		}
	}
	
	// 5. Close the Connection
	public void closeConnection(){
		try {
			//stmt.close();
			con.close();
			
			System.out.println("--Connection Closed--");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}

}
