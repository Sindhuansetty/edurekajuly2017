package co.edureka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {
	
	
	void queueDemo(){
	
		// Sorted Queue
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		// Adding the data
		for(int i=10;i>0;i--)
			queue.add(i);  //queue.add(new Integer(i)); // AutoBox
		
		System.out.println("size of queue is: "+queue.size());
		
		//read the data
		//System.out.println(queue.peek()); // reads the head
		//System.out.println(queue.peek());
		//System.out.println(queue.peek());
		
		//System.out.println(queue.poll()); // read and remove the head of Q
		//System.out.println(queue.poll());
		//System.out.println(queue.poll());
		
		for(int i=0;i<10;i++){
			System.out.println(queue.poll()); // remove the head and hence size is reduced
		}
		
		Iterator<Integer> itr = queue.iterator();
	}

	void setDemo(){
		
		ArrayList<String> list = new ArrayList<String>();
		
		// Unique Values
		//HashSet<String> set = new HashSet<String>(); // Direct
		//Set<String> set = new HashSet<String>();   // RTP
		
		TreeSet<String> set = new TreeSet<String>(); // Sorted Arrangement
		
		list.add("John"); //0
		list.add("Ben");
		list.add("Adi");
		list.add("Harry");
		list.add("John");
		list.add("Jack");
		list.add("Jennie"); //n-1
		
		set.add("John"); 
		set.add("Ben");
		set.add("Adi");
		set.add("Harry");
		set.add("John");
		set.add("Jack");
		set.add("Jennie");
		
		System.out.println("-----List-----");
		System.out.println(list);
		System.out.println("-----Set-----");
		System.out.println(set);
		
		set.remove("Jack");
		System.out.println("-----Set Now-----");
		System.out.println(set);
		
		if(set.contains("Ben"))
			System.out.println("Ben is in the set");
		
		System.out.println("Size is: "+set.size());
		
		// Read All
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(name);
			
			if(name.equals("Ben"))
				itr.remove(); // removes the object from Set
		}
		
		System.out.println("-----Set Now-----");
		System.out.println(set);
		
		Enumeration<String> eRef = Collections.enumeration(set);
		while(eRef.hasMoreElements()){
			String name = eRef.nextElement();
			System.out.println(name);
		}
		
	}
	
	void mapDemo(){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Hashtable<Integer, String> table = new Hashtable<Integer, String>(); // Thread Safe
		
		// Add the data
		map.put(101, "John");
		map.put(201, "Jennie");
		map.put(137, "Jack");
		map.put(901, "Jim");
		map.put(512, "Joe");
	
		table.put(101, "John");
		table.put(201, "Jennie");
		table.put(137, "Jack");
		table.put(901, "Jim");
		table.put(512, "Joe");
		
		System.out.println("---Map---");
		System.out.println(map);
		
		System.out.println("---Table---");
		System.out.println(table);
		
		// update in map
		map.put(901, "George"); // Once a key is created, it will not be recreated. Its unique.
		map.put(null, "Ben");
		map.put(777, null);
		System.out.println("---Map Again---");
		System.out.println(map);
		
		// HashTable shall not allow null key and null value
		//table.put(null, "Harry");
		//table.put(123, null);
		
		// remove the data
		map.remove(512);
		System.out.println("---Map Again---");
		System.out.println(map);
		
		// Retrieve
		System.out.println(map.get(101));
		
		// Retrieve All Operation
		
		// 1. By Extracting keys and iterating in them
		Set<Integer> keys = map.keySet(); // extract all the keys from Map as a Set
		System.out.println("---Keys---");
		System.out.println(keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			
			System.out.println(key+" - "+value);
		}
		System.out.println("===============");
		//2. EntrySet - In Map data is stored as Entry (Entry is a Key Value Pair)
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entrySet.iterator();
		
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
	}
	
	
	public static void main(String[] args) {
		
		CollectionsDemo cdRef = new CollectionsDemo();
		//cdRef.queueDemo();
		//cdRef.setDemo();
		cdRef.mapDemo();

	}

}
