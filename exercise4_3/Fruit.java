package exercise4_3;

public class Fruit { //super class
	
	protected  String name;
	
	public Fruit() { //constructor for super class without parameter
		name = " ";
	}
	
	public Fruit(String n) { //constructor for super class with parameter
		name = " ";
		
		setInfo(n);
	}
	public void setInfo() { //overloading method 1 without parameter
		System.out.println(" ");
	}
	
	public void setInfo(String n) { //overloading method 2 with one parameter
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

