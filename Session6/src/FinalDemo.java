final class A{ // cannot inherit from final class
	final void fun(){ // -> Cannot be Overrided
		
	}
}

class B{// extends A{
	/*void fun(){
		
	}*/
}


public class FinalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100;
		
		// Its value cannot be modified. Read Only Variable
		final int j = 10;
		//j = 100; err

	}

}
