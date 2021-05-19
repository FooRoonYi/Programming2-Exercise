package exercise4_6;

public class RedApple extends Apple { //subclass of Apple
	
	private String colour;

	public RedApple(String name, int q, double p,String c) { //constructor sub class with argument
		super(name, q, p); //called method in superclass with passing parameter
		this.colour = c;
		
	}
	
	public String colour() { //colour of the red apple
		return this.colour;
	}
	
	public String printEvidence() { //overriding
		return "\nA " + name.toUpperCase() + " a day keeps the doctor away.";
	}
	
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nDiscount\t\t\t: " + df2.format(disc) + 
			   printEvidence();
	}
	
} //end for RedApple extends Apple