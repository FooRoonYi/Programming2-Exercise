package fruits;

public class Apple extends Fruit {
	
	protected int quantity;
	protected double price;
	
	public Apple(String name, int q, double p) {
		super(name);
		this.quantity = q;
		this.price = p;
		
		System.out.println("Apple constructor is invoked");
	}
	
	public double totalPrice() {
		return this.price * this.quantity;
	}
}
