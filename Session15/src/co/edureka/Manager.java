package co.edureka;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	int id;
	String name;
	String email;
	
	// One Manager is having Multiple Certificates
	List<Certificate> certiList; // HAS-A Relation

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Certificate> getCertiList() {
		return certiList;
	}

	public void setCertiList(List<Certificate> certiList) {
		this.certiList = certiList;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", email=" + email + ", certiList=" + certiList + "]";
	}
	
}
