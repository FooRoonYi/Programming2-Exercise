package exercise4_2;

public class Mango extends Fruit{ //subclass of Fruit
	
	private String size;
	private int weight;
	
	public Mango() { //constructor without argument
		super(); //inherit data, method from super class(constructor with no argument)
		size = " ";
		weight = 0;
	}
	public Mango(String name, String s, int w) { //constructor sub class with argument
		super(name); //called method in superclass with passing parameter
		size = s;
		weight = w;
		
		setInfo(name, s, w); //method for overloading
	}
	
	public void setInfo(String name, String s, int w) { //overloading method with parameters
		if(name.equals(null))
			name = " ";
		else
			name = name;
		
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
