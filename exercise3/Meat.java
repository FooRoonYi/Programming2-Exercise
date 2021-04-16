package exercise3;
import java.util.*;
public class Meat {
	
	String type;
	String flavour;
	Boolean juiciness;
	Boolean canBeCooked;
	String tenderness;
	char provProteins;
	
	Scanner sc = new Scanner(System.in);
	
		//default constructor
		Meat(){
			
			System.out.println("Type: ");
			this.type = sc.nextLine();
			
			System.out.println("Flavour: ");
			this.flavour = sc.nextLine();
			
			System.out.println("Tenderness (soft/hard): ");
			this.tenderness = sc.nextLine();
			
			System.out.println("Juiciness (true/false): ");
			this.juiciness = sc.nextBoolean();
			
			System.out.println("Is it can be cooked? (true/false): ");
			this.canBeCooked = sc.nextBoolean();
			
			System.out.println("It can provide proteins. (Y for Yes/N for No)");
			this.provProteins = sc.next().charAt(0);
		}
		
		//parameterized constructor
		Meat(String t, String tdn, String f, Boolean j, Boolean c, char p){
			this.type = t;
			this.flavour = f;
			this.tenderness = tdn;
			this.juiciness = j;
			this.canBeCooked = c;
			this.provProteins = p;
		}
}
