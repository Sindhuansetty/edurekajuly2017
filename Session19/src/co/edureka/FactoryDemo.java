package co.edureka;

interface Plan{
	void setUpPlan();
	void showPlan();
}

class Plan2G implements Plan{
	
	int data;
	int price;
	
	public void setUpPlan() {
		data = 10;
		price = 200;
	}

	public void showPlan() {
		System.out.println("Plan 2G Details:");
		System.out.println(data+" GB of data is available for \u20b9"+price);
	}

}

class Plan3G implements Plan{
	
	int data;
	int price;
	
	public void setUpPlan() {
		data = 5;
		price = 300;
	}

	public void showPlan() {
		System.out.println("Plan 3G Details:");
		System.out.println(data+" GB of data is available for \u20b9"+price);
	}

}

class Plan4G implements Plan{
	
	int data;
	int price;
	
	public void setUpPlan() {
		data = 3;
		price = 400;
	}

	public void showPlan() {
		System.out.println("Plan 4G Details:");
		System.out.println(data+" GB of data is available for \u20b9"+price);
	}

}

class PlanFactory{
	
	static Plan getPlan(int type){
	
		Plan plan = null;
		
		switch (type) {
			case 2:
				plan = new Plan2G();
				break;
	
			case 3:
				plan = new Plan3G();
				break;
				
			case 4:
				plan = new Plan4G();
				break;
		}
		
		plan.setUpPlan();
		
		return plan;
		
	}
}


public class FactoryDemo {

	public static void main(String[] args) {

		// Client or End User
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();

	}

}
