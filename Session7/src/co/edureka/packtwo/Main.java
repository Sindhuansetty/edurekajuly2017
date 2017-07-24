package co.edureka.packtwo;

import co.edureka.packone.One;
//import co.edureka.packone.Two; error

// Inheritance Across Packages
// Only protected and public shall be inherited
// Once protected is inherited it behaves like private

class Ten extends One{
	void show(){
		protShow();
		//defShow();
		//pvtShow();
	}
}

public class Main {

	public static void main(String[] args) {
		
		//One oRef = new One();
		//oRef.pvtShow(); //error
		//oRef.defShow();
		//oRef.protShow();
		//oRef.pubShow();
		
		Ten tRef = new Ten();
		tRef.pubShow();
		//tRef.protShow();
		tRef.show();
		
		One o1 = new One();
		co.edureka.packtwo.One o2 = new co.edureka.packtwo.One();
	}

}
