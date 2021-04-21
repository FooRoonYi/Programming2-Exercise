package exercise3_2;

public class OliveOil extends SunflowerOil{
	
	OliveOil(String t, int bp, int sp, double d) {
		super(t, bp, sp, d);
	}

	public double kelvinBP() {
		return getBoilingPoint() + 273.15;
	}
	
	public double kelvinSP() {
		return getSmokingPoint() + 273.15;
	}
	
	public String toString() {
		return "Type = " + getType() +
			   "Boiling Point = " + getBoilingPoint() +
			   "Celcius\nSmoking Point = " + getSmokingPoint() +
			   "Celcuis\nDensity = " + getDensity() + " kg/m3";
	}

}
