package exercise4_4;

public class Main { 
	
	public static void main(String[] args) {
		
		//Fruit f = new Fruit("Orange"); //no need new object for super class //universal
		
		Apple a = new Apple("Apple", 65, 1.99); //new object for sub class
		System.out.println("---------------------------------------------------------------");
		System.out.println("Quantity\t\t\t: " + a.quantity);
		System.out.println("Price\t\t\t\t: RM " + a.price);
		System.out.println("---------------------------------------------------------------\n" + a.toString());
		
		System.out.println();
		
		RedApple r = new RedApple("Red Apple", 6, 7.92, "bright red");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Quantity\t\t\t: " + r.quantity);
		System.out.println("Price\t\t\t\t: RM " + r.price);
		System.out.println("Colour\t\t\t\t: " + r.colour());
		System.out.println("------------------------------------------------------------------------\n" + r.toString());
		
		System.out.println();
		
		GreenApple g = new GreenApple("Green Apple", 105, 0.65, "sour", true);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Quantity\t\t\t: " + g.quantity);
		System.out.println("Price\t\t\t\t: RM " + g.price);
		System.out.println("Colour\t\t\t\t: " + g.tasteGreenApple());
		System.out.println("The green apple is more sour.   : " + g.differ());
		System.out.println("------------------------------------------------------------------------\n" + g.toString());
		
		System.out.println();
		
		Durian d = new Durian("Durian", 'y', 1.47, 602);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Does the durian have thorns?\t: " + d.HasThorns());
		System.out.println("Calories\t\t\t: " + d.calories() + " per 100 grams");
		System.out.println("------------------------------------------------------------------------\n" + d.toString());
		
		System.out.println();
		
		Mango m = new Mango("Mango", "king size", 1000);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Size\t\t\t\t: " + m.sizeMango());
		System.out.println("This " + m.sizeMango() + " of mango has the weight of " + m.weightMango() + "g.");
		System.out.println("------------------------------------------------------------------------\n" + m.toString());
		
	}
}