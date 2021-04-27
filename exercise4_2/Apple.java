package exercise4_2;

public class Apple extends Fruit { //sub class of Fruit
	
	protected int quantity;
	protected double price;
	
	public Apple() { //constructor for sub class
		super(); //inherit data, method from super class(constructor with no argument)
		quantity = 0;
		price = 0;
	}
	
	public Apple(String name, int q, double p) { //constructor sub class with argument
		super(name); //called method in superclass with passing parameter
		quantity = q;
		price = p;
		
		//apple
		setInfo(name, q, p); //method for overloading
	}
	
	public void setInfo(String name, int q, double p) { //overloading method with parameters
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
	
	public double totalPrice() {
		return price * quantity;
	}
	
	public String toString() { //overriding method
		return "Quantity\t: " + quantity + 
			   "\nPrice\t\t: RM " + price +
			   "\nTotal Price\t: " + totalPrice();
	}
	
}//end for class Apple extends Fruit
