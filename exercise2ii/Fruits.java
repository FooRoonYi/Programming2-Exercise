package exercise2ii;

import java.util.*;

public class Fruits {
	
	Scanner sc = new Scanner(System.in);
	
	void printFruits() {
		System.out.print("Fruit Name: ");
		String fr = sc.nextLine();
		System.out.print("Fruit Color: ");
		String c = sc.nextLine();
		System.out.print("Main Components: ");
		String mC = sc.nextLine();
		System.out.print("Fruit Appearance (R for rough / S for smooth): ");
		char a = sc.next().charAt(0);
		System.out.print("Does the fruit has fragrance? (Y/N): ");
		String f = sc.next().toLowerCase();
	}
	
	void printFunc() {
		System.out.print("It can provide vitamins. : ");
		Boolean proVitamins = sc.nextBoolean();
		System.out.print("It can reduce risk of heart disease. : ");
		Boolean reduceRisk = sc.nextBoolean();
		System.out.print("It can prevent constipation. : ");
		Boolean preCons = sc.nextBoolean();
		System.out.print("It can provide health benefits. : ");
		Boolean provHB = sc.nextBoolean();
	}
	
	void printWeight() {
		System.out.print("Weight: ");
		double w = sc.nextDouble();
		System.out.print("Quantity: ");
		int q = sc.nextInt();
		
		double average = w * q;
		
		System.out.println("The average weight of " + q + " of the fruit is " + average + " g.");
		
		double kg = average/1000;
		
		System.out.println("Hence, it is " + kg + " in kg.");
	}
	
	void getHarvest() {
		System.out.print("Million tonnes in certain year: ");
		double mt = sc.nextDouble();
		System.out.print("Year: ");
		int year = sc.nextInt();
		System.out.println("It was harvested with " + mt + " millions metric tonnes at " + year + ".");
		
		double aveMT = mt/12;
		System.out.println("The fruits harvested can get " + aveMT + " million tonnes per 12 months in a year.");
	}
	
}
