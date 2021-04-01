package EXERCISE2i;

public class Fruit {
	
	String colour[] = {"red", "green"}, appearance[] = {"smooth", "rough"};
	String mC = "nutrients and vitamins", func;
	Boolean f = true;
	Boolean provideVitamins = true, reduceRiskHeartDisease = true, preventConstipation = true, provideHealthBenefits = true;
	
	void printFunc() {
		func = "provide vitamins, reduce risk of heart disease, prevent constipation, provide health benefits";
		System.out.println(func + ".");
	}
}
