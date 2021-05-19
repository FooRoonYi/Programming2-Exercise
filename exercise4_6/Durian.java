package exercise4_6;
import java.text.DecimalFormat;
public class Durian extends Apple{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	private char thorns;
	private double calories;
	
	public Durian(String name, char t, int q, double p) { //constructor sub class with argument
		super(name, q, p); //called method in superclass with passing parameter
		this.thorns = t;
	}
	
	public char HasThorns() {
		return this.thorns;
	}
	
	public String printEvidence() { //overriding
		return "\n" + name.toUpperCase() + " is banned in HongKong, Thailand and Japan because its stinky smell.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nDoes the durian have thorns?\t: " + HasThorns() +
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nDiscount\t\t\t: " + df2.format(disc) + 
			   printEvidence();
	}

}