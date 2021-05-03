package exercise4_4;

public class GreenApple extends Apple{

	private String taste;
	private boolean difference;
	
	public GreenApple(String name, int q, double p, String t, boolean d) {
		super(name, q, p);
		this.taste = t;
		this.difference = d;
		
		//System.out.println("Green Apple constructor is invoked");
	}
	
	public String tasteGreenApple() {
		return this.taste;
	}
	
	public double calprice() {
		return super.price * super.quantity;
	}
	
	public boolean differ() {
		return this.difference;
	}
	
	public String printEvidence() { //overriding
		return "\nThe pectin found in " + name.toUpperCase() + " can break down foods more efficiently.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nQuantity\t\t\t: " + quantity +
			   "\nPrice\t\t\t\t: RM " + price + 
			   "\nTotal price\t\t\t: RM " + calprice() +
			   "\nTaste\t\t\t\t: " + taste + 
			   "\nIs the green apple more sour than the red apple?: " + difference + 
			   printEvidence();
		
	}
}
