package exercise4_3;

import exercise4_2.Fruit;

public class Durian extends Fruit{ //sub class of Fruit
	
	private char thorns;
	protected int calories;
	
	public Durian() { //constructor without argument
		super();//inherit data, method from super class(constructor with no argument)
		calories = 0;
	}
	public Durian(String n, char t, int c) { //constructor sub class with argument
		super(n); //called method in superclass with passing parameter
		thorns = t;
		calories = c;
		
		//durian
		setInfo(); //overloading method without parameter
		//setInfo(n); //overloading method with 1 parameter
		setInfo(n, t, c); //method for overloading
	}
	
	public void setInfo() { //overloading method 1 without parameter
		System.out.println("My info is here: ");
	}
	
	public void setInfo(String n) { //overloading method 2 with one parameter
		System.out.println("Hi! Do you know about me?");
	}
	
	public void setInfo(String n, char t, int c) { //overloading method with parameters
		
		System.out.println("I am one of the fruits. Guess me: " + n);
		
		if(name.equals(null))
			name = " ";
		else
			name = n;
		
		if(c >= 0)
			calories = c;
		else 
			c = 0;
	}
	
	public char HasThorns() {
		return 'y';
	}
	
	public int getCalories() {
		return calories;
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nDoes the durian have thorns?\t: " + HasThorns() +
			   "\nCalories\t\t\t: " + calories + " kcal";
	}
	
} //end for Durian extends Fruit
