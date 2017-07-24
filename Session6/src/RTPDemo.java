//class Shape{
//	
//	Shape(){
//		System.out.println("--Shape Object Created--");
//	}
//	
//	void draw(){ // The definition is useless because it shall never be executed
//		System.out.println("--Drawing a Shape--");
//	}
//}

/*abstract class Shape{ // Since the objects of this class were not required so we marked it as abstract
	
	Shape(){
		System.out.println("--Shape Object Created--");
	}
	
	void fun(){
		
	}
	
	// Its a Protocol or a Rule which every child has to define
	abstract void draw(); // Since The definition was useless because we created method as abstract
}*/

interface Shape{
	
	/*Shape(){
		System.out.println("--Shape Object Created--");
	}*/
	
	
	void draw(); // public abstract void draw();
	

}

class Rectangle implements Shape{//extends Shape{
	Rectangle(){
		System.out.println("--Rectangle Object Created--");
	}
	
	public void draw(){
		System.out.println("--Drawing a Rectangle--");
	}
}

class Circle implements Shape{//extends Shape{
	Circle(){
		System.out.println("--Circle Object Created--");
	}
	
	public void draw(){
		System.out.println("--Drawing a Circle--");
	}
}

class Polygon implements Shape{//extends Shape{
	Polygon(){
		System.out.println("--Polygon Object Created--");
	}
	
	public void draw(){
		System.out.println("--Drawing a Polygon--");
	}
}

public class RTPDemo {

	public static void main(String[] args) {
	
		/*Shape sRef = new Shape();
		sRef.draw();*/
		
		/*Rectangle rRef = new Rectangle();
		rRef.draw();
		
		Circle cRef = new Circle();
		cRef.draw();
		
		Polygon pRef = new Polygon();
		pRef.draw();*/
		
		
		Shape sRef; // sRef is a reference variable belonging to Shape
		
		sRef = new Rectangle(); // Ref Var of Parent is pointing to the object of child
		sRef.draw();
		System.out.println("================");
		
		sRef = new Circle();
		sRef.draw();
		System.out.println("================");
		sRef = new Polygon();
		sRef.draw();
		System.out.println("================");
		
		// Its useless to create direct object of Shape for end user
		//sRef = new Shape(); //-> error
		//sRef.draw();
		
	}

}
