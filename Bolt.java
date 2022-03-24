package assignment4_16RZ28;
/*
 * This Bolt class has the parent class LengthBolt, 
 * and is used to connect between CarriageBolt and LengthBolt"
 * part of the information.
 */

public class Bolt extends LengthBolt {
	
	private static final long serialVersionUID = -6523493050211328846L;

	public Bolt (double length, String ThreadB, String material, String finish, double priceUnit, int unit)  throws IllegalFastener{
		super(length, ThreadB, material,finish, priceUnit,unit);
    }//end Bolt constructor
    
    public String toString() {
  	  return super.toString();
    }//end toString
}//end Bolt class
