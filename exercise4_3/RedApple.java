package exercise4_3;

import exercise4_2.Apple;

public class RedApple extends Apple { //subclass of Apple
	
	private String colour;
	private int pack;
	
	public RedApple() { //constructor for sub class
		super(); //inherit data, method from super class(constructor with no argument)
		colour = " ";
		pack = 0;
	}
	public RedApple(String n, int q, double p, int pk, String c) { //constructor sub class with argument
		super(n, q, p); //called method in superclass with passing parameter
		pack = pk;
		colour = c;
		
		//red apple
		setInfo(); //overloading method without parameter
		//setInfo(n); //overloading method with one parameter
		setInfo(n, q, p, pk, c); //method for overloading
	}
	
	public void setInfo() { //overloading method 1 without parameter
		System.out.println("My info is here: ");
	}
	
	public void setInfo(String n) { //overloading method 2 with one parameter
		System.out.println("Hello!");
	}
	
	public void setInfo(String n, int q, double p, int pk, String c) { //overloading method with parameters
		
		System.out.println("I am one of the fruits. Guess me: " + n);
		
		if(name.equals(null))
			name = " ";
		else
			name = n;
		
		if(pk >= 0)
			pack = pk;
		else
			pack = 0;
	}
	
	public String getColour() {
		return colour;
	}
	
	public int getPackRedApple() {
		return this.pack;
	}
	
	public double totalPrice() { //overriding method
		return super.quantity / pack * super.price;
	}

	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nQuantity\t\t\t: " + quantity +
			   "\nOne pack\t\t\t: " + pack + " apples" +
			   "\nPrice\t\t\t\t: RM " + price + " (per pack)" +
			   "\nTotal price\t\t\t: RM " + totalPrice() + " per pack" +
			   "\nThere are " + pack + " apples in one pack.";
	}
	
} //end for RedApple extends Apple
