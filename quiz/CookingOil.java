package quiz;

import java.util.Scanner;

public class CookingOil {
	
	Scanner sc = new Scanner(System.in);
	String type;
	String madeOf;
	Float boilingPoint;
	Float smokingPoint;
	double density;
	int price;
	
	//create setter method
	public void setType() {
		System.out.println("Type: ");
		this.type = sc.nextLine();
	}
	
	public void setMadeOf() {
		System.out.print("It is made of:  ");
		this.madeOf = sc.nextLine();
	}
	
	public void setBP() {
		System.out.print("Boiling point:  ");
		this.boilingPoint = sc.nextFloat();
	}
	
	public void setSP() {
		System.out.print("Smoking Point:  " );
		this.smokingPoint = sc.nextFloat();
	}
	
	public void setDensity() {
		System.out.print("Density:  ");
		this.density = sc.nextDouble();
	}
	
	public void setPrice() {
		System.out.print("Price: ");
		this.price = sc.nextInt();
	}
	
	//create getter method
	public String gettype() {
		return this.type;
	}
	
	public String getMadeOf() {
		return this.madeOf;
	}
	
	public float getBoilingPoint() {
		return this.boilingPoint;
	}
	
	public float getSmokingPoint() {
		return this.smokingPoint;
	}
	
	public double getDensity() {
		return this.density;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
}
