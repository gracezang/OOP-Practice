package assignment4_16RZ28;

public class WoodScrew extends Screw {
	/*
	 * This WoodScrew class has the parent class Screw, 
	 * and is used to get "Wood Screw, "
	 * part of the information.
	 */
	private static final long serialVersionUID = 6962598207492666418L;

	public WoodScrew(double length, String Thread, String material, String finish, String head, String Drive, String point, double priceUnit, int unit)  throws IllegalFastener{
    	super(length, Thread, material,finish, head, Drive,point,priceUnit,unit);
    }// end WoodScrew constructor
    
    public String toString() {
  	  return "Wood Screw, " + super.toString();
    }// end toString mutator
}// end WoodScrew class
