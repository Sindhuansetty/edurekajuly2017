
public class MDArray {

	public static void main(String[] args) {
		
		int i = 10;
		
		int[] a1 = {10,20,30,40,50};
		
		int[][] a2 = {
						{10,20},
						{10,20,30},
						{10},
						{10,20,30,40,50},
						{10,20,30,40},
					 };

		System.out.println("i is: "+i);
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		System.out.println("a1 length is: "+a1.length);
		System.out.println("a2 length is: "+a2.length);
		System.out.println("======================");
		for(int idx=0;idx<a2.length;idx++){
			System.out.println(a2[idx]+" - "+a2[idx].length);
		}
		System.out.println("======================");
		// Read the data from Array
		for(int out=0;out<a2.length;out++){
			for(int in=0;in<a2[out].length;in++){
				System.out.print(a2[out][in]+"    ");
			}
			System.out.println();
		}
		System.out.println("======================");
		System.out.println(a2[3][2]); // 30
		
		// Array of Array of Arrays
		int[][][] a3 = {
							{
								{10,20},
								{10,20,30},
								{10},
								{10,20,30,40,50},
								{10,20,30,40},
							 },
							 {
									{10,20},
									{10,20,30},
									{10},
									{10,20,30,40,50},
									{10,20,30,40},
						      }
					   };
		
		int arr1[][] = new int[3][5]; // 3 1d Arrays, with each 1-D Array having five elements
		/*int[][] arr1 = {
							{10,20,30,40,50},
							{10,20,30,40,50},
							{10,20,30,40,50},
						};*/
		int arr2[][] = new int[3][];  // 3 1d Arrays, with each 1-D Array having different elements
		arr2[0] = new int[10];
		arr2[1] = new int[5];
		arr2[2] = new int[20];
		
	}

}
