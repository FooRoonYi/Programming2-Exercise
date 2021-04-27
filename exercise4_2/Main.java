package exercise4_2;

public class Main {
	
	public static void main(String[] args) {

			//Fruit f = new Fruit(); //universal 
	
			Apple a = new Apple("Apple", 6, 2.99);
			System.out.println("-------Apple-------\n" + a);
			
			System.out.println();
			
			RedApple r = new RedApple("Red apple", 6, 7.92, 6, "bright red");
			System.out.println("-------Red Apple-------\n" + r);
			
			System.out.println();
			
			GreenApple g = new GreenApple("Green Apple", 12, 0.98, "sour", true);
			System.out.println("-------Green Apple-------\n" + g);
		
			System.out.println();
			
			Durian d = new Durian("Durian", 'y', 885);
			System.out.println("-------Durian-------\n" + d);
			
			System.out.println();
			
			Mango m = new Mango("Mango", "medium", 200);
			System.out.println("-------Mango-------\n" + m);
			
	}	
}
