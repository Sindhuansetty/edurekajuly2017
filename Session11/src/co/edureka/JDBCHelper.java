package co.edureka;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// JDBC Procedure goes here

public class JDBCHelper {
	
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt;
	
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
			// Prefer for a smaller structure
			//3. Write SQL Statement
			//String sql = "insert into tblUser values("+user.getUid()+",'"+user.getEmail()+"','"+user.getPassword()+"')";
			
			// Prefer for a larger structure
			String sql = "insert into tblUser values(?,?,?)"; // ? is a wild card
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql); // Execute the SQL Statement
			
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, user.getUid());
			pStmt.setString(2, user.getEmail());
			pStmt.setString(3, user.getPassword());
			
			int i = pStmt.executeUpdate(); // Not passing any SQL Command here
			
			System.out.println(user.getEmail()+ " inserted: "+i);
			
		} catch (Exception e) {
			System.err.println("Some Error: "+e);
		}
	}
	
	public void deleteUser(int id){ // Reference as Input
		try {
			//3. Write SQL Statement
			
			String sql = "delete from tblUser where uid = ?"; // ? is a wild card
			
			//4. Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, id);
			
			int i = pStmt.executeUpdate(); // Not passing any SQL Command here
			
			if(i>0)
				System.out.println(id+ " deleted..");
			else
				System.out.println(id+ " not deleted..");	
			
		} catch (Exception e) {
			System.err.println("Some Error: "+e);
		}
	}
	
	public void updateUser(User user){ // Reference as Input
		try {
			//3. Write SQL Statement
			
			String sql = "update tblUser set email = ?, password = ? where uid = ?"; // ? is a wild card
			
			//4. Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.getEmail());
			pStmt.setString(2, user.getPassword());
			pStmt.setInt(3, user.getUid());
			
			int i = pStmt.executeUpdate(); // Not passing any SQL Command here
			
			if(i>0)
				System.out.println("Id: "+user.getUid()+ " updated..");
			else
				System.out.println("Id: "+user.getUid()+ " not updated..");	
			
		} catch (Exception e) {
			System.err.println("Some Error: "+e);
		}
	}
	
	ArrayList<User> retrieveAll(){
		
		ArrayList<User> userList = new ArrayList<User>();
		
		try {
			//3. Write SQL Statement
			
			String sql = "select * from tblUser";
			//String sql = "select * from tblUser where uid = ?"; // ? is a wild card
			
			//4. Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			// Iterate in ResultSet
			int i=0;
			String e="",p="";
			while(rs.next()){
				i = rs.getInt(1);
				e = rs.getString(2);
				p = rs.getString(3);
				
				//User user = new User(i,e,p);
				//userList.add(user);
				
				userList.add(new User(i,e,p));
				
				/*System.out.println("------------------------------------------------");
				System.out.println("|\t"+i+" |\t"+e+" |\t"+p);
				System.out.println("------------------------------------------------");*/
			}
			rs.close();
		} catch (Exception e) {
			System.err.println("Some Error: "+e);
		}
		
		// userList is having object of User Type.
		// ArrayList is representing the entire table and every object in ArrayList is represeting the rows
		return userList;
	}
	
	void executeProcedure(User user){
		try {
			
			String sql = "{call insertUser(?,?,?)}";
			
			cStmt = con.prepareCall(sql);
			cStmt.setInt(1, user.getUid());
			cStmt.setString(2, user.getEmail());
			cStmt.setString(3, user.getPassword());
			
			cStmt.execute();
			
			System.out.println("--Procedure Executed--");
			
		} catch (SQLException e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	// Batch Processing and Transaction Management
	void perfromTransaction(){
		try {
			
			String sql1 = "delete from tblUser where uid = 10";
			String sql2 = "update tblUser set password = 'hello123' where id = 3";
			
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			// You wish to manage the transaction
			con.setAutoCommit(false);
			
			stmt.executeBatch();
			
			con.commit(); //  commit the transaction
			System.out.println("--Transaction Done--");
			
		} catch (Exception e) {
			
			try {
				con.rollback(); // DB shall be reverted back to original state
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("Exception is: "+e);
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
