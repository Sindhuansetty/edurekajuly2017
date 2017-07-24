// Object is a class which is the parent of all the classes in Java
// Object is a root class

class Point{ //extends Object{
	
	@Override
	public String toString() {
		return "This is Awesome "+super.toString();
	}
	
}


class MyMaths{
	
}

// MyPoint is GrandChild of Object 
class MyPoint extends Point{
	
}

public class ExplorePackages {

	public static void main(String[] args) {
		
		System.out.println(Math.min(12.37, 21.95));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sin(20));
		
		//StrictMath

		// belongs to java.lang package
		Object o = null;
		// Shape - Circle Rectangle and Polygon
		
		// RTP | Parent Reference Variable can point to the object of child
		o = new Point();
		o = new MyMaths();
		o = new Thread();
		o = new String();
		
		/*Shape s;
		s = new Circle();
		s = new Rectangle();
		s = new Polygon();*/
		
		Point pRef = new Point();
		
		System.out.println("HashCode: "+pRef.hashCode());
		System.out.println("Class: "+pRef.getClass());
		System.out.println("call toString: "+pRef.toString());
		System.out.println("do not call toString: "+pRef);
		
		
		// Converting Primitive Type into Reference Type
		// OOPS | Objects -> User Wrapper Classes instead of Primitives
		
		// Primitive Type
		int i = 10;
		
		// Reference Type
		Integer iRef = new Integer(i); // Boxing -> Converting Primitive ot reference
		
		// Printing iRef, we dont see the address, but we see some value (String also similar thing happened)
		// Integer and String, their parent is Object. In theses classes, they have overrided the toString method of Object
		System.out.println("iRef is: "+iRef);
		System.out.println("iRef is: "+iRef.toString());
		
		int j = iRef.intValue(); // UnBoxing -> Getting the primitive back from Object of Integer
		System.out.println("j is: "+j);
		
		char ch = 'A';
		Character chRef = new Character(ch); //(Boxing) // Reference Type
		char ch1 = chRef.charValue(); // UnBoxing
		
		
		int k = 100;
		Integer kRef = k; // AutoBoxing -> compiler transaltes as -> Integer kRef = new Integer(k);
		int l = kRef; // AutoUnBoxing  -> compiler transaltes as -> int l = kRef.intValue();
				
				
	
	}

}
