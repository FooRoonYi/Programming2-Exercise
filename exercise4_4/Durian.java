package exercise4_4;
import java.text.DecimalFormat;
public class Durian extends Fruit{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	private char thorns;
	private double calories;
	private double grams;
	
	public Durian(String name, char t, double c, double g) { //constructor sub class with argument
		super(name); //called method in superclass with passing parameter
		this.thorns = t;
		this.calories = c;
		this.grams = g;
		
		//System.out.println("Durian constructor is invoked");
		
		if(this.grams == 100) {
			calories();
			System.out.println(name);
			System.out.println("If the durian EQUALS to 100g, Total Calories: " + df2.format(calories()) + " kcal");
		} else if(this.grams <= 200 && this.grams >= 400) {
			g = 1.47;
			calories(g);
			System.out.println(name);
			System.out.println("If the durian LESS THAN EQUALS to 200g and MORE THAN EQUALS 400g"
					              + ", Total Calories: " + df2.format(calories(g)) + " kcal");
		} else if(this.grams >= 602){
			int q = 2;
			double gg = 602;
			calories(gg, q);
			System.out.println(name);
			System.out.println("If the durian is MORE THAN 602g, Total Calories: " + df2.format(calories(gg, q)) + " kcal");
		} else {
			System.out.println(name);
			System.out.println("It cannot be calculated");
		}
	}
	
	public double calories() {
		return this.calories * 100;
	}
	
	public double calories(double g) {
		return this.calories * g;
	}
	
	public double calories(double gg, int q) {
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
			   printEvidence();
	}
	

}
