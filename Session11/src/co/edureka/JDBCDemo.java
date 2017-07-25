package co.edureka;

import java.util.ArrayList;

public class JDBCDemo {

	public static void main(String[] args) {
		
		System.out.println("==Java App Started==");
		
//		User user1 = new User();
//		user1.setUid(5);
//		user1.setEmail("george@example.com");
//		user1.setPassword("george321");
		
		User user2 = new User(11,"roy@example.com","roy123");
		
		//System.out.println("user1 is: "+user1);
		//System.out.println("user2 is: "+user2);
		
		// Before the App Finishes we must persist the data of object in table
		
		JDBCHelper helper = new JDBCHelper(); // Driver shall be Loaded
		helper.openConnection(); // Connection Created
		//helper.insertUser(user1); // user1 shall be persisted in DB
		//helper.insertUser(user2); // user2 shall be persisted in DB
		
		//helper.insertUser(user2);
		
		//helper.deleteUser(5);
		
		//helper.updateUser(user2);
		//ArrayList<User> users = helper.retrieveAll();
		
		/*for(User u : users){
			System.out.println(u);
			System.out.println("------------------------------------------------");
		}
		*/
		
		//helper.executeProcedure(user2);
		helper.perfromTransaction();
		
		helper.closeConnection(); // Close Connection woth DB
		
		
		System.out.println("==Java App Finished==");
		
	}

}
