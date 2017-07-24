package co.edureka;

public class JDBCDemo {

	public static void main(String[] args) {
		
		System.out.println("==Java App Started==");
		
		User user1 = new User();
		user1.setUid(4);
		user1.setEmail("fionna@example.com");
		user1.setPassword("fionna123");
		
		User user2 = new User(5,"ben@example.com","bennie123");
		
		System.out.println("user1 is: "+user1);
		System.out.println("user2 is: "+user2);
		
		// Before the App Finishes we must persist the data of object in table
		
		JDBCHelper helper = new JDBCHelper(); // Driver shall be Loaded
		helper.openConnection(); // Connection Created
		helper.insertUser(user1); // user1 shall be persisted in DB
		helper.insertUser(user2); // user2 shall be persisted in DB
		helper.closeConnection(); // Close Connection woth DB
		
		
		System.out.println("==Java App Finished==");
		
	}

}
