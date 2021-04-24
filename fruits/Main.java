package fruits;

import java.text.DecimalFormat;

public class Main {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	public static void main(String[] args) {
		
		Fruit f = new Fruit("Orange");
		
		System.out.println();
		
		Apple a = new Apple("Apple", 6, 2.99);
		System.out.println("Total price: RM" + a.totalPrice());
		
		System.out.println();
		
		RedApple r = new RedApple("Red apple", 6, 7.92, 6, "bright red");
		System.out.println("Colour of red apple: " + r.colour());
		System.out.println("There are " + r.packRedApple() + " red apples in one pack.");
		System.out.println("Total price: RM" + df2.format(r.calPrice()));
		
		System.out.println();
		
		GreenApple g = new GreenApple("Green Apple", 12, 0.98, null, true);
		System.out.println("Price of green apple: RM" + df2.format(g.calprice()));
		System.out.println("Is the green apple more sour than the red apple?: " + g.differ());
		
		System.out.println();
		
		Durian d = new Durian("Durian", 'y', 885);
		System.out.println("Does the durian have thorns?: " + d.HasThorns());
		System.out.println("Calories(calories): " + d.calories());
		
		System.out.println();
		
		Mango m = new Mango("Mango", "medium", 200);
		System.out.println("Size: " + m.sizeMango());
		System.out.println("This " + m.sizeMango() + " size of mango has the weight of " + m.weightMango() + "g.");
		
	}
}
