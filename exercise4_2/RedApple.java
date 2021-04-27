package exercise4_2;

public class RedApple extends Apple { //subclass of Apple
	
	private String colour;
	private int pack;
	
	public RedApple() { //constructor for sub class
		super(); //inherit data, method from super class(constructor with no argument)
		colour = " ";
		pack = 0;
	}
	public RedApple(String name, int q, double p, int pk, String c) { //constructor sub class with argument
		super(name, q, p); //called method in superclass with passing parameter
		pack = pk;
		colour = c;
		
		//red apple
		setInfo(name, q, p, pk, c); //method for overloading
	}
	
	public void setInfo(String name, int q, double p, int pk, String c) { //overloading method with parameters
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
	
	public double calPrice() {
		return super.quantity / pack * super.price;
	}

	public String toString() { //overriding method
		return "Quantity    : " + quantity +
			   "\nOne pack    : " + pack + " apples" +
			   "\nThere are " + pack + " apples in one pack." +
			   "\nPrice       : RM " + price + " (per pack)" +
			   "\nTotal price : RM " + calPrice() + " per pack";
	}
	
} //end for RedApple extends Apple
