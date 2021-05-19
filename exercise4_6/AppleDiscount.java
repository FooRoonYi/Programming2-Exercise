package exercise4_6;

//apple discount
class AppleDiscount implements Discount{
	
	public double rateOfDiscount() { //same method as in rateOfDiscount
		return 0.25; //with body
	}
}

//red apple discount
class RedAppleDiscount implements Discount{
	
	public double rateOfDiscount() { //same method as in rateOfDiscount
		return 0.15; //with body
	}
}

//green apple discount
class GreenAppleDiscount implements Discount{
	
	public double rateOfDiscount() { //same method as in rateOfDiscount
		return 0.10; //with body
	}
}

//durian discount
class DurianDiscount implements Discount{
	
	public double rateOfDiscount() { //same method as in rateOfDiscount
		return 0.20; //with body
	}
}

//mango discount
class MangoDiscount implements Discount{
	
	public double rateOfDiscount() { //same method as in rateOfDiscount
		return 0.18; //with body
	}
}