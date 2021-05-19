package exercise4_6;

public class Main { 
	
	public static void main(String[] args) {
		
		//Fruit f = new Fruit("Orange"); //no need new object for super class //universal
		
		//apple
		Apple a = new Apple("Apple", 1055, 1.99); //new object for sub class
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println(a.toString());
		System.out.println("--------------------------------------------------------------------------------------------");
		
		System.out.println();
		
		//red apple
		RedApple r = new RedApple("Red Apple", 5058, 0.88, "bright red");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println(r.toString());
		System.out.println("--------------------------------------------------------------------------------------------");
		
		System.out.println();
		
		//green apple
		GreenApple g = new GreenApple("Green Apple", 105, 0.92, "sour", true);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println(g.toString());
		System.out.println("--------------------------------------------------------------------------------------------");
		
		System.out.println();
		
		//durian
		Durian d = new Durian("Durian", 'y', 3, 25);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println(d.toString());
		System.out.println("--------------------------------------------------------------------------------------------");
		
		System.out.println();
		
		//mango
		Mango m = new Mango("Mango", "medium size", 243, 6.50, 35);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println(m.toString());
		System.out.println("--------------------------------------------------------------------------------------------");
		
	}
	
}