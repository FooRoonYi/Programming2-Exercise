package fruits;

public class Mango extends Fruit{
	
	private String size;
	private int weight;
	
	public Mango(String name, String s, int w) {
		super(name);
		this.size = s;
		this.weight = w;
		
		System.out.println("Mango constructor is invoked");
	}
	
	public String sizeMango() {
		return this.size;
	}
	
	public int weightMango() {
		return this.weight;
	}
}
