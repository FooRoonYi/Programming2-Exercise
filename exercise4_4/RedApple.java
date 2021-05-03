package exercise4_4;

public class RedApple extends Apple { //subclass of Apple
	
	private String colour;
	private int pack;
	
	public RedApple(String name, int q, double p, int pk, String c) { //constructor sub class with argument
		super(name, q, p); //called method in superclass with passing parameter
		pack = pk;
		colour = c;
		
	}
	
	public String colour() {
		return this.colour;
	}
	
	public int packRedApple() {
		return this.pack;
	}
	
	public double calPrice() {
		return (super.quantity/this.pack) * super.price;
	}
	
	public String printEvidence() { //overriding
		return "\nA " + name.toUpperCase() + " a day keeps the doctor away.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nTotal Price\t\t\t: " + calPrice() +
			   printEvidence();
	}
	
} //end for RedApple extends Apple
