package fruits;

public class GreenApple extends Apple{

		private String taste;
		private boolean difference;
		
		public GreenApple(String name, int q, double p, String t, boolean d) {
			super(name, q, p);
			this.taste = t;
			this.difference = d;
			
			System.out.println("Green Apple constructor is invoked");
		}
		
		public String tasteGreenApple() {
			return this.taste;
		}
		
		public double calprice() {
			return super.price * super.quantity;
		}
		
		public boolean differ() {
			return this.difference;
			
		}
}
