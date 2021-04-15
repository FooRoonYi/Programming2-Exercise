package quiz;

public class Main {

	public static void main(String[] args) {
		
		CookingOil oil = new CookingOil();
		
		System.out.println("Cooking Oil: ");
		System.out.println("======================================================");
		
		oil.setType("Olive Oil");
		oil.setMadeOf("olive");
		oil.setBP(700);
		oil.setSP(190);
		oil.setDensity(0.917);
		oil.setPrice(10);
		
		System.out.println("Type: " + oil.gettype());
		System.out.println("It is made of:  " + oil.getMadeOf());
		System.out.println("Boiling point:  " + oil.getBoilingPoint());
		System.out.println("Smoking Point:  " + oil.getSmokingPoint());
		System.out.println("Density:  " + oil.getDensity());
		System.out.println("Price:  " + oil.getPrice());
		
	}

}
