package exercise3_2;
import java.util.*;
public class SunflowerOil {
	
	Scanner sc = new Scanner(System.in);
	
	private String type;
	private int boilingPoint;
	private int smokingPoint;
	private double density;
	
	SunflowerOil(){
		System.out.println("Type: ");
		this.type = sc.nextLine();
		System.out.println("Boiling point: ");
		this.boilingPoint = sc.nextInt();
		System.out.println("Smoking point: ");
		this.smokingPoint = sc.nextInt();
		System.out.println("Density: ");
		this.density = sc.nextDouble();
	}
	
	SunflowerOil(String t, int bp, int sp, double d) {
		this.type = t;
		this.boilingPoint = bp;
		this.smokingPoint = sp;
		this.density = d;
	}
	
	public String getType() {
		return this.type;
	}
	public int getBoilingPoint() {
		return this.boilingPoint;
	}
	
	public int getSmokingPoint() {
		return this.smokingPoint;
	}
	
	public double getDensity() {
		return this.density;
	}
	
	public double farenheitBP() {
		return (this.boilingPoint * 9/5) + 32;
	}
	
	public double farenheitSP() {
		return (this.smokingPoint * 9/5) + 32;
	}
	
	public String toString() {
		return "Type = " + type +
			   "\nBoiling Point = " + boilingPoint + 
			   " Celcius\nSmoking Point = " + smokingPoint + 
			   " Celcius\nDensity = " + density + " kg/m3";
	}
}
