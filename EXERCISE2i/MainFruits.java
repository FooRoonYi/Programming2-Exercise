package EXERCISE2i;

public class MainFruits {
	public static void main(String[] args) {

		Fruit apple = new Fruit();
		System.out.println("The fruit is apple.");
		System.out.println("Colour:" + apple.colour[0]);
		System.out.println("Main Components: " + apple.mC);
		System.out.println("Does it have fragrance?: " + apple.f);
		System.out.println("Appearance: " + apple.appearance[0]);

		System.out.println("\nDoes the apple can provide vitamins?: " + apple.provideVitamins);
		System.out.println("Does the apple can reduce risk of heart disease?: " + apple.reduceRiskHeartDisease);
		System.out.println("Does the apple can prevent constipation?: " + apple.preventConstipation);
		System.out.println("Does the apple can provide health benefits?: " + apple.provideHealthBenefits);
		
		
		System.out.print("\nHence, the apple can ");
		apple.printFunc();
		System.out.println("\n-------------------------------------------------------------------------------------------------\n");

		Fruit Pineapple = new Fruit();
		System.out.println("The fruit is pineapple.");
		System.out.println("Colour:" + Pineapple.colour[1]);
		System.out.println("Main Components: " + Pineapple.mC);
		System.out.println("Does it have fragrance?: " + Pineapple.f);
		System.out.println("Appearance: " + Pineapple.appearance[1]);
		
		System.out.println("\nDoes the pineapple can provide vitamins?: " + apple.provideVitamins);
		System.out.println("Does the pineapple can reduce risk of heart disease?: " + apple.reduceRiskHeartDisease);
		System.out.println("Does the pineapple can prevent constipation?: " + apple.preventConstipation);
		System.out.println("Does the pineapple can provide health benefits?: " + apple.provideHealthBenefits);
		
		System.out.print("\nHence, the pineapple can ");
		Pineapple.printFunc();

	}
}
