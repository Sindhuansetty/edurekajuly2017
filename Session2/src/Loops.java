
public class Loops {

	public static void main(String[] args) {
		
		// We have 100 contacts to be displayed in the app
		//int i = 1;
		//int l = 100;

		/*System.out.println("Contact "+i);
		i++;
		System.out.println("Contact "+i);
		i++;
		System.out.println("Contact "+i);
		i++;
		System.out.println("Contact "+i);*/
		
		// Loops
		// 1. while , do while, for
		
		System.out.println("---------For Loop----------");
		for(int c=1; c<=100; c++){
			System.out.println("Contact "+c);
		}
		
		System.out.println("---------While Loop----------");
		int c = 101;
		while(c<= 100){
			System.out.println("Contact "+c);
			c++;
		}
		
		/*boolean choice = true;
		while(choice){
			
		}*/
		
		System.out.println("---------do while Loop----------");
		c = 101;
		do{
			System.out.println("Contact "+c);
			c++;
		}while(c<= 100);
		// Execution happens on a minimum of one even condition is false
		
		int j = 10;
		//int k = j++; // j increments after assignment | PostFix
		int k = ++j; // j increments and then assigns | PreFix
		System.out.println("j is: "+j);
		System.out.println("k is: "+k);
		
		//j was always incremented
		
		System.out.println("=================");
		int num = 7;
		for(int i=1;i<=10;i++){
			
			//if(i>5)
			//	break; // Terminate the loop
			
			if(i<5)
				continue; // Shift the Loop into next iteration, right from here and shall skip the instructions below
			
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		System.out.println("=================");
		
		// Products which we shall be searching on a e-Commerce Site eg: Amazon
		
		System.out.println("=============Nesting of Loops=========");
		
		outer:
		for(int out=1; out<=3; out++){ // 3 times
			System.out.println("out is: "+out);
			
			inner:
			for(int in=1;in<=5;in++){ // 5 times
				System.out.print(in+"   ");
				if(in==3)
					break outer;
			}
			System.out.println();
		} // Total Iterations as out*in -> 5*3 = 15
		
	}

}
