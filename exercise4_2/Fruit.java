package exercise4_2;

public class Fruit { //super class
	
	protected String name;
	
	public Fruit() { //constructor for super class without parameter
		name = " ";
	}
	
	public Fruit(String n) { //constructor for super class with parameter
		name = " ";
		
		setInfo(n);
	}
	
	public void setInfo(String n) {
		if(name.equals(null))
			name = " ";
		else
			name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return "Fruit constructor is invoked";
	}
	
}//end for Fruit class
