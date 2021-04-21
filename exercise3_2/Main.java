package exercise3_2;

import java.text.DecimalFormat;

public class Main {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main(String[] args) {
		
		System.out.println("============================================");
		System.out.println("=     TYPES OF COOKING OILS WITH INFO      =");
		System.out.println("============================================");
		
		SunflowerOil objSun = new SunflowerOil();
		OliveOil objOlive = new OliveOil("Olive Oil", 299, 207, 0.920);
	
		System.out.println();
		System.out.println("-----(Cooking Oil 1 INFORMATION)-----");
		System.out.println(objSun);
		System.out.println("Boiling Point(F): " + df2.format(objSun.farenheitBP()));
		System.out.println("Smoking Point(F): " + df2.format(objSun.farenheitSP()));
		System.out.println("Density\t\t: " + df2.format(objSun.getDensity()));
		
		System.out.println();
		System.out.println("--------(Cooking Oil 2 INFORMATION)--------");
		System.out.println(objOlive);
		System.out.println("Boiling Point(K): " + df2.format(objOlive.kelvinBP()));
		System.out.println("Smoking Point(K): " + df2.format(objOlive.kelvinSP()));
		System.out.println("Density\t\t: " + df2.format(objOlive.getDensity()));
	}
}
