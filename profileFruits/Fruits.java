package profileFruits;

public class Fruits {

	String fruits, colour, appearance, mC, func;
	Boolean f;
	
	void printFruits(String fr, String c, String a, String m, Boolean fragrant) {
		System.out.println("Fruit: " + fr);
		System.out.println("Colour: " + c);
		System.out.println("Appearance: " + a);
		System.out.println("Main Components: " + m);
		System.out.println("Does the fruit has fragrance?:  " + fragrant);
	}
		
	void printFunc() {
		func = "provide vitamins, reduce risk of heart disease, prevent constipation, provide health benefits";
		System.out.println("It can " + func + ".");
	}
	
	void printWeight(int w, int q) {
		int average = w * q;
		System.out.println("The average weight of " + q + " of the fruit is " + average + " g.");
	}
	
	void getHarvest(double mt, int year) {
		System.out.println("It was harvested with " + mt + " millions metric tonnes at " + year + ".");
	}
}
