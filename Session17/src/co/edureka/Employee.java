package co.edureka;

// POJO or Model or BEAN
public class Employee {
	
	// Attributes
	int eid;
	String name;
	String email;
	int age;
	String address;
	
	// Constructor
	public Employee(){
		name = "NA";
		System.out.println("==Obect Created==");
	}
	
	public Employee(int eid, String name, String email, int age, String address) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	
	// Getters and Setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void myInit(){
		System.out.println("==Bean Init==");
	}
	
	public void myDestroy(){
		System.out.println("==Bean Destroy==");
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", age=" + age + ", address=" + address
				+ "]\n"+super.toString();
	}
}
