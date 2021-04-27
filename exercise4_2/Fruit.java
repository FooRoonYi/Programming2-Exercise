package exercise4_2;

public class Fruit { //super class
	
	private String name;
	
	public Fruit() { //constructor for super class without parameter
		name = " ";
	}
	
	public Fruit(String name) { //constructor for super class with parameter
		name = " ";
		
		setInfo(name);
	}
	
	public void setInfo(String name) {
		name = " ";
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return "Fruit constructor is invoked";
	}
	
}//end for Fruit class
