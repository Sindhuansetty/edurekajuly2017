package co.edureka;

// Model or Bean or POJO (Plain Old Java Object)
public class Student {

	// Attributes
	int roll;
	String name;
	int std;
	String address;
	int age;
	
	public Student(){
		
	}
		
	public Student(int roll, String name, int std, String address, int age) {
		this.roll = roll;
		this.name = name;
		this.std = std;
		this.address = address;
		this.age = age;
	}

	// Getters and Setters
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", std=" + std + ", address=" + address + ", age=" + age
				+ "]";
	}
	
	
	
	
}
