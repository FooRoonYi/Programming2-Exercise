package exercise4_6;

import java.text.DecimalFormat;

public class Mango extends Apple{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	private String size;
	private int weight;
	private double disc;
	
	public Mango(String name, String s, int w, double p, int q) { //constructor sub class with argument
		super(name, q, p); //called method in superclass with passing parameter
		this.size = s;
		this.weight = w;
	}
		
	public String sizeMango() {
		return this.size;
	}
	
	public String printEvidence() { //overriding
		return "\nIf you consume more " + size.toUpperCase() + " " + name.toUpperCase() + " then it leads to weight gain.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nSize of the mango\t\t: " + size +
			   "\nWeight of " + size + " mango\t: " + weight + " g" +
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nDiscount\t\t\t: " + df2.format(disc) + 
			   printEvidence();
		
	}
	
}