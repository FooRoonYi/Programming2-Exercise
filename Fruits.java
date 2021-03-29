package EXERCISE2;

public class Fruits {

	public static void main(String[] args) {

		Fruit1 apple = new Fruit1();
		System.out.println("The fruit is apple.");
		System.out.println("Colour: " + apple.c);
		System.out.println("Main Components: " + apple.mC);
		System.out.println("Does it have fragrance?: " + apple.f);
		System.out.println("Appearance: " + apple.a);

		apple.printFunc();
		System.out.println();

		Fruit2 Pineapple = new Fruit2();
		System.out.println("The fruit is pineapple.");
		System.out.println("Colour: " + Pineapple.c);
		System.out.println("Main Components: " + Pineapple.mC);
		System.out.println("Does it have fragrance?: " + Pineapple.f);
		System.out.println("Appearance: " + Pineapple.a);

		Pineapple.printFunc();

	}

}
