// Conditional Constructs
public class IfElse {

	public static void main(String[] args) {
		
		//boolean isNwtworkAvl = true;
		int nwkSpeed = 2;
		boolean isGPSEnabled = false;
		// User is suppose to register in an App (Web, Desktop or Mobile)
		
		// User is suppose to request for a Cab
		
		// if/else | nested if/else
		if(nwkSpeed > 3){
			
			if(isGPSEnabled)
				System.out.println("You can book a Cab");
			else
				System.out.println("Please check with your GPS");
			
		}else{
			System.out.println("Please check with Internet Connectivity");
		}
		
		int cabType = 3; // 1 Cab1(Norm) 2 Cab2(Prem) 3 Cab3 (Lux)
		
		// Ladder if/else
		if(cabType == 1){
			System.out.println("Fare is: \u20b9"+100);
		}else if(cabType == 2){
			System.out.println("Fare is: \u20b9"+200);
		}else{
			System.out.println("Fare is: \u20b9"+300);
		}
		
		// switch case
		switch (cabType) {
			case 1:
				System.out.println("Fare is: \u20b9"+100);
				break;
				
			case 2:
				System.out.println("Fare is: \u20b9"+200);
				break;
				
			case 3:
				System.out.println("Fare is: \u20b9"+300);
				break;
				
			default:
				System.out.println("Unspecified Cab");
				break;
		}
		

	}

}
