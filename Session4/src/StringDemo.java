
public class StringDemo {

	public static void main(String[] args) {
		
		// Letter
		char ch = 'A';
		ch = '\u20b9';
		
		// ERROR
		//ch = 'A This is Awesome'; // Sentences cannot be accomodated in character
		
		
		// Interned Way of Creating a String
		// str1 and str2 are the reference variables
		String str1 = "Hello";
		String str2 = "Hello";

		// Non Interned Way of Creating a String | Object Creation
		// str3 and str4 are the reference variables
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		String str5 = "Awesome";

		// Comparison is happening on reference variables
		// Reference variables are holding addresses and not the values
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){ 
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		if(str1 == str3){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
		
		// ==  compares references
		// equals method compares contents
		if(str3.equals(str4)){ 
			System.out.println("str3 equals str4");
		}else{
			System.out.println("str3 not eqauls str4");
		}
		
		if(str3.equalsIgnoreCase(str4)){ 
			System.out.println("str3 equals str4");
		}else{
			System.out.println("str3 not eqauls str4");
		}
		
		// compareTo method compares contents
		if(str3.compareTo(str4) == 0){ 
			System.out.println("str3 compared to str4");
		}else{
			System.out.println("str3 not compared to str4");
		}
		
		if(str3.compareToIgnoreCase(str4) == 0){ 
			System.out.println("str3 compared to str4");
		}else{
			System.out.println("str3 not compared to str4");
		}
		
		String str6 = str3; // Reference Copy
		
		
		// Once you create a String, it cannot be changed or manipulated.
		// Strings are IMMUTABLE. You cannot change them.
		
		String s1 = "Be Exceptional!";
		String s2 = s1.concat(" Achieve Success!!"); // we are trying to append something in s1
		String s3 = s1.toUpperCase();
		
		//s1 = s1.toLowerCase(); 
		
		str3.concat("Awesome"); // Non Interned
		System.out.println("str3 after concat is: "+str3);
		
		// s1 is a reference variable. Unlike Arrays they are not showing the address value(Magic we shall explore later)
		// s1 didnt concat what we tried to add
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		
		
		String str = "John, Jennie, Jim, Joe, Jack, John";
		System.out.println("str length: "+str.length());
		
		if(str.contains("Jim")){
			System.out.println("Jim is in the String");
		}
		
		int idx = str.indexOf("Jennie");//str.lastIndexOf('J');//str.indexOf('J');
		System.out.println("last idenx of J is: "+idx);
		
		String subStr = str.substring(5,10);//str.substring(5);
		System.out.println(subStr);
		
		String[] strArr = str.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
		if(str.endsWith("hn")){
			System.out.println("Ends in hn");
		}
		
		char[] chArr = str.toCharArray();
		for(char chr : chArr){
			System.out.print(chr+" ");
		}
		
		System.out.println();
		
		char[] chArr1 = {'H','E','L','L','O'};
		String myStr = new String(chArr1);
		System.out.println("myStr is: "+myStr);
		
		// IMMUTABLE
		String string = new String("Be Exceptional");
		
		// MUTABLE
		StringBuffer buffer = new StringBuffer("Be Exceptional");		// THREAD SAFE
		StringBuilder builder = new StringBuilder("Be Exceptional");    // NOT THREAD SAFE
		
		//StringBuffer buffer = "Hello"; error 
		
		string.concat(" Achieve Success!!");
		buffer.append(" Achieve Success!!");
		builder.append(" Achieve Success!!");
		
		System.out.println("string is: "+string);
		System.out.println("buffer is: "+buffer);
		System.out.println("builder is: "+builder);
		
		System.out.println("buffer is: "+buffer.length());
		
		int[] arr = {10,20};
		char[] cArr = {'X','Y'};
		System.out.println(arr);
		System.out.println(cArr);
		
		String someStr = new String();
		if(someStr.isEmpty())
			System.out.println("Empty String");
	}

}
