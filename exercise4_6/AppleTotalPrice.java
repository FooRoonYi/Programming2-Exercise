package exercise4_6;

//total price for APPLE
class AppleTotalPrice implements PriceFruits{
	
	double a = 2.99; //a for apple quantity >=10 & <=75
	double aa = 1.99; //aa for apple quantity >100
	
	public double totalPrice(double qt) {
		return a*qt;
	}
	
	public double totalPrice(double disc, double qt) {
		return (aa*qt)*(1-disc);
	}
	
}

//total price for RED APPLE
class RedAppleTotalPrice implements PriceFruits{
	
	double ra = 1.65; //ra for red apple quantity >=10 & <=75
	double raa = 0.88; //raa for apple quantity >100
	
	public double totalPrice(double qt) {
		return ra*qt;
	}
	
	public double totalPrice(double disc, double qt) {
		return (raa*qt)*(1-disc);
	}
	
}

//total price for GREEN APPLE
class GreenAppleTotalPrice implements PriceFruits{
	
	double ga = 1.88; //ga for green apple quantity >=10 & <=75
	double gaa = 0.92; //gaa for green apple quantity >100
	
	public double totalPrice(double qt) {
		return ga*qt;
	}
	
	public double totalPrice(double disc, double qt) {
		return (gaa*qt)*(1-disc);
	}
	
}

//total price for DURIAN
class DurianTotalPrice implements PriceFruits{
	
	double d = 25; //d for durian quantity >=10 & <=75
	double dd = 12; //dd for durian quantity >100
	
	public double totalPrice(double qt) {
		return d*qt;
	}
	
	public double totalPrice(double disc, double qt) {
		return (dd*qt)*(1-disc);
	}
	
}

//total price for MANGO
class MangoTotalPrice implements PriceFruits{
	
	double m = 6.50; //m for mango quantity >=10 & <=75
	double mg = 4.50; //mg for mango quantity >100
	
	public double totalPrice(double qt) {
		return m*qt;
	}
	
	public double totalPrice(double disc, double qt) {
		return (mg*qt)*(1-disc);
	}
	
}