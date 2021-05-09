package exercise4_5;

//abstract class implements interface
//lebih kurang sama dengan inherit guna extends
//apple discount
class AppleDiscount implements Discount{
	
	//abstract class contain abstract method
	//method implementation
	public float rateOfDiscount() {
		return 0.25f;
	}
	
}

//red apple discount
class RedAppleDiscount implements Discount{
	
	//abstract class contain abstract method
	//method implementation
	public float rateOfDiscount() {
		return 0.15f;
	}
	
} //end class RedAppleDiscount

//green apple discount
class GreenAppleDiscount implements Discount{

	//abstract class contain abstract method
	//method implementation
	public float rateOfDiscount() {
		return 0.12f;
	}
	
} //end class GreeenAppleDiscount

//durian discount
class DurianDiscount implements Discount{
	
	//abstract class contain abstract method
	//method implementation
	public float rateOfDiscount() {
		return 0.18f;
	}
	
} //end class DurianDiscount


//mango discount
class MangoDiscount implements Discount{
	
	//abstract class contain abstract method
	//method implementation
	public float rateOfDiscount() {
		return 0.10f;
	}
	
} //end class MangoDiscount
