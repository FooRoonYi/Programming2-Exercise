package exercise2ii;

public class Main {

	public static void main(String[] args) {
		
		Fruits apple = new Fruits();
		Fruits pineapple = new Fruits();
		Fruits durian = new Fruits();
		Fruits mango = new Fruits();
		
		apple.printFruits();
		
		System.out.println();
		System.out.println("FUNCTIONS OF THE FRUITS......");
		apple.printFunc();
		
		System.out.println();
		apple.printWeight();
		
		System.out.println();
		apple.getHarvest();
		
		System.out.println("===============================================");
		
		pineapple.printFruits();
		
		System.out.println();
		System.out.println("FUNCTIONS OF THE FRUITS......");
		pineapple.printFunc();
		
		System.out.println();
		pineapple.printWeight();
		
		System.out.println();
		pineapple.getHarvest();
		
		System.out.println("===============================================");
		
		durian.printFruits();
		
		System.out.println();
		System.out.println("FUNCTIONS OF THE FRUITS......");
		durian.printFunc();
		
		System.out.println();
		durian.printWeight();
		
		System.out.println();
		durian.getHarvest();
		
		System.out.println("===============================================");
		
		mango.printFruits();
		
		System.out.println();
		System.out.println("FUNCTIONS OF THE FRUITS......");
		mango.printFunc();
		
		System.out.println();
		mango.printWeight();
		
		System.out.println();
		mango.getHarvest();
		
	}

}
