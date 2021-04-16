package exercise3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Type of Meats");
		System.out.println("************************************************************************************************");
		
		Meat m = new Meat();
		
		System.out.println("************************************************************************************************");
		System.out.println("Type: " + m.type);
		System.out.println("Tenderness (soft/hard): " + m.tenderness);
		System.out.println("Flavour: " + m.flavour);
		System.out.println("Juiciness (true/false): " + m.juiciness);
		System.out.println("Is it can be cooked? (true/false): " + m.canBeCooked);
		System.out.println("It can provide proteins. (Y for Yes/N for No): " + m.provProteins);
		
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("------------------------------------------------------------------------------------------------");
		Meat mm = new Meat("Fish", "soft", "BBQ", true, true, 'Y');
		
		System.out.println("Type of Meats");
		System.out.println("************************************************************************************************");
		System.out.println("Type\tFlavour\t\tTenderness\tJuiciness\tCanBeCooked\tProvideProteins");
		System.out.println(mm.type + "\t" + mm.flavour + "\t\t" + mm.tenderness + "\t\t" + mm.juiciness + "\t\t" + mm.canBeCooked + " \t\t" + mm.provProteins);
		System.out.println("------------------------------------------------------------------------------------------------");
	}

}
