package exercise4_6;

public abstract class Fruit {
	//define super class as abstract class coz no need to create instance of fruit
	//Class which declare as abstract cannot create instance object
	
	protected String name;
	
	public Fruit(String name) {
		this.name = name;
	}
	
} //end class Fruit
