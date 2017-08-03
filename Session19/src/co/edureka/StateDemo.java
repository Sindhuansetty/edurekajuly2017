package co.edureka;

interface State{
	
}

class InitialState implements State{
	
	public String toString() {
		return "Initial State";
	}
}

class FinalState implements State{
	public String toString() {
		return "Final State";
	}
}


class Context{
	
	State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}

public class StateDemo {

	public static void main(String[] args) {
		
		InitialState iState = new InitialState();
		FinalState fState = new FinalState();
		
		Context cxt = new Context();
		cxt.setState(iState);
		System.out.println(cxt.getState());
		///
		//...
		
		cxt.setState(fState);
		System.out.println(cxt.getState());
	}

}
