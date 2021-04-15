package quiz;

public class CookingOil {
	
	String type;
	String madeOf;
	Float boilingPoint;
	Float smokingPoint;
	double density;
	int price;
	
	//create setter method
	public void setType(String type) {
		this.type = type;
	}
	
	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}
	
	public void setBP(float boilingPoint) {
		this.boilingPoint = boilingPoint;
	}
	
	public void setSP(float smokingPoint) {
		this.smokingPoint = smokingPoint;
	}
	
	public void setDensity(double density) {
		this.density = density;
	}
	
	public void setPrice(int price) {
		this.price = price;
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
