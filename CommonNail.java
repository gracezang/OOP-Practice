package assignment4_16RZ28;

public class CommonNail extends Nail {
	/*
	 * This CommonNail class has the parent Nail, 
	 * and is used to get " Common Nail,"
	 * part of the information.
	 */
	private static final long serialVersionUID = -6588262505395070778L;

	public CommonNail(String sizes, double lengthN, double gauge, String finishN, double priceUnit, int unit)  throws IllegalFastener{
    	super(sizes,lengthN, gauge, finishN, priceUnit, unit);
    }//end CommonNail
    
    public String toString() {
  	  return "Common Nail, " + super.toString();
    }//end toString
}//end CommonNail class
