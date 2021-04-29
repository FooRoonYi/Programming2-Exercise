package exercise4_3;

import exercise4_2.Apple;

public class GreenApple extends Apple{ //subclass of GreenApple

	private String taste;
	private boolean difference;
	
	public GreenApple() { //constructor for sub class
		super(); //inherit data, method from super class(constructor with no argument)
		taste = " ";
		difference = true;
	}
	
	public GreenApple(String n, int q, double p, String t, boolean d) { //constructor sub class with argument
		super(n, q, p); //called method in superclass with passing parameter
		taste = t;
		difference = d;
		
		//green apple
		setInfo(); //overloading method without parameter
		//setInfo(n); //overloading method with 1 parameter
		setInfo(n, q, p, t, d); //method for overloading
	}
	
	public void setInfo() { //overloading method 1 without parameter
		System.out.println("My info is here: ");
	}
	
	public void setInfo(String n) { //overloading method 2 with one parameter
		System.out.println("Hiii!");
	}
	
	public void setInfo(String n, int q, double p, String t, boolean d) { //overloading method with parameters
		
		System.out.println("I am one of the fruits. Guess me: " + n);
		
		if(name.equals(null))
			name = " ";
		else
			name = n;
		
		if(d == true)
			difference = d;
		else
			difference = false;
	}
	
	public String getTasteGreenApple() {
		return taste;
	}
	
	public double totalPrice() {
		return super.price * super.quantity;
	}
	
	public boolean getDiffer() {
		return difference;
		
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nQuantity\t\t\t: " + quantity +
			   "\nPrice\t\t\t\t: RM " + price + 
			   "\nTotal price\t\t\t: RM " + totalPrice() +
			   "\nTaste\t\t\t\t: " + taste + 
			   "\nIs the green apple more sour than the red apple?: " + difference;
	}
	
}//end for RedApple extends Apple
