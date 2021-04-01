package EXERCISE2;

public class Fruit {
	
	String c = "red", colour = "green", mC = "nutrients and vitamins", a = "smooth", r = "rough", func;
	Boolean f = true;
	Boolean provideVitamins = true, reduceRiskHeartDisease = true, preventConstipation = true, provideHealthBenefits = true;
	
	void printColour() {
		System.out.println(("colour = " + c);
		System.out.println(("colour = " + colour);
	}
	
	void printMainComponents() {
		System.out.println("Fruits contain " + mC);
	}
	
	void printFragrance() {
		System.out.println("Does the fruit have fragrance?: " + f);
	}
	
	void printAppearance() {
		System.out.println("The appearance of the fruits is " + a);
		System.out.println("The appearance of the fruits is " + r);
	}
	
	
	
	void printFunc() {
		func = "provide vitamins, reduce risk of heart disease, prevent constipation, provide health benefits";
		System.out.println(func + ".");
	}
}
