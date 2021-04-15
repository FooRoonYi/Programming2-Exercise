package quiz;

public class Main {

	public static void main(String[] args) {
		
		
		CookingOil oil = new CookingOil();
		
		System.out.println("Cooking Oil: ");
		System.out.println("======================================================");
		
		oil.setType();
		oil.setMadeOf();
		oil.setBP();
		oil.setSP();
		oil.setDensity();
		oil.setPrice();
		
		oil.getType();
		oil.getMadeOf();
		oil.getBoilingPoint();
		oil.getSmokingPoint();
		oil.getDensity();
		oil.getPrice();
		
	}

}
