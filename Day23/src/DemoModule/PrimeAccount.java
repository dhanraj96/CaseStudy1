package DemoModule;

abstract class PrimeAccount extends ShopAccount {
	private boolean isPrime;
		 private float DeliveryCharges;
		 
		 public PrimeAccount(int AccountNumber, String AccountName, float Charges, boolean isPrime) {
			 super();
			// TODO Auto-generated constructor stub
		}
		public void setisPrime(boolean l) { //starts getters and setters of Prime Account
			 isPrime = l;
		 }
		 public boolean getisPrime() {
			 return isPrime;
		 }
		 public void setdc(float m) {
			 DeliveryCharges = m;
		 }
		 public float getdc() {
			 return DeliveryCharges;
		 }                                 //End of getters and setters
		 
		 public void bookproduct() {
		}
		 
		 public String toString() {
			 String demo ="demo 1";
			return demo;
		}
public static void main(String[] args) {
		

	}

}
