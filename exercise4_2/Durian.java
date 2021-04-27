package exercise4_2;

public class Durian extends Fruit{ //sub class of Fruit
	
	private char thorns;
	protected int calories;
	
	public Durian() { //constructor without argument
		super();//inherit data, method from super class(constructor with no argument)
		calories = 0;
	}
	public Durian(String name, char t, int c) { //constructor sub class with argument
		super(name); //called method in superclass with passing parameter
		thorns = t;
		calories = c;
		
		//durian
		setInfo(name, t, c); //method for overloading
	}
	
	public void setInfo(String name, char t, int c) { //overloading method with parameters
		if(name.equals(null))
			name = " ";
		else
			name = name;
		
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
