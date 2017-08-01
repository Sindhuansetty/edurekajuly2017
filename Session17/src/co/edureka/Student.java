package co.edureka;

public class Student {
	
	int roll;
	String name;
	Address adrs; // HAS-A Relation
	
	public Student(){
		
	}
	
	// Constructor to reduce Coupling
	public Student(Address adrs) {
		this.adrs = adrs;
	}

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
	public Address getAdrs() {
		return adrs;
	}
	
	// Setter to reduce coupling
	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", adrs=" + adrs + "]";
	}
	
}
