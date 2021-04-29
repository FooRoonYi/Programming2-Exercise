package exercise4_3;

public class Main {
	
	public static void main(String[] args) {

			//Fruit f = new Fruit(); //universal 
			System.out.println("\t\t\tFruits");
			System.out.println("======================================================");
		
			Apple a = new Apple("Apple", 6, 2.99);
			System.out.println("------------------------------------------------------\n" + a);
			System.out.println("------------------------------------------------------\n");
			
			System.out.println();
			
			RedApple r = new RedApple("Red apple", 6, 7.92, 6, "bright red");
			System.out.println("------------------------------------------------------\n" + r);
			System.out.println("------------------------------------------------------\n");
			
			System.out.println();
			
			GreenApple g = new GreenApple("Green Apple", 12, 0.98, "sour", true);
			System.out.println("------------------------------------------------------\n" + g);
			System.out.println("------------------------------------------------------\n");
			
			System.out.println();
			
			Durian d = new Durian("Durian", 'y', 885);
			System.out.println("------------------------------------------------------\n" + d);
			System.out.println("------------------------------------------------------\n");
			
			System.out.println();
			
			Mango m = new Mango("Mango", "medium", 200);
			System.out.println("------------------------------------------------------\n" + m);
			System.out.println("------------------------------------------------------\n");
			
	}	
}
