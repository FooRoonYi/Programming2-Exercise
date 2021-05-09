package exercise4_5;

public class GreenApple extends Apple{

	private String taste;
	private boolean difference;
	
	public GreenApple(String name, int q, double p, String t, boolean d) { //constructor sub class with argument
		super(name, q, p); //called method in superclass with passing parameter
		this.taste = t;
		this.difference = d;
		
		//System.out.println("Green Apple constructor is invoked");
	}
	
	public String tasteGreenApple() {
		return this.taste;
	}
	
	public boolean differ() { //is green apple more sour than red apple
		return this.difference;
	}
	
	public String printEvidence() { //overriding
		return "\nThe pectin found in " + name.toUpperCase() + " can break down foods more efficiently.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nQuantity\t\t\t: " + quantity +
			   "\nPrice\t\t\t\t: RM " + price + 
			   "\nTotal price\t\t\t: RM " + df2.format(totalPrice()) +
			   "\nTaste\t\t\t\t: " + taste + 
			   "\nIs the green apple more sour than the red apple?: " + difference + 
			   printEvidence();
		
	}
}