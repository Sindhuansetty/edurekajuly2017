package co.edureka.exceptions;

import java.io.IOException;

// UnChecked Exception
class MyBankingException extends RuntimeException{
	public MyBankingException(String msg) {
		super(msg); // super is a call to the parent's constructor
	}
}

// Checked Exception
class YourBankingException extends Exception{
	public YourBankingException(String msg) {
		super(msg);
	}
}


class Banking{
	
	static int balance = 10000;
	static int count=0;
	
	static void withdraw(int amt){
		if(balance>4000){
			balance = balance-amt;
			System.out.println("Withdraw Done. Remaining Balance is: \u20b9"+balance);
		}else{
			if(count>2){
				// We shall crash the program explicitly
				// We are throwing an Unchecked Exception
				//NullPointerException npe = new NullPointerException("Your Balance is LOW");
				//throw npe; // throwing an exception
				
				MyBankingException mb = new MyBankingException("Your Balance is LOW");
				throw mb;
			}else{
				System.out.println("Your balance is Low: \u20b9"+balance);
				count++;
			}
		}
	}
	
	// Since withdrawAgain is throwing a Checked Exception, so we have added throws in method signature
	// Shall be prompted by the compiler
	static void withdrawAgain(int amt) throws IOException,YourBankingException{
		if(balance>4000){
			balance = balance-amt;
			System.out.println("Withdraw Done. Remaining Balance is: \u20b9"+balance);
		}else{
			if(count>2){
				// We shall crash the program explicitly
				// We are throwing an Checked Exception
				//IOException io = new IOException("Your Balance is LOW");
				//throw io; // throwing an exception - checked
				
				YourBankingException yb = new YourBankingException("Your Balance is LOW");
				throw yb;
			}else{
				System.out.println("Your balance is Low: \u20b9"+balance);
				count++;
			}
		}
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		System.out.println("==Banking Started==");
		for(int i=1;i<=10;i++){
			Banking.withdraw(3000);
		}
		
		/*for(int i=1;i<=10;i++){
			try{
				Banking.withdrawAgain(3000);
			}catch(Exception e){
				System.out.println("Some Exception: "+e);
			}
		}*/
		
		System.out.println("==Banking Finished==");

	}

}
