package profileFruits;

public class Main {
	public static void main(String[] args) {
		
	Fruits apple  = new Fruits();
	Fruits pineapple = new Fruits();
	Fruits durian = new Fruits();
	Fruits mango = new Fruits();
	
	apple.printFruits("Apple", "red", "smooth", "nutrients and vitamins", true);
	apple.printFunc();
	apple.printWeight(100, 5);
	apple.getHarvest(86.14, 2018);
	
	System.out.println("\n---------------------------------------------------------------------------------");
	
	pineapple.printFruits("Pineapple", "green", "rough", "thiamin, magnesium, potassium", true);
	pineapple.printFunc();
	pineapple.printWeight(903, 2);
	pineapple.getHarvest(27.92, 2018);
	
	System.out.println("\n---------------------------------------------------------------------------------");
	
	durian.printFruits("Durian", "green", "rough", "vitamin B, vitamin C, manganese", false);
	durian.printFunc();
	durian.printWeight(1500, 2);
	durian.getHarvest(337.25, 2019);
	
	System.out.println("\n---------------------------------------------------------------------------------");
	
	mango.printFruits("Mango", "yellow", "smooth", "choline, vitamin A, folate", true);
	mango.printFunc();
	mango.printWeight(150, 6);
	mango.getHarvest(55.38, 2018);
	
	}
}
