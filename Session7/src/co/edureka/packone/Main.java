package co.edureka.packone;

public class Main {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow(); error
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println("==================");
		
		Two tRef = new Two();
		//tRef.pvtShow(); //error
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
	}

}
