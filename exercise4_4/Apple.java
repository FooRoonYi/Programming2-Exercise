package exercise4_4;
import java.text.DecimalFormat;
public class Apple extends Fruit { //sub class of Fruit
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
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
		} else if(this.quantity > 10 && this.quantity < 100) {
			double pp = 1.99; //buy more than 10 but less than 100, price becomes 1.99
			totalPrice(pp); //overloading with 1 argument
			System.out.println(name);
			System.out.println("If quantity MORE than 10, Total Price: RM" + df2.format(totalPrice(pp)));
		} else {
			double pp = 0.99; //buy more than 100, price becomes 0.99
			double dd = 0.1;
			totalPrice(dd, pp);
			System.out.println(name);
			System.out.println("If quantity MORE than 100, Total Price: RM" + df2.format(totalPrice(dd, pp)));
		}
	}
	
	public double totalPrice() {
		return this.price * this.quantity;
	}
		
	public double totalPrice(double pr) {
		return pr * this.quantity;
	}
		
	public double totalPrice(double qq, double pr) {
		return (pr*this.quantity) * qq;
	}
	
	public String printEvidence() { //overriding
		return "\nFrequent " + name.toUpperCase() + " onsumption can reduce total cholesterol and risks of heart disease.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nTotal Price\t\t\t: " + totalPrice() + 
			   printEvidence();
	}
		
}//end for class Apple extends Fruit
