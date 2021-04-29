package exercise4_3;

import exercise4_2.Fruit;

public class Mango extends Fruit{ //subclass of Fruit
	
	private String size;
	private int weight;
	
	public Mango() { //constructor without argument
		super(); //inherit data, method from super class(constructor with no argument)
		size = " ";
		weight = 0;
	}
	public Mango(String n, String s, int w) { //constructor sub class with argument
		super(n); //called method in superclass with passing parameter
		size = s;
		weight = w;
		
		//mango
		setInfo(); //overloading method without parameter
		//setInfo(n); //overloading method with 1 parameter
		setInfo(n, s, w); //method for overloading
	}
	
	public void setInfo() { //overloading method 1 without parameter
		System.out.println("My info is here: ");
	}
	
	public void setInfo(String n) { //overloading method 2 with one parameter
		System.out.println("Helloooo!");
	}
	
	public void setInfo(String n, String s, int w) { //overloading method with parameters
		
		System.out.println("I am one of the fruits. Guess me: " + n);
		
		if(name.equals(null))
			name = " ";
		else
			name = n;
		
		if(w >= 0)
			weight = w;
		else 
			w = 0;
	}
	
	public String getSizeMango() {
		return size;
	}
	
	public int getWeightMango() {
		return weight;
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nSize of the mango\t\t: " + size +
			   "\nWeight of " + size + " mango\t\t: " + weight + " g";
	}
	
} //end for Mango extends Fruit
