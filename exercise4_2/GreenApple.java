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
		return "Quantity    : " + quantity +
			   "\nPrice       : RM " + price + 
			   "\nTotal price : RM " + getCalprice() +
			   "\nTaste       : " + taste + 
			   "\nIs the green apple more sour than the red apple?: " + difference;
	}
	
}//end for RedApple extends Apple
