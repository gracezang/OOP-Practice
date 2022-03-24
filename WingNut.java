package assignment4_16RZ28;

public class WingNut extends InnerThreaded {
	/*
	 * This WingNut class has the parent class InnerThreaded 
	 * and is used to get "Wing Nut"
	 * part of the information.
	 */
	private static final long serialVersionUID = -3191488897078437619L;

	public WingNut(String ThreadB, String material, String finish, double priceUnit, int unit)  throws IllegalFastener{
		super(ThreadB, material,finish,priceUnit, unit);
	}//end WingNut constructor
    
    public String toString() {
  	  return "Wing Nut " + super.toString();
    }//end toString mutator
}// end WingNut class


