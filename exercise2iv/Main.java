package exercise2iv;

public class Main {

	public static void main(String[] args) {
		
		vegetable a  = new vegetable();
		
		System.out.println("Vegetables: ");
		System.out.println("======================================================");
		
		a.setType("Tomato");
		a.setColor('r');
		a.setComponent("fibres");
		a.setPrice(2);
		a.setWeight(0.275);
		a.setInfo(true);
		a.setBenefits("provide mineralss and fibres, prevent contipation, reduce risk of diseases");
		
		System.out.println("Type: " + a.getType());
		System.out.println("Color (r for red, g for green, y for yellow, ...): " + a.getColor());
		System.out.println("Component: " + a.getComponent());
		System.out.println("Price: RM" + a.getPrice());
		System.out.println("Weight: " + a.getWeight() + "kg.");
		
		System.out.println("======================================================");
		System.out.println("Does it can be eaten? (True/False): " + a.getInfo());
		System.out.println("Benefits: " + a.getBenefits());
		
		a.statement();
	}

}
