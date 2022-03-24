package assignment4_16RZ28;
/*
 * This Carriage Bolt class has the parent class Bolt, 
 * and is used to print "Carriage Bolt" 
 * part of the information.
 */
public class CarriageBolt extends Bolt {
	
	private static final long serialVersionUID = 4687610067593905026L;

	public CarriageBolt (double length, String ThreadB, String material, String finish, double priceUnit, int unit)  throws IllegalFastener{
		super(length, ThreadB, material,finish, priceUnit,unit);
    }//end CarriageBolt Constructor
    
    public String toString() {
  	  return "Carriage Bolt " + super.toString();
    }//end toString
}//end CarriageBolt class
