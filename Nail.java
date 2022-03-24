package assignment4_16RZ28;

public class Nail extends SizesNails {
	/*
	 * This Nail class has the parent SizesNails, 
	 * and is used to get " 10D size,"
	 * part of the information.
	 */
	private static final long serialVersionUID = 2181560487799992218L;

	public Nail(String sizes, double lengthN, double gauge, String finishN, double priceUnit, int unit)  throws IllegalFastener{
    	super(sizes,lengthN, gauge,finishN, priceUnit, unit);
    }//end Nail constructor
    
    public String toString() {
  	  return super.toString();
    }// end toString
}
