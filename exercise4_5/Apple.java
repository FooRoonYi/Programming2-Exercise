package exercise4_5;
import java.text.DecimalFormat;
public class Apple extends Fruit { //sub class of Fruit

	protected static DecimalFormat df2 = new DecimalFormat("#.##");
	
	protected int quantity;
	protected double price;
	protected double disc, p2, p3;
	
	public Apple(String name, int q, double p) { //constructor sub class with argument
		super(name); //called method in superclass with passing parameter
		this.quantity = q;
		this.price = p;
		
		if(this.quantity < 10) {
			totalPrice();  //overloading with no arguments coz price&quantity doesnt change
			System.out.println(name);
			System.out.println("If quantity LESS than 10, Total Price: RM" + df2.format(totalPrice()));
		} else if(this.quantity > 10 && this.quantity < 75) {
			p2 = 1.99; //buy more than 10 but less than 100, price becomes 1.99
			totalPrice(p2); //overloading with 1 argument
			System.out.println(name);
			System.out.println("If quantity MORE than 10, Total Price: RM" + df2.format(totalPrice(p2)));
		} else {
			p3 = 0.65; //buy more than 100, price becomes 0.65
			
			if(name.equals("Apple")) {
				Discount dd = new AppleDiscount(); //create new object for apple
				System.out.println("DISCOUNT: " + dd.rateOfDiscount());
				disc = dd.rateOfDiscount();
			} else if (name.equals("Red Apple")){
				Discount d1 = new RedAppleDiscount(); //create new object for red apple
				System.out.println("DISCOUNT: " + d1.rateOfDiscount());
				disc = d1.rateOfDiscount();
			} else if(name.equals("Green Apple")) {
				Discount d2 = new GreenAppleDiscount(); //create new object for green apple
				System.out.println("DISCOUNT: " + d2.rateOfDiscount());
				disc = d2.rateOfDiscount();
			} else {
				System.out.println("There is NO discount!"); //no discount
			}
			
			
			totalPrice(disc, p3); //call method totalPrice
			
			System.out.println(name);
			System.out.println("If quantity MORE than 100, Total Discount Price: RM" + df2.format(totalPrice(disc, p3)));
		}
	}
	
	public double totalPrice() { //overloading method with no argument
		return this.price * this.quantity;
	}
		
	public double totalPrice(double p2) { //overloading method with one argument
		return p2 * this.quantity;
	}
		
	public double totalPrice(double disc, double p3) { //overloading method with two arguments
		return (p3*this.quantity) * (1-disc);
	}
	
	public String printEvidence() { //overriding
		return "\nFrequent " + name.toUpperCase() + " consumption can reduce total cholesterol and risks of heart disease.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nDiscount\t\t\t: " + disc + 
			   "\nTotal Price (without discount)  : RM " + df2.format(totalPrice()) + 
			   printEvidence();
	}
		
}//end for class Apple extends Fruit
