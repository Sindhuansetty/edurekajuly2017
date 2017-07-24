
public class ArrayDemo {

	public static void main(String[] args) {
		
		int i = 10; // Single Value Container
		
		// Arrays are created dynamically i.e. at run time and hence the memory area heap
		
		// Implicit Statement
		int[] arr1 = {10,20,30,40,50}; // Multi Value Container | bracket before
		int arr2[] = {10,20,30,40,50}; // Multi Value Container | bracket after
		
		// Explicit Statement
		int[] arr3 = new int[]{10,20,30,40,50}; // Multi Value Container | bracket before
		int arr4[] = new int[]{10,20,30,40,50}; // Multi Value Container | bracket before
		
		int j = i; 			// Copying the value from i t j
		int[] arr5 = arr1;  // Copying the reference from arr1 to arr5 
		
		System.out.println("i is: "+i); // Primitive
		System.out.println("arr1 is: "+arr1); // Reference Variable
		System.out.println("arr2 is: "+arr2); // Reference Variable
		System.out.println("arr3 is: "+arr3); // Reference Variable
		System.out.println("arr5 is: "+arr5); // Reference Variable
		
		if(arr1 == arr5)
			System.out.println("arr1 == arr5");
		else
			System.out.println("arr1 != arr5");
		
		int[] arr6 = new int[5]; // arr6 is pointing to an array in the heap with all elements as 0
		int arr7[] = new int[5];
		
		// Writing the data in array
		arr6[0] = 10;
		arr6[3] = 100;
		
		// Reading the data from array
		System.out.println(arr6[0]+" - "+arr6[2]+" - "+arr6[3]);
		
		// Deletion shall be taken care by Garbage Collector
		
		// Read All
		System.out.println("================");
		for(int idx=0;idx<arr1.length;idx++){
			System.out.println(arr1[idx]);
		}
		
		
		System.out.println("================");
		
		// Enhanced For Loop | For-Each Loop
		for(int elm : arr7){
			System.out.println(elm);
		}
		
		// More Syntax
		int a1[],a2[],a3[],a4;
		a1 = new int[3];
		a2 = new int[7];
		a3 = new int[10];
		a4 = 100;
		
		int[] a5,a6,a7; // identifiers after [] are references to the array
		a5 = new int[3];
		a6 = new int[7];
		a7 = new int[10];
		
		char[] chArr = new char[10];   // Arrays are created dynamically
		System.out.println(chArr[12]); // Compiler is not prompting error
		
	}

}
