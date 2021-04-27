package exercise4_2;

public class GreenApple extends Apple{ //subclass of GreenApple

	private String taste;
	private boolean difference;
	
	public GreenApple() { //constructor for sub class
		super(); //inherit data, method from super class(constructor with no argument)
		taste = " ";
		difference = true;
	}
	
	public GreenApple(String name, int q, double p, String t, boolean d) { //constructor sub class with argument
		super(name, q, p); //called method in superclass with passing parameter
		taste = t;
		difference = d;
		
		//green apple
		setInfo(name, q, p, t, d); //method for overloading
	}
	
	public void setInfo(String name, int q, double p, String t, boolean d) { //overloading method with parameters
		if(name.equals(null))
			name = " ";
		else
			name = name;
		
		if(d == true)
			difference = d;
		else
			difference = false;
	}
	
	public String getTasteGreenApple() {
		return taste;
	}
	
	public double getCalprice() {
		return super.price * super.quantity;
	}
	
	public boolean getDiffer() {
		return difference;
		
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nQuantity\t\t\t: " + quantity +
			   "\nPrice\t\t\t\t: RM " + price + 
			   "\nTotal price\t\t\t: RM " + getCalprice() +
			   "\nTaste\t\t\t\t: " + taste + 
			   "\nIs the green apple more sour than the red apple?: " + difference;
	}
	
}//end for RedApple extends Apple
