package exercise4_4;

public class Mango extends Fruit{
	
	private String size;
	private int weight;
	
	public Mango(String name, String s, int w) {
		super(name);
		this.size = s;
		this.weight = w;
		
		//System.out.println("Mango constructor is invoked");
		
		if(this.size.equals("baby mango")) {
			sizeMango();
			System.out.println(name);
			System.out.println("If it is baby mango, then it is " + weightMango());
		} else if(this.size.equals("medium size mango")) {
			int q = 6;
			System.out.println(name);
			System.out.println("If it is medium size mango with " + q + " mangoes in 1kg,  then it is " + weightMango(q));
		} else {
			String siz = "king size";
			int qt = 2;
			System.out.println(name);
			System.out.println("If it is " + siz + " mango with quantity of " + qt +  ",  then it is " + weightMango(siz, qt) + " kg.");
		}
	}
	
	
	public int weightMango() {
		return this.weight;
	}
	
	public int weightMango(int q) {
		return this.weight * q;
	}
	
	public int weightMango(String siz, int qt) {
		return (this.weight * qt)/1000;
	}
	
	public String sizeMango() {
		return this.size;
	}
	
	public String printEvidence() { //overriding
		return "\nThe " + size.toUpperCase() + " " + name.toUpperCase() + " has high calories which leads to weight gain.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nSize of the mango\t\t: " + size +
			   "\nWeight of " + size + " mango\t: " + weight + " g" +
			   printEvidence();
		
	}
	
}