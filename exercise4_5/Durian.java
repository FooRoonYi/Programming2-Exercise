package exercise4_5;
import java.text.DecimalFormat;
public class Durian extends Fruit{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	private char thorns;
	private int quantity;
	private double calories, grams, price, p2, p3, disc;
	
	public Durian(String name, char t, double c, double g, int q, double p) { //constructor sub class with argument
		super(name); //called method in superclass with passing parameter
		this.thorns = t;
		this.calories = c;
		this.grams = g;
		this.quantity = q;
		this.price = p;
		
		//System.out.println("Durian constructor is invoked");
		
		if(this.grams == 100) {
			calories();
			System.out.println(name);
			System.out.println("There if NO DISCOUNT even you buy more!");
			System.out.println("If the durian EQUALS to 100g, Total Calories: " + df2.format(calories()) + " kcal");
		} else if(this.grams >= 200 && this.grams <= 400) {
			g = 1.47;
			calories(g);
			
			Discount ds = new DurianDiscount(); //create new object (for >=200 and <= 400 g durian)
			System.out.println("DISCOUNT: " + ds.rateOfDiscount()); //discount for >=200 and <= 400 g durian
			disc = ds.rateOfDiscount();
			p2 = 12 * (1 - disc); //rm12 for >=200 and <= 400 g durian
			
			totalPrice(p2);
			
			System.out.println(name);
			System.out.println("If you buy " + g + " g of durian, Total Discount Price: RM" + df2.format(totalPrice(p2)));
			System.out.println("If the durian LESS THAN EQUALS to 200g and MORE THAN EQUALS 400g" + ", Total Calories: " + df2.format(calories(g)) + " kcal");
		} else {
			int qt = 2;
			double gg = 602;
			calories(gg, qt);

			p3 = 15; //rm15 for > 602 g durian
			
			Discount dsc = new DurianDiscount(); //create new object (discount for > 602 g durian)
			System.out.println("DISCOUNT: " + dsc.rateOfDiscount()); //discount for > 602 g durian
			disc = dsc.rateOfDiscount();

			totalPrice(disc, p3); //call method totalPrice
			
			System.out.println(name);
			System.out.println("If you buy " + gg + " g of durian, Total Discount Price: RM" + df2.format(totalPrice(disc, p3)));
			System.out.println("If the durian is MORE THAN 602g, Total Calories: " + df2.format(calories(gg, q)) + " kcal");
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
	
	public double calories() { //overloading method with no argument
		return this.calories * 100;
	}
	
	public double calories(double g) { //overloading method with one argument
		return this.calories * g;
	}
	
	public double calories(double gg, int q) { //overloading method with two arguments
		return this.calories * gg * q;
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
			   "\nCalories\t\t\t: " + calories + " kcal per gram" +
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nDiscount\t\t\t: " + df2.format(disc) + 
			   "\nTotal Price (without discount)  : RM " + df2.format(totalPrice()) +
			   printEvidence();
	}

}