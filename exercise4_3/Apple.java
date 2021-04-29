package exercise4_3;

import exercise4_2.Fruit;

public class Apple extends Fruit { //sub class of Fruit
	
	protected int quantity;
	protected double price;
	
	public Apple() { //constructor for sub class
		super(); //inherit data, method from super class(constructor with no argument)
		quantity = 0;
		price = 0;
	}
	
	public Apple(String n, int q, double p) { //constructor sub class with argument
		super(n); //called method in superclass with passing parameter
		quantity = q;
		price = p;
		
		//apple
		setInfo(); //overloading method without parameter
		//setInfo(n); //overloading method with one parameter
		setInfo(n, q, p); //method for overloading
	}
	
	public void setInfo() { //overloading method 1 without parameter
		System.out.println("My info is here: ");
	}
	
	public void setInfo(String n) { //overloading method 2 with one parameter
		System.out.println("Hi there!");
	}
	
	public void setInfo(String n, int q, double p) { //overloading method 3 with 3 parameters
		
		System.out.println("I am one of the fruits. Guess me: " + n);
		
		if(name.equals(null))
			name = " ";
		else
			name = n;
		
		if(q >= 0)
			quantity = q;
		else
			quantity = 0;
		
		if(p >= 0)
			price = p;
		else
			price = 0;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double totalPrice() { //overriding method
		return price * quantity;
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name + 
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nTotal Price\t\t\t: " + totalPrice();
	}
	
}//end for class Apple extends Fruit
