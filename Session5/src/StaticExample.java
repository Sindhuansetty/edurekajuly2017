class WhatsAppGroup{
	
	String uname;
	static String groupName;
	
	void show(){
		System.out.println("User "+uname+" belongs to "+groupName);
	}
}


public class StaticExample {

	public static void main(String[] args) {
		
		WhatsAppGroup wa1 = new WhatsAppGroup();
		WhatsAppGroup wa2 = new WhatsAppGroup();
		
		wa1.uname = "John";
		wa2.uname = "Jennie";
		
		wa1.groupName = "Family";
		
		wa2.groupName = "Family & Friends";
		
		WhatsAppGroup.groupName = "Edureka";
		
		wa1.show();
		wa2.show();
		
	}

}
