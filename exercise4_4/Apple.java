package exercise4_4;
import java.text.DecimalFormat;
public class Apple extends Fruit { //sub class of Fruit
	
	protected static DecimalFormat df2 = new DecimalFormat("#.##");
	
	protected int quantity;
	protected double price;
	
	public Apple(String name, int q, double p) { //constructor sub class with argument
		super(name); //called method in superclass with passing parameter
		this.quantity = q;
		this.price = p;
		
		if(this.quantity < 10) {
			totalPrice();  //overloading with no arguments coz price&quantity doesnt change
			System.out.println(name);
			System.out.println("If quantity LESS than 10, Total Price: RM" + df2.format(totalPrice()));
		} else if(this.quantity > 10 && this.quantity < 75) {
			double p2 = 1.99; //buy more than 10 but less than 100, price becomes 1.99
			totalPrice(p2); //overloading with 1 argument
			System.out.println(name);
			System.out.println("If quantity MORE than 10, Total Price: RM" + df2.format(totalPrice(p2)));
		} else {
			double p3 = 0.65; //buy more than 100, price becomes 0.99
			double disc = 0.1;
			totalPrice(disc, p3);
			System.out.println(name);
			System.out.println("If quantity MORE than 100, Total Price: RM" + df2.format(totalPrice(disc, p3)));
		}
	}
	
	public double totalPrice() {
		return this.price * this.quantity;
	}
		
	public double totalPrice(double p2) {
		return p2 * this.quantity;
	}
		
	public double totalPrice(double disc, double p3) {
		return (p3*this.quantity) * (1-disc);
	}
	
	public String printEvidence() { //overriding
		return "\nFrequent " + name.toUpperCase() + " onsumption can reduce total cholesterol and risks of heart disease.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nTotal Price\t\t\t: RM " + totalPrice() + 
			   printEvidence();
	}
		
}//end for class Apple extends Fruit
