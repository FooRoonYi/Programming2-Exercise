package exercise2iv;

public class vegetable {
	String type;
	char color;
	String component;
	float price;
	double kg;
	Boolean info;
	String benefits;
	
	//create setter method 
	public void setType(String type) {
		this.type = type; 
	}
	
	public void setColor(char color) {
		this.color = color;
	}
	
	public void setComponent(String component) {
		this.component = component;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setWeight(double kg) {
		this.kg = kg;
	}
	
	public void setInfo(Boolean info) {
		this.info = info;
	}
	
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	
	//create getter method
	public String getType() {
		return this.type;
	}
	
	public char getColor() {
		return this.color;
	}
	
	public String getComponent() {
		return this.component;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public double getWeight() {
		return this.kg;
	}
	
	public Boolean getInfo() {
		return this.info;
	}
	
	public String getBenefits() {
		return this.benefits;
	}
	
	public void statement() {
		System.out.println(type + " is one of the vegetables with color " + color + " has the price of RM" + price + " and it is " + kg + "kg.");
	}
}
