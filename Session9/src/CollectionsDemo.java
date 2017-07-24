import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Employee{
	int eid;
	String name;
	
	@Override
	public String toString() {
		return "Employee :" + eid +" - "+name;
	}
}

public class CollectionsDemo {

	public static void main(String[] args) {
		
		// Raw Type | Any Object
		ArrayList list1 = new ArrayList(); // Object
		
		// Generic Type
		ArrayList<String> list2 = new ArrayList<String>(); //     | Only String Objects can be Stored
		ArrayList<Employee> list3 = new ArrayList<Employee>(); // | Only Employee Objects can be Stored
		
		// RTP
		List<String> list4 = new ArrayList<String>(); // Polymorphic Statement
		
		// Add Data in ArrayList
		list1.add("John"); // list1.add(new String("John"));
		list1.add(10); // list1.add(new Integer(10));
		list1.add(10.2); // list1.add(new Double(10));
		
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "John";
		
		Employee e2 = new Employee();
		e2.eid = 102;
		e2.name = "Jennie";
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add("John"); //0
		//list2.add(0,"John"); //0 | Index Management happens automatically
		list2.add("Jennie");
		list2.add("Jack");
		list2.add("Jim");
		list2.add("Joe");  //n-1
		//list2.add(10); // err
		//list2.add(e1); // err
		
		list3.add(e1); 
		list3.add(e2);
		//list3.add(100); // err
		
		
		System.out.println("==list1===");
		System.out.println(list1);
		System.out.println("==list2===");
		System.out.println(list2);
		System.out.println("==list3===");
		System.out.println(list3);
		
		// Read the data from ArrayList
		System.out.println("list1 0 index: "+list1.get(0));
		System.out.println("list2 2 index: "+list2.get(2));
		System.out.println("list3 1 index: "+list3.get(1));
		
		// Remove
		list2.remove(2);
		System.out.println("==list2===");
		System.out.println(list2);
		
		// Update
		list2.set(0, "John Watson");
		System.out.println("==list2===");
		System.out.println(list2);
		
		// Read All Operation
		//1. For
		System.out.println("==For Loop===");
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		//2. Enhanced For
		System.out.println("==Enhanced For Loop===");
		for(String str : list2){
			System.out.println(str);
		}
		
//		for(Object o : list1){
//			System.out.println(o);
//		}
		
		
		//3. Iterator
		System.out.println("==Iterator===");
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
		}

		//4. ListIterator
		System.out.println("==List Iterator:next===");
		ListIterator<String> litr = list2.listIterator();
		while(litr.hasNext()){
			String str = litr.next();
			System.out.println(str);
		}
		
		System.out.println("==List Iterator:previous===");
		while(litr.hasPrevious()){
			String str = litr.previous();
			System.out.println(str);
		}
		
		//4. Enumeration
		System.out.println("==Enumeration===");
		Enumeration<String> eRef = Collections.enumeration(list2);
		while(eRef.hasMoreElements()){
			String str = eRef.nextElement();
			System.out.println(str);
		}
		
		// API's on ArrayList
		//list2.clear();
		if(list2.contains("John Watson")){
			System.out.println("John is in the list");
		}
		
		int idx = list2.indexOf("Jennie"); // lastIndexOf
		System.out.println(idx);
		
		System.out.println(list2.size());
		
		list4.add("Ben");
		list4.add("Fionna");
		list4.add("George");
		
		list2.addAll(list4);
		System.out.println("==Final list2==");
		System.out.println(list2);
		
		if(list3.contains(e1)){
			System.out.println(e1.name + " is in the list");
		}
		
		// Vector is THREAD SAFE
		Vector<String> vector = new Vector<String>();
		vector.add("Ben");
		vector.add("Fionna");
		vector.add("George");
		
		System.out.println("==vector==");
		System.out.println(vector);
		//vector.contains()
	}

}
