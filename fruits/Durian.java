package fruits;

public class Durian extends Fruit{
	
	private char thorns;
	protected int calories;
	
	public Durian(String name, char t, int c) {
		super(name);
		this.thorns = t;
		this.calories = c;
		System.out.println("Durian constructor is invoked");
	}
	
	public char HasThorns() {
		return 'y';
	}
	
	public int calories() {
		return this.calories;
	}
}
