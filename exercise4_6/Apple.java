package exercise4_6;
import java.text.DecimalFormat;
public class Apple extends Fruit { //sub class of Fruit

	protected static DecimalFormat df2 = new DecimalFormat("#.##");
	
	protected int quantity;
	protected double price, disc;
	
	public Apple(String name, int q, double p) { //constructor sub class with argument
		super(name); //called method in superclass with passing parameter
		this.quantity = q;
		this.price = p;
		
		System.out.println(name);
		
		//call totalPrice for each of the fruits (upcasting)
		PriceFruits atp = new AppleTotalPrice();
		PriceFruits ratp = new RedAppleTotalPrice();
		PriceFruits gatp = new GreenAppleTotalPrice();
		PriceFruits dtp = new DurianTotalPrice();
		PriceFruits mtp = new MangoTotalPrice();
		
		if(this.quantity < 10) {
			
			double tPrice = price*quantity;
			System.out.println("If quantity LESS than 10, Total Price: RM" + df2.format(tPrice));
			
		} 
		else if(this.quantity >= 10 && this.quantity <= 75) {
			
			//calculate the total price for each fruits by totalPrice(double qt)
			
			if(name.equals("Apple")) {
				System.out.println("If quantity MORE than 10, Total Price: RM" + df2.format(atp.totalPrice(q)));
				
			} else if (name.equals("Red Apple")){
				System.out.println("If quantity MORE than 10, Total Price: RM" + df2.format(ratp.totalPrice(q)));
				
			} else if(name.equals("Green Apple")) {
				System.out.println("If quantity MORE than 10, Total Price: RM" + df2.format(gatp.totalPrice(q)));
				
			} else if(name.equals("Durian")){
				System.out.println("If quantity MORE than 10, Total Price: RM" + df2.format(dtp.totalPrice(q)));
				
			} else if(name.equals("Mango")) {
				System.out.println("If quantity MORE than 10, Total Price: RM" + df2.format(mtp.totalPrice(q)));
				
			} else {
				System.out.println("There is NO discount!"); //no discount
			}
			
		} 
		else {
			
			//calculate the total price for each fruits by totalPrice(double disc, double qt)
			
			if(name.equals("Apple")) {
				
				Discount dd = new AppleDiscount(); //create new object for apple
				disc = dd.rateOfDiscount();
				System.out.println("DISCOUNT: " + disc);
				System.out.println("If quantity MORE than 100, Total Discount Price: RM" + df2.format(atp.totalPrice(disc, q)));
				
			} else if (name.equals("Red Apple")){
				
				Discount d1 = new RedAppleDiscount(); //create new object for red apple
				disc = d1.rateOfDiscount();
				System.out.println("DISCOUNT: " + disc);
				System.out.println("If quantity MORE than 100, Total Discount Price: RM" + df2.format(ratp.totalPrice(disc, q)));
				
			} else if(name.equals("Green Apple")) {
				
				Discount d2 = new GreenAppleDiscount(); //create new object for green apple
				disc = d2.rateOfDiscount();
				System.out.println("DISCOUNT: " + disc);
				System.out.println("If quantity MORE than 100, Total Discount Price: RM" + df2.format(gatp.totalPrice(disc, q)));
				
			} else if(name.equals("Durian")){
				
				Discount d3 = new DurianDiscount(); //create new object for durian
				disc = d3.rateOfDiscount();
				System.out.println("DISCOUNT: " + disc);
				System.out.println("If quantity MORE than 100, Total Discount Price: RM" + df2.format(dtp.totalPrice(disc, q)));
				
			} else if(name.equals("Mango")) {
				
				Discount d4 = new MangoDiscount(); //create new object for mango
				disc = d4.rateOfDiscount();
				System.out.println("DISCOUNT: " + disc);
				System.out.println("If quantity MORE than 100, Total Discount Price: RM" + df2.format(mtp.totalPrice(disc, q)));
				
			} else {
				
				System.out.println("There is NO discount!"); //no discount
			}
			
		}
	}
	
	public String printEvidence() { //overriding
		return "\nFrequent " + name.toUpperCase() + " consumption can reduce total cholesterol and risks of heart disease.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nDiscount\t\t\t: " + disc + 
			   printEvidence();
	}
		
}//end for class Apple extends Fruit
