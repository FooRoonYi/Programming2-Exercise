package exercise4_5;

import java.text.DecimalFormat;

public class Mango extends Fruit{
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	private String size;
	private int weight, quantity;
	private double price, p2, p3, disc;
	
	public Mango(String name, String s, int w, double p, int q) { //constructor sub class with argument
		super(name); //called method in superclass with passing parameter
		this.size = s;
		this.weight = w;
		this.price = p;
		this.quantity = q;
		
		//System.out.println("Mango constructor is invoked");
		
		if(this.size.equals("baby size")) { //baby size
			sizeMango();
			System.out.println(name);
			System.out.println("There if NO DISCOUNT even you buy more!");
			System.out.println("If it is baby mango, then it is " + (double)weightMango()/1000 + " kg.");
		} else if(this.size.equals("medium size")) { //medium size
			int qty = 6;
			
			Discount ds = new MangoDiscount(); //create new object (for medium size mango)
			System.out.println("DISCOUNT: " + ds.rateOfDiscount()); //discount for medium size
			disc = ds.rateOfDiscount();
			p2 = 4 * (1 - disc);
			
			totalPrice(p2);
			
			System.out.println(name);
			System.out.println("If you buy more medium size mango, Total Discount Price: RM" + df2.format(totalPrice(p2)));
			System.out.println("If it is medium size mango with " + qty + " mangoes in 1kg,  then it is " + (double)weightMango(q)/1000 + " kg.");
		} else { //king size
			String siz = "king size";
			int qt = 2;
			p3 = 20;
			
			Discount dis = new MangoDiscount(); //create new object (discount for king size mango)
			System.out.println("DISCOUNT: " + dis.rateOfDiscount()); //discount for king size
			disc = dis.rateOfDiscount();

			totalPrice(disc, p3);
			
			System.out.println(name);
			System.out.println("If you buy more king size mango, Total Discount Price: RM" + df2.format(totalPrice(disc, p3)));
			System.out.println("If it is " + siz + " mango with quantity of " + qt +  ",  then it is " + weightMango(siz, qt) + " kg.");
		}
	}
	
	public double totalPrice() { //overloading method with no argument
		return this.price * this.quantity;
	}
		
	public double totalPrice(double p2) { //overloading method with one argument
		return p2 * this.quantity;
	}
		
	public double totalPrice(double disc, double p3) { //overloading method with two arguments
		return (p3*this.quantity) * (1-disc);
	}
		
	public int weightMango() { //overloading method with no argument
		return this.weight;
	}
	
	public int weightMango(int q) { //overloading method with one argument
		return this.weight * q;
	}
	
	public int weightMango(String siz, int qt) { //overloading method with two arguments
		return (this.weight * qt)/1000;
	}
	
	public String sizeMango() {
		return this.size;
	}
	
	public String printEvidence() { //overriding
		return "\nIf you consume more " + size.toUpperCase() + " " + name.toUpperCase() + " then it leads to weight gain.";
	}
	
	public String toString() { //overriding method
		return "Type\t\t\t\t: " + name +
			   "\nSize of the mango\t\t: " + size +
			   "\nWeight of " + size + " mango\t: " + weight + " g" +
			   "\nQuantity\t\t\t: " + quantity + 
			   "\nPrice\t\t\t\t: RM " + price +
			   "\nDiscount\t\t\t: " + df2.format(disc) + 
			   "\nTotal Price (without discount)  : RM " + df2.format(totalPrice()) +
			   printEvidence();
		
	}
	
}