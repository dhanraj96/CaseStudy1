package DemoModule;


abstract class ShopAccount{
	 private int AccountNumber;
	 private String  AccountName;
     private float charges;   
 
	public void setAccountNumber(int i) {
		AccountNumber = i;
	}	
	 public int getAccountNumber()
	    {
			return AccountNumber;
		}
    public void AccountName(String j) {
    	AccountName = j;
    }
    public String gettAccountName() {
    	return AccountName ;
    }
    public void setcharges(float k) {
    	charges = k;
    }
    public float getcharges() {
    	return charges;
    }
      
    public abstract void bookproduct();
    
    public void items() {
    	
    }
    public abstract String toString();
}




public class CaseStudy1 {

	public static void main(String[] args) {
		

	}

}
